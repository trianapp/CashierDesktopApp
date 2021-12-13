package ui.components

import ColorBackground2
import ColorTextGray
import ColorWhite
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp

/**
 * Most ordered COntent
 * Created By Trian Damai
 * https://github.com/triandamai
 * Created At 12/12/21 13.13
 */
@Composable
fun CardContentMostOrdered(
    modifier: Modifier=Modifier
) {
    Box(
        modifier = modifier
            .width(372.dp)
            .height(429.dp)
            .padding(all = 16.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(ColorBackground2)
    ){
        Column(
            modifier=modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(top=16.dp, bottom = 16.dp, start = 16.dp, end = 16.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                modifier=modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("Most Ordered",
                    style = MaterialTheme.typography.h2, color = ColorWhite
                )
                DropDownButton()
            }
            Spacer(modifier.height(10.dp))
            Divider(
                color = ColorTextGray
            )
            Spacer(modifier.height(10.dp))
            LazyColumn {
                item { Spacer(modifier.height(8.dp)) }
                items(count = 3, itemContent = {
                    CardItemMostOrder()
                })
                item { Spacer(modifier.height(8.dp)) }
            }

            ButtonSecondary("View All",modifier=modifier.fillMaxWidth(), onClick = {})
        }

    }
}