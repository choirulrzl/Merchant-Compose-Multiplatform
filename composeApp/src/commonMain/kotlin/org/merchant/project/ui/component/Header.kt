package org.merchant.project.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import merchantcomposemultiplatform.composeapp.generated.resources.Res
import merchantcomposemultiplatform.composeapp.generated.resources.bg_dashboard
import merchantcomposemultiplatform.composeapp.generated.resources.logo_livin_merchant
import merchantcomposemultiplatform.composeapp.generated.resources.notif_white
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.merchant.project.model.dummyMenu

@Composable
fun Header(modifier: Modifier = Modifier) {
    Box {
        Image(
            painter = painterResource(Res.drawable.bg_dashboard),
            contentDescription = "Banner Image",
            contentScale = ContentScale.Crop,
            modifier = modifier
                .height(380.dp)
                .fillMaxWidth()

        )
        Column {
            Image(
                painter = painterResource(Res.drawable.logo_livin_merchant),
                contentDescription = "Logo Livin Merchant",
                modifier = Modifier
                    .width(160.dp)
                    .padding(top = 16.dp, start = 16.dp)
            )
            Spacer(modifier = Modifier.height(32.dp))
            OwnerInfo()
            Spacer(modifier = Modifier.height(32.dp))
            MenuRow(dummyMenu)
        }
        Image(
            painter = painterResource(Res.drawable.notif_white),
            contentDescription = "Notification Dashboard",
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(top = 16.dp, end = 16.dp)
                .width(24.dp)
        )
    }
}

@Preview
@Composable
fun HeaderPreview() {
    Header()
}