package org.merchant.project

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "Hello Test for push, ${platform.name}!"
    }
}