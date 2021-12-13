package ui.components

import ColorBackground2
import ColorTextGray
import ColorWhite
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import compose.icons.Octicons
import compose.icons.octicons.ChevronDown16
import compose.icons.octicons.Gear16
import compose.icons.octicons.Search16

/**
 * Header Table Dashboard
 * Created By Trian Damai
 * https://github.com/triandamai
 * Created At 11/12/21 22.27
 */
@Composable
fun HeaderTableDashboard(
    modifier:Modifier=Modifier
) {
        Column(
            modifier = modifier
                .clip(RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp))
                .background(ColorBackground2)
                .padding(top = 16.dp, bottom =6.dp, start = 16.dp, end = 16.dp)
        ) {
            Row(
                modifier=modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                    Text(
                        "Resto Jaeger",
                        style = MaterialTheme.typography.h1,
                        color = ColorWhite
                    )
                ButtonSecondaryIcon(Octicons.Gear16, onClick = {})
            }
            Spacer(modifier.height(15.dp))
            Row(
                modifier=modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    "Customer",
                    color = ColorTextGray
                )
                Text(
                    "Menu",
                    color = ColorTextGray
                )
                Text(
                    "Total Payment",
                    color = ColorTextGray
                )
                Text(
                    "Status",
                    color = ColorTextGray
                )
            }
            Spacer(modifier.height(8.dp))
            Divider(
                color = ColorTextGray
            )
            Spacer(modifier.height(10.dp))
        }

}