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
import merchantcomposemultiplatform.composeapp.generated.resources.owner_info_account_status
import merchantcomposemultiplatform.composeapp.generated.resources.owner_info_content_desc_icon_point
import merchantcomposemultiplatform.composeapp.generated.resources.owner_info_content_desc_navigate_detail
import merchantcomposemultiplatform.composeapp.generated.resources.owner_info_content_desc_role_status
import merchantcomposemultiplatform.composeapp.generated.resources.owner_info_name
import merchantcomposemultiplatform.composeapp.generated.resources.owner_info_point_count
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
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
                        text = stringResource(Res.string.owner_info_name),
                        color = Color.White
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            painter = painterResource(Res.drawable.ic_profile),
                            contentDescription = stringResource(Res.string.owner_info_content_desc_role_status),
                            modifier = Modifier.size(20.dp),
                            tint = Color.White
                        )
                        Text(
                            text = stringResource(Res.string.owner_info_account_status),
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
                        contentDescription = stringResource(Res.string.owner_info_content_desc_icon_point),
                        modifier = Modifier.size(20.dp),
                        tint = Color.Unspecified
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = stringResource(Res.string.owner_info_point_count),
                        color = Color.White
                    )
                    Icon(
                        painter = painterResource(Res.drawable.ic_chevrolet_right),
                        contentDescription = stringResource(Res.string.owner_info_content_desc_navigate_detail),
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