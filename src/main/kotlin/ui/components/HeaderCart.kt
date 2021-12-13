package ui.components

import ColorWhite
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/**
 * Header Cart
 * Created By Trian Damai
 * https://github.com/triandamai
 * Created At 11/12/21 21.41
 */
var listItem = listOf("Dine In","Delivery","To Go")
@Composable
fun HeaderCart(
    modifier: Modifier=Modifier
) {
    Column(
        modifier=modifier
            .padding(all = 16.dp)
        .fillMaxWidth()
    ) {
        Text(
            "Order #2345",
            color = ColorWhite,
            style = MaterialTheme.typography.h2
        )
        Spacer(modifier=modifier.height(16.dp))
        LazyRow {
            items(count = listItem.size, itemContent = {
                index->
                ButtonTab(text=listItem[index], active = ((index%2)==0))
            })
        }
        Spacer(modifier=modifier.height(16.dp))
        Row(
            horizontalArrangement = Arrangement.Start,
            modifier = modifier.fillMaxWidth()
        ) {

            Row (
                modifier = modifier.width(297.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Text(
                    "Item",
                    color = ColorWhite
                )
                Text(
                    "Qty",
                    color = ColorWhite
                )
            }
            Row {
                Spacer(modifier=modifier.width(8.dp))
                Text(
                    "Price",
                    color = ColorWhite
                )
            }
        }
        Spacer(modifier=modifier.height(10.dp))
        Divider()
    }
}