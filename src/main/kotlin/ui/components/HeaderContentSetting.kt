package ui.components

import ColorBackgroundDarkLine
import ColorTextGray
import ColorWhite
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import compose.icons.Octicons
import compose.icons.octicons.Gear16
import compose.icons.octicons.Gear24
import compose.icons.octicons.Search16

/**
 * Header Content
 * Created By Trian Damai
 * https://github.com/triandamai
 * Created At 11/12/21 20.40
 */

@Composable
fun HeaderContentSetting(
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
                    "Product Management",
                    style = MaterialTheme.typography.h1,
                    color = ColorWhite
                )
            }

           ButtonSecondaryTextIcon("Manage Categories", icon = Octicons.Gear16){}
        }
        TextTab(
            tabSelected,
            listOf("hot Dishes","Cold Dishes","Soup","Grill","Appetizer","Dessert"),
            onSelected = {
            index, item ->
            tabSelected=index
        })
        Divider()
        Spacer(modifier.height(8.dp))
    }
}