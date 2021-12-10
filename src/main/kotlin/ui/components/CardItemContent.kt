package ui.components

import ColorPrimary
import ColorTextGray
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import compose.icons.Octicons
import compose.icons.octicons.Heart16
import compose.icons.octicons.Heart24

/**
 * Item COntent
 * Created By Trian Damai
 * https://github.com/triandamai
 * Created At 11/12/21 00.21
 */
@Composable
fun CardItemContent(
    modifier: Modifier=Modifier,
    active:Boolean
) {
    Box(
        modifier=modifier
            .width(275.dp)
            .height(87.dp)
            .background(if(active) ColorPrimary.copy(
                alpha = 0.2f
            ) else Color.Transparent)
    ){
        Row(
            modifier=modifier.align(Alignment.Center)
        ) {
            Icon(
                Octicons.Heart16,
                contentDescription = "",
                tint = if(active) ColorPrimary else ColorTextGray
            )
            Spacer(modifier=modifier.width(10.dp))
            Column {
                Text(
                    "Appearance",
                    style = MaterialTheme.typography.body1,
                    color = if(active) ColorPrimary else ColorTextGray
                )
                Spacer(modifier=modifier.height(10.dp))
                Text(
                    "Dark And Light mode, Font Size",
                    color = ColorTextGray
                )
            }
        }
        Box(modifier
            .align(Alignment.CenterEnd)
            .height(39.dp)
            .width(4.dp)
            .clip(RoundedCornerShape(20.dp))
            .background(ColorPrimary)
        ) {  }
    }
}