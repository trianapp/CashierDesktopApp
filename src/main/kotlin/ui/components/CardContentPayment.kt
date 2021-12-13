package ui.components

import ColorBackground2
import ColorPrimary
import ColorTextGray
import ColorWhite
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Checkbox
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import compose.icons.Octicons
import compose.icons.octicons.Check16
import compose.icons.octicons.CreditCard16

/**
 * CardContentPayment
 * Created By Trian Damai
 * https://github.com/triandamai
 * Created At 11/12/21 14.12
 */
@Composable
fun CardContentPayment(
    modifier:Modifier=Modifier,
    active:Boolean
) {

    Box(
        modifier = modifier
            .width(101.dp)
            .height(64.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(ColorBackground2)
            .padding(all = 10.dp)
    ){
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Icon(
                Octicons.CreditCard16,
                contentDescription = "",
                tint = ColorTextGray
            )
            Spacer(modifier=modifier.height(8.dp))
            Text(
                "Credit Card",
                color = ColorTextGray
            )
        }
        if(active) {
            Box(
                modifier = modifier
                    .size(16.dp)
                    .align(Alignment.TopEnd)
                    .padding(all = 1.dp)
                    .clip(CircleShape)
                    .background(ColorPrimary)
            ) {
                Icon(Octicons.Check16, contentDescription = "", tint = ColorWhite)
            }
        }
    }
}