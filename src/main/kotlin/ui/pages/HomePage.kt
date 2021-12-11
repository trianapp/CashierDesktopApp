package ui.pages

import ColorBackground2
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ui.components.CardDish
import ui.components.CardItemContent
import ui.components.CardItems
import ui.components.HeaderContent

/**
 * HomePage
 * Created By Trian Damai
 * https://github.com/triandamai
 * Created At 11/12/21 14.27
 */


@ExperimentalFoundationApi
@Composable
fun HomePage(
    modifier: Modifier=Modifier
){
    BasePage {
        sidebarLeft {

        }
        content {
            HeaderContent()
            LazyVerticalGrid(cells = GridCells.Fixed(3)){
                items(count = 10, itemContent = {
                    CardItems()
                })
            }
        }
        sidebarRight {
            Text("hai right")
        }
    }
}