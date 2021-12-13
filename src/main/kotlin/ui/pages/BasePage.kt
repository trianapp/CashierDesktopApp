package ui.pages

import ColorBackground1
import ColorBackground2
import ColorBackgroundDarkLine
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Scaffold
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import ui.components.CardItemsCart
import ui.components.FooterCart
import ui.components.HeaderCart

/**
 * BasePage
 * Created By Trian Damai
 * https://github.com/triandamai
 * Created At 11/12/21 14.30
 */



@DslMarker
annotation class sidebar
@DslMarker
annotation class content

@DslMarker
annotation class leftSide
@DslMarker
annotation class rightSide

class BasePageContent{
    @leftSide
    @Composable
    fun left(
        size:Dp=0.dp,
        paddingStart:Dp=0.dp,
        paddingEnd:Dp=0.dp,
        paddingTop:Dp=0.dp,
        paddingBottom:Dp=0.dp,
        backgroundColor: Color=ColorBackground1,
        header: @Composable () -> Unit ={},
        footer: @Composable () -> Unit={},
        content: @Composable () -> Unit
    ){

        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(8.dp))
                .background(backgroundColor)
                .padding(
                    top = paddingTop,
                    bottom = paddingBottom,
                    start = paddingStart,
                    end = paddingEnd
                )
        ){
            Column(
                modifier = Modifier
                    .width(size)
            ) {
                header.invoke()
                content.invoke()
                footer.invoke()
            }
        }

    }

    @rightSide
    @Composable
    fun right(
        size:Dp=0.dp,
        paddingStart:Dp=0.dp,
        paddingEnd:Dp=0.dp,
        paddingTop:Dp=0.dp,
        paddingBottom:Dp=0.dp,
        backgroundColor: Color=ColorBackground1,
        header: @Composable () -> Unit={},
        footer: @Composable () -> Unit={},
        content:@Composable () -> Unit
    ){

        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(8.dp))
                .background(backgroundColor)
                .padding(
                    top = paddingTop,
                    bottom = paddingBottom,
                    start = paddingStart,
                    end = paddingEnd
                )
        ){
            Column(
                modifier = Modifier
                    .width(size)

            ) {
                header.invoke()
                content.invoke()
                footer.invoke()
            }
        }

    }
}


class BasePageUI{
    @sidebar
    @Composable
    fun sidebarLeft(content:@Composable ()->Unit){
        Column (modifier=Modifier
            .fillMaxHeight()
            .width(104.dp)
            .background(ColorBackground2)
        ){
            content.invoke()
        }
    }

    @content
    @Composable
    fun content(
        content:@Composable BasePageContent.()->Unit
    ) {
        val baseContent = BasePageContent()

        Box(
            modifier = Modifier
        ){
            Row  (
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                content.invoke(baseContent)
            }
        }

    }

}

@Composable
fun BaseContent(
    modifier: Modifier=Modifier,
    content:@Composable BasePageContent.() -> Unit
){
    val ct = BasePageContent()
    Row {
        content.invoke(ct)
    }

}

@Composable
fun BasePage(
    modifier: Modifier=Modifier,
    content: @Composable BasePageUI.()->Unit
){
    val ui = BasePageUI()

    Row(modifier = modifier
        .fillMaxSize()
        .background(ColorBackground1)) {
        content.invoke(ui)
    }

}