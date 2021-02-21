package com.github.el_hopaness_romtic.fintech_tinkoff.oop

class Email(name: String, status: ClientStatus, username: String, domain: String) : Contact(status, name) {
    inner class EmailAddress(val username: String, val domain: String) {
        override fun toString() = "$username@$domain"
    }

    private val email = EmailAddress(username, domain)

    override fun getClientContact() = "$name ($status): $email"

    override fun sendOffer(text: String) {
        // arguments processing
        println("\"${text.short()}\" was sent to $status client via EMail ($email)\n")
    }
}