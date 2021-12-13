package ui.pages

import ColorBackground1
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import ui.components.*

/**
 * Dashboard page
 * Created By Trian Damai
 * https://github.com/triandamai
 * Created At 11/12/21 22.25
 */

@Composable
fun DashboardPage() {
    BaseContent {
        left(
            size = 633.dp,
            paddingStart = 10.dp,
            paddingEnd = 10.dp,
            paddingTop = 10.dp,
            paddingBottom = 10.dp,
            header = {
                HeaderDashboard() }
        ) {
            LazyColumn {
                item {
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth().padding(top = 16.dp, bottom = 16.dp)
                    ) {
                        CardSummary()
                        CardSummary()
                        CardSummary()
                    }
                }
                item {
                    HeaderTableDashboard()
                }
                items(count = 8, itemContent = {
                    CardRow()
                })
            }
        }
        right(
            size = 409.dp,
            paddingStart = 10.dp,
            paddingEnd = 10.dp,
            paddingTop = 10.dp,
            paddingBottom = 10.dp,
        ) {
            CardContentMostOrdered()
            CardCntentMostTypeOrdered()
        }
    }

}