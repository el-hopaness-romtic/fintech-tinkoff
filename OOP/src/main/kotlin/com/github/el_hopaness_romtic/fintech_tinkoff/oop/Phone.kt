package com.github.el_hopaness_romtic.fintech_tinkoff.oop

class Phone(name: String, status: ClientStatus, code: String, number: String) : Contact(status, name) {
    inner class PhoneNumber(val code: String, val number: String) {
        override fun toString() = "+$code$number"
    }

    private val phoneNumber = PhoneNumber(code, number)

    override fun getClientContact() = "$name ($status): $phoneNumber"

    override fun sendOffer(text: String) {
        // arguments processing
        println("\"${text.short()}\" was sent to a $status client via SMS ($phoneNumber)\n")
    }

    fun sendOfferMMS(img_raw: String, text: String) {
        // arguments processing
        println("Offer was sent to a $status client via MMS ($phoneNumber)\n")
    }
}