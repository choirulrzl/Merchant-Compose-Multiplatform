package org.merchant.project.ui.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.merchant.project.model.Menu
import org.merchant.project.model.dummyMenu

@Composable
fun MenuRow(
    listMenu: List<Menu>,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(40.dp),
            contentPadding = PaddingValues(horizontal = 16.dp),
            modifier = modifier.align(Alignment.Center)
        ) {
            items(listMenu, key = { it.title }) { menu ->
                MenuItem(menu)
            }
        }
    }
}

@Preview
@Composable
fun MenuRowPreview() {
    MenuRow(dummyMenu)
}