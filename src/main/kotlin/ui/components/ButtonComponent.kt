package ui.components

import ColorPrimary
import ColorWhite
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp


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
