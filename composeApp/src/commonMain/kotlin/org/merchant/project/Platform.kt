package org.merchant.project

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform