package ui.components

import ColorTextGray
import ColorWhite
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

/**
 * Item Most Order
 * Created By Trian Damai
 * https://github.com/triandamai
 * Created At 11/12/21 00.52
 */
@Composable
fun CardItemMostOrder(
    modifier: Modifier=Modifier
) {
    Row(
        modifier=modifier
            .padding(top = 6.dp, bottom = 6.dp)
            .width(271.dp)
            .height(56.dp)
    ) {
        Image(
            painter = painterResource("images/dummy_item.png"),
            modifier = modifier.size(56.dp),
            contentDescription = ""
        )
        Spacer(modifier=modifier.width(10.dp))
        Column {
            Text(
                "Spicy seasoned seafood noodles",
                color = ColorWhite
            )
            Text(
                "200 ordered",
                color = ColorTextGray
            )
        }
    }
}