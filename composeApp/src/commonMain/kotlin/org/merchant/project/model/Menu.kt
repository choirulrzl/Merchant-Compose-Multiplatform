package org.merchant.project.model

import merchantcomposemultiplatform.composeapp.generated.resources.Res
import merchantcomposemultiplatform.composeapp.generated.resources.ic_dashboard_report
import merchantcomposemultiplatform.composeapp.generated.resources.ic_kasir_dashboard
import merchantcomposemultiplatform.composeapp.generated.resources.ic_pesanan_dashboard
import merchantcomposemultiplatform.composeapp.generated.resources.menu_cashier
import merchantcomposemultiplatform.composeapp.generated.resources.menu_order
import merchantcomposemultiplatform.composeapp.generated.resources.menu_report
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.StringResource
import org.jetbrains.compose.resources.stringResource

data class Menu(
    val title: String,
    val iconPainter: DrawableResource
)

val dummyMenu = listOf<Menu>(
    Menu("Pesanan", Res.drawable.ic_pesanan_dashboard),
    Menu("Kasir", Res.drawable.ic_kasir_dashboard),
    Menu("Laporan", Res.drawable.ic_dashboard_report)
)
