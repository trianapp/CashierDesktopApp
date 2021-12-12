package ui.pages

import ColorBackground2
import ColorWhite
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ui.components.*

/**
 * HomePage
 * Created By Trian Damai
 * https://github.com/triandamai
 * Created At 11/12/21 14.27
 */


@ExperimentalFoundationApi
@Composable
fun SettingPage(
    modifier: Modifier=Modifier
){
    BasePage {
        sidebarLeft {

        }
        content(
            header = {
                HeaderContent()
            },
            footer = {}
        ) {

            LazyVerticalGrid(cells = GridCells.Fixed(3)){
                items(count = 10, itemContent = {
                    CardItems()
                })
            }
        }
        sidebarRight(
            backgroundColor = ColorWhite,
            header = {
                HeaderCart()
            },
            footer = {
                FooterCart()
            }) {
            LazyColumn(
                modifier=modifier.padding(
                    horizontal = 16.dp
                )
            ) {
                items(count = 8, itemContent = {
                    CardItemsCart()
                })
                item {
                    Spacer(modifier=modifier.height(200.dp))
                }
            }
        }
    }
}