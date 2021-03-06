package ui.components

import ColorBackground2
import ColorPrimary
import ColorTextGray
import ColorTextLight
import ColorWhite
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import compose.icons.Octicons
import compose.icons.octicons.Pencil16
import compose.icons.octicons.Pencil24

/**
 * Card dish
 * Created By Trian Damai
 * https://github.com/triandamai
 * Created At 09/12/21 23.55
 */
@Composable
fun CardDish(
    modifier: Modifier =Modifier
){
   Box (
       modifier=modifier.padding(all = 10.dp)
           ){
       Column (
           modifier=modifier
               .clip(RoundedCornerShape(8.dp))
               .border(width = 1.dp, color = ColorTextGray.copy(alpha = 0.4f), shape = RoundedCornerShape(8.dp))
               .wrapContentHeight()
               .width(221.dp)
               .height(299.dp)
               .background(ColorBackground2),
           verticalArrangement = Arrangement.SpaceBetween,
           horizontalAlignment = Alignment.CenterHorizontally
       ){
           Spacer(modifier=modifier.height(16.dp))
           Image(
               painterResource("images/dummy_item.png"), contentDescription = ""
           )
           Spacer(modifier=modifier.height(16.dp))
           Column(horizontalAlignment = Alignment.CenterHorizontally) {
               Text(
                   "Spicy seasoned",
                   color = ColorWhite
               )
               Text("seafood noodles", color = ColorWhite)
               Spacer(modifier.height(10.dp))
               Row {
                   Text("$ 2.29",
                       color = ColorTextLight
                   )
                   Text(" . ",
                       color = ColorTextLight
                   )

                   Text("20 Bowls",
                       color = ColorTextLight)
               }
           }
           Spacer(modifier=modifier.height(16.dp))
           Row(modifier=modifier
               .fillMaxWidth()
               .height(50.dp)
               .background(ColorPrimary.copy(alpha = 0.3f))
               .clickable {  },
               horizontalArrangement = Arrangement.Center,
               verticalAlignment = Alignment.CenterVertically
           ) {

               Icon(Octicons.Pencil16,contentDescription = "", tint = ColorPrimary)
               Spacer(modifier=modifier.width(8.dp))
               Text(
                   "Edit dish",
                   color=ColorPrimary,
                   style=MaterialTheme.typography.button,
                   textAlign = TextAlign.Center
               )
           }
       }
   }
}