// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.desktop.DesktopMaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyVerticalGrid
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
import compose.icons.Octicons
import compose.icons.octicons.*
import ui.components.*
import ui.pages.BasePage
import ui.pages.DashboardPage
import ui.pages.HomePage
import ui.pages.SettingPage

enum class PageState{
    home,
    dashboard,
    setting,
    logout,
    discount,
    notification,
    message
}

@ExperimentalFoundationApi
@Composable
@Preview
fun App() {
    var currentPage by remember {
        mutableStateOf(PageState.dashboard)
    }
    DesktopMaterialTheme(
        typography = Barrow
    ) {
        BasePage {
            sidebarLeft {
                SidebarItemDashboard{
                    currentPage=it
                }
                SidebarItem(pageName = PageState.home, pageState = currentPage, icon = Octicons.Home24){
                    currentPage= it
                }
                SidebarItem(pageName = PageState.discount, pageState = currentPage, icon = Octicons.Verified24){
                    currentPage= it
                }
                SidebarItem(pageName = PageState.message, pageState = currentPage, icon = Octicons.Comment24){
                    currentPage= it
                }
                SidebarItem(pageName = PageState.notification, pageState = currentPage, icon = Octicons.Bell24){
                    currentPage= it
                }
                SidebarItem(pageName = PageState.setting, pageState = currentPage, icon = Octicons.Gear24){
                    currentPage= it
                }
                Spacer(Modifier.height(20.dp))
                SidebarItem(pageName = PageState.logout, pageState = currentPage, icon = Octicons.SignOut24){
                    currentPage= it
                }
            }
            content {
                when(currentPage){
                    PageState.home -> {
                        HomePage()
                    }
                    PageState.dashboard -> {
                        DashboardPage()
                    }
                    PageState.setting -> {
                        SettingPage()
                    }
                    PageState.logout -> {}
                    PageState.discount -> {}
                    PageState.notification -> {}
                    PageState.message -> {}
                }

            }

        }

    }
}

@ExperimentalFoundationApi
fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        state = WindowState(size = WindowSize(1194.dp,800.dp))
    ) {
        App()
    }
}
