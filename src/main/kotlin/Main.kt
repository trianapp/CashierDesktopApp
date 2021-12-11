// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.desktop.DesktopMaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowSize
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application
import ui.components.*
import ui.pages.HomePage

@Composable
@Preview
fun App() {

    DesktopMaterialTheme(
        typography = Barrow
    ) {
//        LazyColumn (
//            modifier = Modifier.padding(all=16.dp).scrollable(
//                state = rememberScrollableState { 0f },
//                orientation = Orientation.Vertical
//            )
//                //.background(ColorBackground2),
//        ) {
//
//            item {
//                Spacer(modifier = Modifier.height(10.dp))
//                Row {
//                    CardContentPayment(active = true)
//                    Spacer(modifier = Modifier.width(10.dp))
//                    CardContentPayment(active = false)
//                }
//            }
//            item {
//                Spacer(modifier = Modifier.height(10.dp))
//                ButtonTab(text = "To Go", active = false)
//                Spacer(modifier = Modifier.height(10.dp))
//                ButtonTab(text = "Hot Dishes", active = true)
//            }
//            item {
//                Spacer(modifier = Modifier.height(10.dp))
//                CardItems()
//            }
//            item {
//                Spacer(modifier = Modifier.height(10.dp))
//                CardItemMostOrder()
//            }
//            item {
//                Spacer(modifier = Modifier.height(10.dp))
//                CardRow()
//
//            }
//            item {
//                Spacer(modifier = Modifier.height(10.dp))
//                CardItemContent(active = false)
//
//            }
//            item {
//                Spacer(modifier = Modifier.height(10.dp))
//                CardItemContent(active = true)
//
//            }
//            item {
//                Spacer(modifier = Modifier.height(10.dp))
//                CardItemsCart()
//
//            }
//            item {
//                Spacer(modifier = Modifier.height(10.dp))
//                CardDish()
//
//            }
//            item {
//                Spacer(modifier = Modifier.height(10.dp))
//                CardSummary()
//
//            }
//            item {
//                Spacer(modifier = Modifier.height(10.dp))
//                ButtonPrimary(text="Confirm Payment"){}
//                ButtonSecondary(text = "Cancel"){}
//                ButtonPrimaryIcon(Icons.Default.Add){}
//                ButtonSecondaryIcon(Icons.Default.Add){}
//                ButtonPrimaryTextIcon("Confirm Payment",Icons.Default.Add){}
//                ButtonSecondaryTextIcon("Confirm Payment",Icons.Default.Add){}
//            }
//
//
//           }

        HomePage()

    }
}

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        state = WindowState(size = WindowSize(1290.dp,800.dp))
    ) {
        App()
    }
}
