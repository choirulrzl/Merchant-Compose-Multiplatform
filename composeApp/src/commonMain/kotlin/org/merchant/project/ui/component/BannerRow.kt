package org.merchant.project.ui.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.merchant.project.model.Banner
import org.merchant.project.model.dummyPromoBanner

@Composable
fun BannerRow(
    listBanner: List<Banner>,
    modifier: Modifier = Modifier
) {
    Column {
        Text(
            text = "Informasi Merchant",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 12.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(horizontal = 16.dp),
            modifier = modifier
        ) {
            items(listBanner, key = { it.title }) { banner ->
                BannerItem(banner)
            }
        }
    }
}

@Preview
@Composable
fun BannerRowPreview() {
    BannerRow(dummyPromoBanner)
}