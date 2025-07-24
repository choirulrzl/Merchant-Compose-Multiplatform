package org.merchant.project.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.merchant.project.model.dummyPromoBanner
import org.merchant.project.ui.component.BannerRow
import org.merchant.project.ui.component.Header
import org.merchant.project.ui.component.TransactionCard

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Header()
        Spacer(modifier = Modifier.height(28.dp))
        TransactionCard()
        Spacer(modifier = Modifier.height(28.dp))
        BannerRow(dummyPromoBanner)
        Spacer(modifier = Modifier.height(12.dp))
        BannerRow(dummyPromoBanner)
        Spacer(modifier = Modifier.height(12.dp))
        BannerRow(dummyPromoBanner)
        Spacer(modifier = Modifier.height(12.dp))
        BannerRow(dummyPromoBanner)
        Spacer(modifier = Modifier.height(20.dp))
    }
}


@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}