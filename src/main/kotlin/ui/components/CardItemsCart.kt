package ui.components

import ColorAccentPurple
import ColorBackgroundDarkLine
import ColorPrimary
import ColorTextGray
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import compose.icons.Octicons
import compose.icons.octicons.Trash16

/**
 * Item cart
 * Created By Trian Damai
 * https://github.com/triandamai
 * Created At 10/12/21 23.25
 */

@Composable
fun CardItemsCart(
    modifier: Modifier=Modifier
){
    var text by remember {
        mutableStateOf("")
    }
Box(
    modifier=modifier
        .width(361.dp)
        .height(106.dp)
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            modifier=modifier.width(297.dp),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.Start
        ) {
            Box(
                modifier=modifier.fillMaxWidth()
            ) {
                Row(
                    modifier=modifier.align(Alignment.CenterStart)
                ) {
                    Image(
                        modifier=modifier.size(40.dp),
                        painter = painterResource("images/dummy_item.png"),
                        contentDescription = ""
                    )
                    Spacer(modifier.width(10.dp))
                    Column {
                        Text(
                            "Spicy Seasoned Rice",
                            style = MaterialTheme.typography.body1,
                            color = ColorTextGray
                        )
                        Spacer(modifier.height(8.dp))
                        Text("$ 2.29")
                    }
                }
                Box(
                    modifier=modifier
                        .align(Alignment.CenterEnd)
                        .size(48.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(ColorBackgroundDarkLine)
                ) {
                    Text(
                        "2",
                        modifier=modifier.align(Alignment.Center),
                        color = ColorTextGray
                    )
                }
            }
            Spacer(modifier.height(10.dp))
            TextField(
                    text,
                    modifier = modifier
                        .fillMaxWidth()
                        .height(48.dp),
                    onValueChange = {
                        text=it
                    },
                    placeholder={
                        Text(
                            "Order Note",
                            color = ColorTextGray
                        )
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
        Spacer(modifier.width(8.dp))
        Column(
            modifier=modifier.fillMaxHeight(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
           Column(
               verticalArrangement = Arrangement.Center,
               horizontalAlignment = Alignment.CenterHorizontally,
               modifier=modifier.size(48.dp),
           ) {
               Text(
               "$ 4.5",
               textAlign= TextAlign.Center,
               style = MaterialTheme.typography.body1,
               color = ColorTextGray
                )
           }
            OutlinedButton(
                onClick={},
                modifier=modifier.size(48.dp),
                colors= ButtonDefaults.outlinedButtonColors(
                    backgroundColor = Color.Transparent
                ),
                border = BorderStroke(width = 1.dp, color = ColorPrimary)
            ){
                Icon(Octicons.Trash16, tint = ColorPrimary, contentDescription = "")
            }
        }
    }
}
}