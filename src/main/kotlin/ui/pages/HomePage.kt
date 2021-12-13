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
import compose.icons.Octicons
import compose.icons.octicons.*
import ui.components.*

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

        BaseContent {
            left(
                size = 633.dp,
                paddingStart = 10.dp,
                paddingEnd = 10.dp,
                paddingBottom = 16.dp,
                paddingTop = 16.dp,
                header = {
                    HeaderContent()
                }
            ) {
                LazyVerticalGrid(cells = GridCells.Fixed(3)) {
                    items(count = 10, itemContent = {
                        CardItems()
                    })
                }
            }
            right(
                size = 409.dp,
                paddingStart = 10.dp,
                paddingEnd = 10.dp,
                backgroundColor = ColorBackground2,
            ) {
                Scaffold(
                    backgroundColor = ColorBackground2,
                    topBar = {
                        HeaderCart()
                    },
                    bottomBar = {
                        FooterCart()
                    }
                ) {
                    Column(
                        modifier = Modifier.fillMaxHeight()
                    ) {
                        LazyColumn(
                            modifier = Modifier.padding(
                                horizontal = 16.dp
                            )
                        ) {
                            items(count = 8, itemContent = {
                                CardItemsCart()
                            })
                            item {
                                Spacer(modifier = Modifier.height(200.dp))
                            }
                        }

                    }

                }

            }

        }

}