package ui.components

import ColorAccentGreen
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp

@Composable
fun ItemStatus(
    modifier:Modifier=Modifier
) {
    Box(
    modifier = modifier
    .clip(RoundedCornerShape(14.dp))
    .background(ColorAccentGreen.copy(alpha = 0.2f))
    .padding(horizontal = 8.dp, vertical = 6.dp)
    ) {
        Text(
            "Completed",
            color = ColorAccentGreen
        )
    }
}