package org.merchant.project

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import merchantcomposemultiplatform.composeapp.generated.resources.Res
import merchantcomposemultiplatform.composeapp.generated.resources.bg_dashboard
import merchantcomposemultiplatform.composeapp.generated.resources.ic_chevrolet_right
import merchantcomposemultiplatform.composeapp.generated.resources.ic_image_color
import merchantcomposemultiplatform.composeapp.generated.resources.ic_poin
import merchantcomposemultiplatform.composeapp.generated.resources.ic_profile
import merchantcomposemultiplatform.composeapp.generated.resources.ic_qris_white
import merchantcomposemultiplatform.composeapp.generated.resources.logo_livin_merchant
import merchantcomposemultiplatform.composeapp.generated.resources.notif_white
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.merchant.project.model.Menu
import org.merchant.project.model.dummyMenu
import org.merchant.project.ui.component.MenuItem

@Composable
@Preview
fun App() {
    MaterialTheme {
        Column {
            Header()
            Spacer(modifier = Modifier.height(28.dp))
            TransactionCard()
        }
    }
}

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
    MaterialTheme {
        Header()
    }
}


@Composable
fun OwnerInfo() {
    Card(
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0x0A41BF).copy(alpha = 0.7f),
        ),
        modifier = Modifier.padding(start = 12.dp, end = 12.dp)
    ) {
        Column {
            Row(
                modifier = Modifier
                    .padding(top = 16.dp, start = 12.dp, end = 12.dp)
                    .fillMaxWidth()
            ) {
                Column {
                    Text(
                        text = "Achmad Choirul Rizal",
                        color = Color.White
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            painter = painterResource(Res.drawable.ic_profile),
                            contentDescription = "Role Status",
                            modifier = Modifier.size(20.dp),
                            tint = Color.White
                        )
                        Text(
                            text = "Pemilik",
                            color = Color.White
                        )
                    }
                }
                Spacer(modifier = Modifier.weight(1f))
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(Res.drawable.ic_poin),
                        contentDescription = "Poin",
                        modifier = Modifier.size(20.dp),
                        tint = Color.Unspecified
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "27 Point",
                        color = Color.White
                    )
                    Icon(
                        painter = painterResource(Res.drawable.ic_chevrolet_right),
                        contentDescription = "To detail Point",
                        modifier = Modifier.size(20.dp),
                        tint = Color.White
                    )
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
            OutletInfo()
        }

    }
}

@Preview
@Composable
fun OwnerInfoPreview() {
    OwnerInfo()
}

@Composable
fun OutletInfo() {
    Card(
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0x061c32).copy(alpha = 0.7f),
        )
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(12.dp)
        ) {
            Image(
                painter = painterResource(Res.drawable.ic_image_color),
                contentDescription = "Profile image",

                modifier = Modifier
                    .width(64.dp)
                    .height(64.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Column {
                Text(
                    text = "Toko Es Indragiri",
                    color = Color.White
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "Gg. Anggur Jalan Indra Giri Kec. Kanigaran Kota Probolinggo",
                    maxLines = 1,
                    color = Color.White,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}

@Preview
@Composable
fun OutletInfoPreview() {
    OutletInfo()
}

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

@Composable
fun TransactionCard() {
    Card(
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.background,
        ),
        modifier = Modifier.padding(start = 12.dp, end = 12.dp)
    ) {
        Column(
            modifier = Modifier.padding(12.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Pendapatan Hari Ini, 23 Juli 2025"
                )
                Spacer(modifier = Modifier.weight(1f))
                Text(
                    text = "Lihat Detail",
                    fontWeight = FontWeight.Bold,
                    color = Color.Blue
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Rp 78.000",
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp
            )
            Spacer(modifier = Modifier.height(16.dp))
            Card(
                shape = RoundedCornerShape(20.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0x0A41BF).copy(alpha = 0.4f),
                ),
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(
                        start = 12.dp,
                        top = 8.dp,
                        end = 12.dp,
                        bottom = 8.dp
                    )
                ) {
                    Image(
                        painter = painterResource(Res.drawable.ic_qris_white),
                        contentDescription = "Logo QRIS",
                        modifier = Modifier.height(20.dp)
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Text(
                        text = "Tampilkan QRIS",
                        color = Color.Blue,
                        modifier = Modifier.padding(4.dp),
                    )
                    Icon(
                        painter = painterResource(Res.drawable.ic_chevrolet_right),
                        contentDescription = "To QRIS Static",
                        modifier = Modifier.size(20.dp),
                        tint = Color.Blue
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun TransactionCardPreview() {
    TransactionCard()
}