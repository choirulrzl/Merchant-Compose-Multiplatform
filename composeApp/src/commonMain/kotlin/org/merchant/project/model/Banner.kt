package org.merchant.project.model

import merchantcomposemultiplatform.composeapp.generated.resources.Res
import merchantcomposemultiplatform.composeapp.generated.resources.image_1
import merchantcomposemultiplatform.composeapp.generated.resources.image_2
import merchantcomposemultiplatform.composeapp.generated.resources.image_3
import merchantcomposemultiplatform.composeapp.generated.resources.image_4
import merchantcomposemultiplatform.composeapp.generated.resources.image_5
import org.jetbrains.compose.resources.DrawableResource

data class Banner(
    val image: DrawableResource,
    val title: String
)

val dummyBanner = listOf(
    Banner(Res.drawable.image_1, "image 1"),
    Banner(Res.drawable.image_2, "image 2"),
    Banner(Res.drawable.image_3, "image 3"),
    Banner(Res.drawable.image_4, "image 4"),
    Banner(Res.drawable.image_5, "image 5"),
)

val dummyPromoBanner = dummyBanner.shuffled()