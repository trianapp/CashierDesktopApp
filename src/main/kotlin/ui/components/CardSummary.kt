package ui.components

import ColorAccentGreen
import ColorAccentPurple
import ColorBackground2
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
            .padding(all = 20.dp)
            .background(ColorBackground2),
    ) {
        Column {
            Row{
                Box{
                    Icon(Octicons.Bookmark16, tint = ColorAccentPurple, contentDescription = "")
                }
                Text("+32.40%")
                Box {
                    Icon(Octicons.ArrowUp16, tint = ColorAccentGreen, contentDescription = "")
                }
            }
            Text("$10,243.00")
            Text("Total Revenue")

        }
    }
}