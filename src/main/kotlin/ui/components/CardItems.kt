package ui.components

import ColorBackground2
import ColorTextGray
import ColorWhite
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

/**
 * CardItems
 * Created By Trian Damai
 * https://github.com/triandamai
 * Created At 11/12/21 00.57
 */
@Composable
fun CardItems(
    modifier: Modifier=Modifier
) {
    Box(
        modifier=modifier
            .width(192.dp)
            .height(260.dp)
    ){

        Column(
            modifier=modifier
                .align(Alignment.BottomCenter)
                .clip(RoundedCornerShape(10.dp))
                .background(ColorBackground2)
                .width(192.dp)
                .height(226.dp).padding(bottom = 14.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                "Spicy Seasoned",
                color = ColorWhite
            )
            Text(
                "Seafood noodles",
                color = ColorWhite)
            Spacer(modifier=modifier.height(10.dp))
            Text(
                "$ 2.29",
                color = ColorTextGray
            )
            Spacer(modifier=modifier.height(10.dp))
            Text(
                "200 bowls available",
                color = ColorTextGray
            )
        }
        Image(
            painter = painterResource("images/dummy_item.png"),
            contentDescription = "",
            modifier=modifier.size(132.dp).align(Alignment.TopCenter)
        )
    }
}