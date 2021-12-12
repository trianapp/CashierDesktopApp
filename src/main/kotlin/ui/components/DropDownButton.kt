package ui.components

import ColorBackground2
import ColorTextGray
import ColorWhite
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import compose.icons.Octicons
import compose.icons.octicons.ChevronDown16

/**
 * Dropdown
 * Created By Trian Damai
 * https://github.com/triandamai
 * Created At 12/12/21 13.51
 */
var menus = listOf("Din In","Out door","In door")
@Composable
fun DropDownButton(
    modifier:Modifier=Modifier
) {
    var expandMenu by remember {
        mutableStateOf(false)
    }
    var selectedMenu by remember {
        mutableStateOf("Din In")
    }
    Box {
        Row(
            modifier=modifier
                .clickable {
                    expandMenu= true
                }
                .border(width = 1.dp, shape = RoundedCornerShape(6.dp), color = ColorTextGray)
                .clip(RoundedCornerShape(6.dp))
                .background(ColorBackground2)
                .padding(all = 10.dp)

        ) {
            Icon(
                Octicons.ChevronDown16,
                tint = ColorWhite,
                contentDescription = ""
            )
            Spacer(modifier.width(6.dp))
            Text(
                "$selectedMenu",
                modifier = modifier,
                color = ColorWhite
            )
        }
        DropdownMenu(
            expanded = expandMenu,
            modifier = modifier.background(ColorBackground2),
            onDismissRequest = {
                expandMenu=false
            }
        ){
            menus.forEach {
                DropdownMenuItem(
                    onClick = {
                        expandMenu=false
                        selectedMenu=it
                    },
                    modifier=modifier.background(ColorBackground2)
                ){
                    Text(
                        it,
                        color = ColorWhite
                    )
                }
            }


        }
    }
}