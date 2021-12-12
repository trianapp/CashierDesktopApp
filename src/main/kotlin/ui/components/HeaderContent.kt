package ui.components

import ColorBackground2
import ColorBackgroundBase
import ColorBackgroundDarkLine
import ColorTextGray
import ColorWhite
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import compose.icons.Octicons
import compose.icons.octicons.ArrowDown16
import compose.icons.octicons.ChevronDown16
import compose.icons.octicons.Search16

/**
 * Header Content
 * Created By Trian Damai
 * https://github.com/triandamai
 * Created At 11/12/21 20.40
 */

@Composable
fun HeaderContent(
modifier: Modifier=Modifier
) {
    var text by remember {
        mutableStateOf("")
    }
    var tabSelected by remember {
        mutableStateOf(0)
    }

    Column(

    ) {
        Row(
            modifier=modifier.height(65.dp).fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(
                    "Resto Jaeger",
                    style = MaterialTheme.typography.h1,
                    color = ColorWhite
                )
                Text(
                    "Resto Jaeger",
                    style = MaterialTheme.typography.body1,
                    color = ColorWhite
                )
            }

            TextField(
                text,
                modifier = modifier.width(220.dp),
                onValueChange = {
                    text=it
                },
                placeholder={
                    Text("Order Note", color = ColorTextGray)
                },
                singleLine=true,
                leadingIcon={
                   Icon(
                       Octicons.Search16,
                       contentDescription = ""
                   )
                },
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
        TextTab(tabSelected, listOf("hot Dishes","Cold Dishes","Soup","Grill","Appetizer","Dessert"), onSelected = {
            index, item ->
            tabSelected=index
        })
        Divider()
        Spacer(modifier.height(8.dp))
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = modifier.fillMaxWidth()
        ) {
            Text(
                "Choose Dishes",
                color = ColorWhite,
                style = MaterialTheme.typography.h2,

            )
            DropDownButton()

        }
        Spacer(modifier.height(6.dp))
    }
}