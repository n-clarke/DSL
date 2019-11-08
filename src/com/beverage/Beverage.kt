package com.beverage

enum class CupSize { SMALL, MEDIUM, LARGE }

class Beverage {
    var name: String? = null
    var size = CupSize.LARGE
    private var syrups: Syrups? = null //private lateinit var syrups: Syrups
    private var topping: Topping? = null
    fun brew() {
        println("Beverage Type:\n  \t$name")
        println("With the following syrups:")
        syrups?.print()
        println("With the following toppings:")
        topping?.print()
    }
    fun syrups(input: Syrups.() -> Unit) {
        syrups = Syrups()
        syrups?.input()
    }

    fun toppings(input: Topping.() -> Unit) {
        topping = Topping()
        topping?.input()
    }
}