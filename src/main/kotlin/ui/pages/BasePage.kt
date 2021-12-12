package ui.pages

import ColorBackground1
import ColorBackground2
import ColorBackgroundDarkLine
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
annotation class sidbarLeft
@DslMarker
annotation class content
@DslMarker
annotation class sidbarRight


class BasePageUI{
    @sidbarLeft
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
        header: @Composable () -> Unit,
        footer: @Composable () -> Unit,
        content:@Composable ()->Unit
    ) {
        Box(
            modifier = Modifier
                .padding(horizontal = 25.dp)
        ){
            Column(
                modifier = Modifier
                    .width(633.dp)
                    .padding(
                        top = 20.dp,
                        bottom = 20.dp
                    )
            ) {
                header.invoke()
                content.invoke()
                footer.invoke()
            }
        }

    }

    @sidbarRight
    @Composable
    fun sidebarRight(
        backgroundColor:Color=ColorBackground2,
        header:@Composable ()->Unit,
        footer:@Composable ()->Unit,
        content:@Composable ()->Unit
    ) {
        Scaffold(
            backgroundColor = backgroundColor,
            topBar = {
               header.invoke()
            },
            bottomBar = {
                footer.invoke()
            }
        ) {
            Column(
                modifier = Modifier.fillMaxHeight().width(409.dp).background(backgroundColor)
            ) {
                content.invoke()
            }

        }

    }

}

class BaseSettingPageUI{
    @sidbarLeft
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
        header: @Composable () -> Unit,
        footer: @Composable () -> Unit,
        content:@Composable ()->Unit
    ) {
        Box(
            modifier = Modifier
                .padding(horizontal = 25.dp)
        ){
            Column(
                modifier = Modifier
                    .width(633.dp)
                    .padding(
                        top = 20.dp,
                        bottom = 20.dp
                    )
            ) {
                header.invoke()
                content.invoke()
                footer.invoke()
            }
        }

    }

    @sidbarRight
    @Composable
    fun sidebarRight(
        backgroundColor:Color=ColorBackground2,
        header:@Composable ()->Unit,
        footer:@Composable ()->Unit,
        content:@Composable ()->Unit
    ) {

        Scaffold(
            backgroundColor = backgroundColor,
            topBar = {
                header.invoke()
            },
            bottomBar = {
                footer.invoke()
            }
        ) {
            Column(
                modifier = Modifier.fillMaxHeight().width(409.dp).background(backgroundColor)
            ) {
                content.invoke()
            }

        }

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