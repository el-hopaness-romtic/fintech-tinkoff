package com.github.el_hopaness_romtic.fintech_tinkoff.oop

class PhoneApp(name: String, status: ClientStatus, private val phoneID: String) : Contact(status, name) {
    override fun getClientContact() = "$name ($status): $phoneID"

    override fun sendOffer(text: String) {
        // arguments processing
        println("\"${text.short()}\" was sent to a $status client via notification ($phoneID)\n")
    }

    fun sendSilentNotification(text: String) {
        // arguments processing
        println("\"${text.short()}\" was sent to a $status client via silent notification ($phoneID)\n")
    }
}