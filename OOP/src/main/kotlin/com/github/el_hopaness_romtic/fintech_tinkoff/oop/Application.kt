package com.github.el_hopaness_romtic.fintech_tinkoff.oop

fun main() {
    val contacts = listOf<Contact>(
        Email("Белов Владислав", Contact.ClientStatus.VIP, "vladislav007", "gmail.com"),
        PhoneApp("Голубева Ксения", Contact.ClientStatus.STANDARD, "Andriod/iitsfg8d465g1h"),
        Email("Юдина Елизавета", Contact.ClientStatus.STANDARD, "udina1998", "mail.ru"),
        Phone("Петров Глеб", Contact.ClientStatus.STANDARD, "7", "3657891438"),
        Phone("Аксёнов Денис", Contact.ClientStatus.STANDARD, "375", "8791959562"),
        PhoneApp("Новикова Алиса", Contact.ClientStatus.VIP, "iOS/ty8r9h46df5g1b3c")
    )

    contacts.forEach { it.sendOffer("Акция: 3 сырка по цене 2! Успейте до 22.02") }

    println("--------------------------------\n")

    contacts
        .filterIsInstance<PhoneApp>()
        .forEach { it.sendSilentNotification("Рекомендуется обновить приложение") }

    println("--------------------------------\n")

    contacts
        .filterIsInstance<Phone>()
        .forEach { println(it.getClientContact()) }

    println("\n--------------------------------\n")

    contacts
        .filter { it.status == Contact.ClientStatus.VIP }
        .forEach { it.sendOffer("%CLIENT_NAME%, для вас доступно специальное предложение: . . . ") }
}