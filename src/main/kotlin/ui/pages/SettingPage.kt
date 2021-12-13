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
   Column (

   ) {
       HeaderSetting()
       BaseContent {
        Row {
            Spacer(modifier.width(16.dp))
            left(
                size = 260.dp,
                backgroundColor = ColorBackground2
            ){

                LazyColumn() {
                    items(count = 7, itemContent = {
                            index->
                        CardItemContent(active = index==3)
                    })

                }

            }
            Spacer(modifier.width(16.dp))
            right(
                size=743.dp,
                backgroundColor = ColorBackground2,
                paddingStart = 16.dp,
                paddingEnd = 16.dp,
                paddingBottom = 16.dp,
                paddingTop = 16.dp,
            ) {
                Scaffold(
                    backgroundColor = ColorBackground2,
                    modifier = modifier.height(633.dp),
                    topBar = {
                        HeaderContentSetting()
                    },
                    bottomBar = {
                        FooterContentSetting()
                    }
                ) {
                    Column(
                        modifier = Modifier.fillMaxHeight()
                    ) {
                        LazyVerticalGrid(
                            modifier=modifier.fillMaxWidth(),
                            cells = GridCells.Fixed(3)
                        ){
                            items(count = 10, itemContent = {
                                CardDish()
                            })
                        }

                    }

                }

            }
        }
       }
   }
}