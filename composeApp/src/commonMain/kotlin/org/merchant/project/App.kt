package org.merchant.project

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.merchant.project.ui.component.BottomBar

@Composable
@Preview
fun App() {
    MaterialTheme {
        Scaffold(
            bottomBar = { BottomBar() }
        ) {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = Color(0xDDE1F7).copy(1f)
            ) {
                Column(
                    modifier = Modifier.verticalScroll(rememberScrollState())
                ) {
////                    Header()
//                    Spacer(modifier = Modifier.height(28.dp))
//                    TransactionCard()
//                    Spacer(modifier = Modifier.height(28.dp))
//                    BannerRow(dummyPromoBanner)
//                    BannerRow(dummyPromoBanner)
                }
            }
        }
    }
}