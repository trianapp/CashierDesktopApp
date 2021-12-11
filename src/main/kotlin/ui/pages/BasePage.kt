package ui.pages

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

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
    fun sidebarLeft(content:@Composable ()->Unit)=
        content.invoke()

    @content
    @Composable
    fun content(content:@Composable ()->Unit) {
        content.invoke()
    }

    @sidbarRight
    @Composable
    fun sidebarRight(content:@Composable ()->Unit) {
        content.invoke()
    }

}


@Composable
fun BasePage(
    modifier: Modifier=Modifier,
    content: @Composable BasePageUI.()->Unit
){
    val ui = BasePageUI()

    Row {
        content.invoke(ui)
    }

}