package ui.components

import ColorBackground1
import ColorBackground2
import ColorPrimary
import ColorWhite
import PageState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import compose.icons.Octicons
import compose.icons.octicons.Gear24

/**
 * Sidebar Item
 * Created By Trian Damai
 * https://github.com/triandamai
 * Created At 13/12/21 20.32
 */
@Composable
fun SidebarItem(
    modifier: Modifier=Modifier,
    pageState: PageState,
    pageName:PageState,
    icon:ImageVector,
    onClick:(state:PageState)->Unit
) {
    var active = pageState == pageName
    Box(
        modifier=modifier
            .size(104.dp)
            .background(if(active) ColorBackground1 else ColorBackground2)
    ){
        Column (modifier=modifier
            .fillMaxHeight()
            .width(30.dp)
            .background(ColorBackground2)){  }

        Column(
            modifier.height(19.dp)
                .align(Alignment.TopCenter)
                .fillMaxWidth()
                .clip(RoundedCornerShape(bottomEnd = 20.dp))
                .background(ColorBackground2)
        ) {

        }
        Box(
            modifier=modifier
                .width(88.dp)
                .height(66.dp)
                .clip(RoundedCornerShape(topStart = 14.dp, bottomStart = 14.dp))
                .background(if(active) ColorBackground1 else ColorBackground2  )
                .align(Alignment.CenterEnd)
        ) {
            Column(
                modifier=modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 12.dp)
                    .size(50.dp)
                    .clip(RoundedCornerShape(14.dp))
                    .background(if(active) ColorPrimary else Color.Transparent)
                    .clickable {
                               onClick(pageName)
                    },
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Icon(icon,
                    contentDescription = "",
                    tint = if(active) ColorWhite else ColorPrimary
                )
            }
        }
        Column(
            modifier.height(19.dp)
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .clip(RoundedCornerShape(topEnd = 20.dp))
                .background(ColorBackground2)
        ) {

        }
    }
}

@Composable
fun SidebarItemDashboard(
    modifier: Modifier=Modifier,
    onClick: (state: PageState) -> Unit
) {
    Box(
        modifier=modifier
            .size(104.dp)
            .background(ColorBackground2)
    ){
        Column (modifier=modifier
            .fillMaxHeight()
            .width(30.dp)
            .background(ColorBackground2)){  }

        Column(
            modifier.height(19.dp)
                .align(Alignment.TopCenter)
                .fillMaxWidth()
                .clip(RoundedCornerShape(bottomEnd = 20.dp))
                .background(ColorBackground2)
        ) {

        }
        Box(
            modifier=modifier
                .width(88.dp)
                .height(66.dp)
                .clip(RoundedCornerShape(topStart = 14.dp, bottomStart = 14.dp))
                .background(Color.Transparent)
                .align(Alignment.CenterEnd)
        ) {
            Column(
                modifier=modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 12.dp)
                    .size(50.dp)
                    .clip(RoundedCornerShape(14.dp))
                    .background(ColorPrimary.copy(alpha = 0.2f))
                    .clickable { onClick(PageState.dashboard) },
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Image(painterResource("images/dummy_home.png"), contentDescription = "")
            }
        }
        Column(
            modifier.height(19.dp)
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .clip(RoundedCornerShape(topEnd = 20.dp))
                .background(ColorBackground2)
        ) {

        }
    }
}