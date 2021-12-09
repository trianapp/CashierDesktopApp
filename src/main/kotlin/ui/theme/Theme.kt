import androidx.compose.material.Typography
import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.platform.DesktopFont
import androidx.compose.ui.text.platform.Font
import androidx.compose.ui.unit.sp

val ColorPrimary = Color(0xFFEA7C69)
val ColorSecondary = Color(0xFF9288E0)
val ColorWhite = Color(0xFFFFFFFF)

val ColorBackgroundBase = Color(0xFFFAFAFA)
val ColorBackgroundDarkLine = Color(0xFF393C49)
val ColorBackground1 = Color(0xFF252836)
val ColorBackground2 = Color(0xFF1F1D2B)
val ColorBackgroundForm = Color(0xFF2D303E)

val ColorTextDark = Color(0xFF3B5162)
val ColorTextGray = Color(0xFF889898)
val ColorTextLight = Color(0xFFABBBC2)
val ColorTextLighter = Color(0xFFE0E6E9)

val ColorAccentGreen = Color(0xFF50D1AA)
val ColorAccentRed = Color(0xFFFF7CA3)
val ColorAccentOrange = Color(0xFFFFB572)
val ColorAccentBlue = Color(0xFF65B0F6)
val ColorAccentPurple = Color(0xFF9290FE)

val font = FontFamily(
    Font(
        resource = "font/barlow_semi_bold.ttf",
        weight = FontWeight.SemiBold,
        style = FontStyle.Normal,
    ),
    Font(
        resource = "font/barlow_semi_bold_italic.ttf",
        weight = FontWeight.SemiBold,
        style = FontStyle.Italic,
    ),
    Font(
        resource = "font/barlow_medium.ttf",
        weight = FontWeight.Medium,
        style = FontStyle.Normal,
    ),
    Font(
        resource = "font/barlow_medium_italic.ttf",
        weight = FontWeight.Medium,
        style = FontStyle.Italic,
    ),
    Font(
        resource = "font/barlow_regular.ttf",
        weight = FontWeight.Normal,
        style = FontStyle.Normal,
    )
)

val Barrow = Typography(
    h1 = TextStyle(
        fontSize = 28.sp,
        letterSpacing = 0.sp,
        fontFamily = font,
    ),
    h2 = TextStyle(
        fontSize = 20.sp,
        letterSpacing = 0.sp,
        fontFamily = font,
    ),
    h3=TextStyle(
        fontSize = 16.sp,
        letterSpacing = 0.sp,
        fontFamily = font,
    ),
    h4=TextStyle(
        fontSize = 14.sp,
        letterSpacing = 0.sp,
        fontFamily = font,
    ),
    h5=TextStyle(
        fontSize = 12.sp,
        letterSpacing = 0.sp,
        fontFamily = font,
    ),
    h6=TextStyle(),
    body1 = TextStyle(),
    body2 = TextStyle(),
    button = TextStyle(
        fontSize = 14.sp,
        letterSpacing = 0.sp,
        fontFamily = font,
    ),


)


var lightColor = lightColors(
    primary =ColorPrimary
)