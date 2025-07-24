package org.merchant.project.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import merchantcomposemultiplatform.composeapp.generated.resources.Res
import merchantcomposemultiplatform.composeapp.generated.resources.ic_chevrolet_right
import merchantcomposemultiplatform.composeapp.generated.resources.ic_poin
import merchantcomposemultiplatform.composeapp.generated.resources.ic_profile
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

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