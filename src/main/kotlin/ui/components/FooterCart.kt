package ui.components

import ColorBackground2
import ColorTextGray
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/**
 * Footer cart
 * Created By Trian Damai
 * https://github.com/triandamai
 * Created At 11/12/21 22.01
 */
@Composable
fun FooterCart(
    modifier: Modifier=Modifier
) {
    Column(
        modifier=modifier
            .fillMaxWidth()
            .background(ColorBackground2)
            .padding(all = 18.dp)
    ) {
        Row(
            modifier=modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                "Discount",
                color = ColorTextGray
            )
            Text(
                "$ 0",
            color =   ColorTextGray
            )
        }
        Spacer(modifier.height(15.dp))
        Row(
            modifier=modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                "Total",
                color = ColorTextGray
            )
            Text(
                "$ 20",
                color = ColorTextGray
            )
        }
        Spacer(modifier.height(20.dp))
        ButtonPrimary("Continue Payment", onClick = {}, modifier = modifier.fillMaxWidth())
    }
}