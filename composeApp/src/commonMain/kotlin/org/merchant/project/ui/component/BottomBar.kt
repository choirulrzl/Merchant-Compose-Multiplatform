package org.merchant.project.ui.component

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import merchantcomposemultiplatform.composeapp.generated.resources.Res
import merchantcomposemultiplatform.composeapp.generated.resources.ic_nav_catalog_false
import merchantcomposemultiplatform.composeapp.generated.resources.ic_nav_dashboard_false
import merchantcomposemultiplatform.composeapp.generated.resources.ic_nav_lending_false
import merchantcomposemultiplatform.composeapp.generated.resources.ic_nav_settings_false
import merchantcomposemultiplatform.composeapp.generated.resources.navbar_label_catalog
import merchantcomposemultiplatform.composeapp.generated.resources.navbar_label_home
import merchantcomposemultiplatform.composeapp.generated.resources.navbar_label_lending
import merchantcomposemultiplatform.composeapp.generated.resources.navbar_label_settings
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.StringResource
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import org.merchant.project.Screen

@Composable
fun BottomBar(
    currentScreen: Screen,
    onNavigate: (Screen) -> Unit
) {
    data class NavigationItem(
        val screen: Screen,
        val icon: DrawableResource,
        val label: StringResource
    )

    val navigationItems = listOf(
        NavigationItem(
            Screen.Home,
            Res.drawable.ic_nav_dashboard_false,
            Res.string.navbar_label_home
        ),
        NavigationItem(
            Screen.Catalog,
            Res.drawable.ic_nav_catalog_false,
            Res.string.navbar_label_catalog
        ),
        NavigationItem(
            Screen.Lending,
            Res.drawable.ic_nav_lending_false,
            Res.string.navbar_label_lending
        ),
        NavigationItem(
            Screen.Settings,
            Res.drawable.ic_nav_settings_false,
            Res.string.navbar_label_settings
        )
    )


    NavigationBar {
        navigationItems.forEach { item ->
            NavigationBarItem(
                icon = {
                    Icon(
                        painter = painterResource(item.icon),
                        contentDescription = stringResource(item.label)
                    )
                },
                label = {
                    Text(stringResource(item.label))
                },
                selected = item.screen == currentScreen,
                onClick = { onNavigate(item.screen) }
            )
        }
    }
}