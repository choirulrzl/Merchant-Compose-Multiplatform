package org.merchant.project.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import merchantcomposemultiplatform.composeapp.generated.resources.Res
import merchantcomposemultiplatform.composeapp.generated.resources.ic_pesanan_dashboard
import merchantcomposemultiplatform.composeapp.generated.resources.ic_profile
import merchantcomposemultiplatform.composeapp.generated.resources.image_1
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.merchant.project.model.Banner
import org.merchant.project.model.Menu
import org.merchant.project.model.dummyBanner

@Composable
fun BannerItem(
    banner: Banner,
    modifier: Modifier = Modifier,
) {
    Card(
        modifier = modifier.width(280.dp),
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.background,
        ),
    ) {
        Image(
            painter = painterResource(banner.image),
            contentDescription = "image banner",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(140.dp)
                .clip(RoundedCornerShape(8.dp))
        )
    }
}

@Preview
@Composable
fun BannerItemPreview() {
    MaterialTheme {
        BannerItem(
            banner = Banner(Res.drawable.image_1, "image 1"),
            Modifier
        )
    }
}

