package ui.components

import ColorAccentGreen
import ColorBackground2
import ColorTextGray
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
 * Card Row
 * Created By Trian Damai
 * https://github.com/triandamai
 * Created At 11/12/21 00.39
 */
@Composable
fun CardRow(
    modifier: Modifier=Modifier
) {
    Row(
        modifier=modifier
            .background(ColorBackground2)
            .padding(start = 16.dp, end = 16.dp)
            .fillMaxWidth()
            .height(66.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row (
            verticalAlignment = Alignment.CenterVertically
                ){
            Image(painter = painterResource("images/dummy_user.png"), contentDescription = "")
            Spacer(modifier=modifier.width(8.dp))
            Text(
                "Eren Jaeger",
                color = ColorTextGray
            )
        }
        Column {
            Text(
                "Spicy Seasoned",
                        color = ColorTextGray
            )
            Text(
                "seafood noodles",
                color = ColorTextGray
            )
        }
        Text(
            "$ 125",
            color = ColorTextGray
        )

        ItemStatus()
    }
}