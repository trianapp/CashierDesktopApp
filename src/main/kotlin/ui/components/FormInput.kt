package ui.components

import ColorBackgroundDarkLine
import ColorTextGray
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.*

/**
 * FormInput
 * Created By Trian Damai
 * https://github.com/triandamai
 * Created At 10/12/21 23.44
 */
@Composable
fun TextInput(
    modifier: Modifier=Modifier
){
    var text by remember {
        mutableStateOf("")
    }
    TextField(
        text,
        modifier = modifier.fillMaxWidth(),
        onValueChange = {
            text=it
        },
        placeholder={
           Text("Order Note", color = ColorTextGray)
        },
        singleLine=true,
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = ColorBackgroundDarkLine,
            cursorColor = ColorTextGray,
            disabledLabelColor = ColorBackgroundDarkLine,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            textColor = ColorTextGray
        ),
        shape = RoundedCornerShape(8.dp)
    )
}