package com.github.el_hopaness_romtic.fintech_tinkoff.oop

abstract class Contact(var status: ClientStatus, protected val name: String) {
    enum class ClientStatus {
        STANDARD, VIP
    }

    abstract fun getClientContact(): String
    abstract fun sendOffer(text: String)

    fun String.short() = replace("%CLIENT_NAME%", name).slice(IntRange(0, 15)) + "..."
}