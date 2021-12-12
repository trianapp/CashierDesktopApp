package ui.components

import ColorAccentGreen
import ColorAccentPurple
import ColorBackground2
import ColorTextLight
import ColorWhite
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import compose.icons.Octicons
import compose.icons.octicons.ArrowUp16
import compose.icons.octicons.Bookmark16

/**
 * Card summary
 * Created By Trian Damai
 * https://github.com/triandamai
 * Created At 09/12/21 23.56
 */
@Composable
fun CardSummary(
    modifier: Modifier=Modifier
) {
    Box (
        modifier=modifier
            .wrapContentHeight()
            .width(200.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(ColorBackground2),
    ) {
        Column(
            modifier=modifier
                .align(Alignment.CenterStart)
                .padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 16.dp)
        ) {
            Row(
                modifier = modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ){
                Box(
                    modifier=modifier
                        .clip(RoundedCornerShape(8.dp))
                        .background(ColorAccentPurple.copy(alpha = 0.2f))
                        .padding(all = 8.dp)
                ){
                    Icon(Octicons.Bookmark16, tint = ColorAccentPurple, contentDescription = "")
                }
                Text(
                    "+32.40%",
                    style = MaterialTheme.typography.body1,
                    color = ColorAccentGreen
                )
                Box(
                    modifier=modifier.clip(CircleShape)
                        .background(ColorAccentGreen.copy(alpha = 0.2f))
                        .padding(all = 8.dp)
                ) {
                    Icon(Octicons.ArrowUp16, tint = ColorAccentGreen, contentDescription = "")
                }
            }
            Spacer(modifier=modifier.height(16.dp))
            Text(
                "$10,243.00",
                style=MaterialTheme.typography.h2,
                color = ColorWhite
            )
            Spacer(modifier=modifier.height(10.dp))
            Text(
                "Total Revenue",
                style = MaterialTheme.typography.body1,
                color = ColorTextLight
            )

        }
    }
}