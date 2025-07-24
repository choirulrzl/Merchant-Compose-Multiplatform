package org.merchant.project.ui.component

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import merchantcomposemultiplatform.composeapp.generated.resources.Res
import merchantcomposemultiplatform.composeapp.generated.resources.ic_nav_catalog_false
import merchantcomposemultiplatform.composeapp.generated.resources.ic_nav_dashboard_false
import merchantcomposemultiplatform.composeapp.generated.resources.ic_nav_settings_false
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.merchant.project.model.BottomItem

@Composable
fun BottomBar() {
    NavigationBar {
        val navigationItems = listOf(
            BottomItem(
                title = "Home",
                icon = painterResource(Res.drawable.ic_nav_dashboard_false)
            ),
            BottomItem(
                title = "Katalog",
                icon = painterResource(Res.drawable.ic_nav_catalog_false)
            ),
            BottomItem(
                title = "Settings",
                icon = painterResource(Res.drawable.ic_nav_settings_false)
            )
        )

        navigationItems.map {
            NavigationBarItem(
                icon = {
                    Icon(
                        painter = it.icon,
                        contentDescription = it.title
                    )
                },
                label = {
                    Text(it.title)
                },
                selected = it.title == navigationItems[0].title,
                onClick = {}
            )
        }
    }
}

@Preview
@Composable
fun BottomBarPreview() {
    BottomBar()
}