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
fun FooterContentSetting(
    modifier: Modifier=Modifier
) {
    Row (
        modifier=modifier
            .fillMaxWidth()
            .background(ColorBackground2)
            .padding(all = 18.dp)
    ) {


        ButtonSecondary("Discard Changes"){}
        Spacer(modifier.width(16.dp))
        ButtonPrimary("Save Changes"){}
    }
}