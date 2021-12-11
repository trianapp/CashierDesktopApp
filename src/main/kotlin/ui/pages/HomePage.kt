package ui.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

/**
 * HomePage
 * Created By Trian Damai
 * https://github.com/triandamai
 * Created At 11/12/21 14.27
 */


@Composable
fun HomePage(
    modifier: Modifier=Modifier
){
    BasePage {
        sidebarLeft {
            Text("hai left")
        }
        content {
            Text("hai content")
        }
        sidebarLeft {
            Text("hai right")
        }
    }
}