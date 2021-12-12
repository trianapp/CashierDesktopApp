package ui.components

import ColorTextGray
import ColorWhite
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import compose.icons.Octicons
import compose.icons.octicons.ChevronDown16
import compose.icons.octicons.Search16

/**
 * Header Dashboard
 * Created By Trian Damai
 * https://github.com/triandamai
 * Created At 11/12/21 22.27
 */
@Composable
fun HeaderDashboard(
    modifier:Modifier=Modifier
) {
    Column() {
                Text(
                    "Resto Jaeger",
                    style = MaterialTheme.typography.h1,
                    color = ColorWhite
                )
                Spacer(modifier.height(6.dp))
                Text(
                    "Saturday 11 December 2021",
                    style = MaterialTheme.typography.caption,
                    color = ColorTextGray
                )
        }
        Spacer(modifier.height(15.dp))
    Divider(
        color = ColorTextGray
    )
        Spacer(modifier.height(10.dp))
}