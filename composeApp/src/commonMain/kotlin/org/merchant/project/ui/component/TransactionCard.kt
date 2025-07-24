package org.merchant.project.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import merchantcomposemultiplatform.composeapp.generated.resources.Res
import merchantcomposemultiplatform.composeapp.generated.resources.ic_chevrolet_right
import merchantcomposemultiplatform.composeapp.generated.resources.ic_qris_white
import merchantcomposemultiplatform.composeapp.generated.resources.transaction_card_content_desc_icon_to_qris_static
import merchantcomposemultiplatform.composeapp.generated.resources.transaction_card_content_desc_qris_logo
import merchantcomposemultiplatform.composeapp.generated.resources.transaction_card_income_date_label
import merchantcomposemultiplatform.composeapp.generated.resources.transaction_card_nominal
import merchantcomposemultiplatform.composeapp.generated.resources.transaction_card_show_qris
import merchantcomposemultiplatform.composeapp.generated.resources.transaction_card_to_detail
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun TransactionCard() {
    Card(
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White,
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
                    text = stringResource(Res.string.transaction_card_income_date_label),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.weight(1f)
                )
                Text(
                    text = stringResource(Res.string.transaction_card_to_detail),
                    fontWeight = FontWeight.Bold,
                    color = Color.Blue,
                    modifier = Modifier.padding(start = 8.dp)
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = stringResource(Res.string.transaction_card_nominal),
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
                        contentDescription = stringResource(Res.string.transaction_card_content_desc_qris_logo),
                        modifier = Modifier.height(20.dp)
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Text(
                        text = stringResource(Res.string.transaction_card_show_qris),
                        color = Color.Blue,
                        modifier = Modifier.padding(4.dp),
                    )
                    Icon(
                        painter = painterResource(Res.drawable.ic_chevrolet_right),
                        contentDescription = stringResource(Res.string.transaction_card_content_desc_icon_to_qris_static),
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