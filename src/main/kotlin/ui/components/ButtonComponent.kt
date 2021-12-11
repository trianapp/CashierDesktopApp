package ui.components

import ColorBackground2
import ColorPrimary
import ColorWhite
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

/**
 * Component button
 * Created By Trian Damai
 * https://github.com/triandamai
 * Created At 09/12/21 23.55
 */

@Composable
fun ButtonPrimary(
    text:String,
    modifier: Modifier = Modifier,
    onClick:()->Unit
){
    Button(
        modifier=modifier.height(48.dp).clip(RoundedCornerShape(8.dp)),
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = ColorPrimary,
        ),
        contentPadding = PaddingValues(
            start = 20.dp,
            end = 20.dp
        )
    ){
            Text(
                text,
                style = MaterialTheme.typography.button,
                color = ColorWhite
            )


    }
}
@Composable
fun ButtonPrimaryTextIcon(
    text:String,
    icon: ImageVector,
    modifier: Modifier = Modifier,
    onClick:()->Unit
){
    Button(
        modifier=modifier.height(48.dp).clip(RoundedCornerShape(8.dp)),
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = ColorPrimary,
        ),
        contentPadding = PaddingValues(
            start = 20.dp,
            end = 20.dp
        )
    ){
        Icon(icon, tint = ColorWhite, contentDescription = "")
        Text(
            text,
            style = MaterialTheme.typography.button,
            color = ColorWhite
        )


    }
}

@Composable
fun ButtonSecondary(
    text: String,
    modifier: Modifier=Modifier,
    onClick: () -> Unit
){

    OutlinedButton(
        modifier=modifier
            .height(48.dp),
        onClick = onClick,
        colors=ButtonDefaults.outlinedButtonColors(
            backgroundColor = Color.Transparent,
        ),
        border = BorderStroke(width = 1.dp, color = ColorPrimary),
        contentPadding = PaddingValues(
            start = 15.dp,
            end = 15.dp
        )
    ){

            Text(
                text,
                style = MaterialTheme.typography.button,
                color = ColorPrimary
            )

    }
}

@Composable
fun ButtonSecondaryTextIcon(
    text: String,
    icon: ImageVector,
    modifier: Modifier=Modifier,
    onClick: () -> Unit
){

    OutlinedButton(
        modifier=modifier
            .height(48.dp),
        onClick = onClick,
        colors=ButtonDefaults.outlinedButtonColors(
            backgroundColor = Color.Transparent,
        ),
        border = BorderStroke(width = 1.dp, color = ColorPrimary),
        contentPadding = PaddingValues(
            start = 15.dp,
            end = 15.dp
        )
    ){

        Icon(icon, tint = ColorPrimary, contentDescription = "")
        Text(
            text,
            style = MaterialTheme.typography.button,
            color = ColorPrimary
        )

    }
}

@Composable
fun ButtonPrimaryIcon(
    icon:ImageVector,
    modifier: Modifier=Modifier,
    onClick: () -> Unit
){
    Button(
        onClick=onClick,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = ColorPrimary,
        )
    ){
        Icon(icon, tint = ColorWhite, contentDescription = "")
    }
}

@Composable
fun ButtonSecondaryIcon(
    icon:ImageVector,
    modifier: Modifier=Modifier,
    onClick: () -> Unit
){
    OutlinedButton(
        onClick=onClick,
        colors=ButtonDefaults.outlinedButtonColors(
            backgroundColor = Color.Transparent
        ),
        border = BorderStroke(width = 1.dp, color = ColorPrimary)
    ){
        Icon(icon, tint = ColorPrimary, contentDescription = "")
    }
}

@Composable
fun ButtonTab(
    modifier: Modifier=Modifier,
    text: String,
    active:Boolean
){
    Box(
        modifier=modifier
            .clip(RoundedCornerShape(8.dp))
            .background(if(active) ColorPrimary else ColorBackground2)
            .padding(
                start = 10.dp,
                end = 10.dp,
                top = 10.dp,
                bottom = 10.dp
            )
    ) {
        Text(
            text,
            color = if(active) ColorWhite else  ColorPrimary,
            modifier = modifier.align(Alignment.Center)
        )
    }
}