package com.beverage

class Topping {
    private var values = mutableListOf<String>()
    operator fun String.unaryPlus() = values.add(this)
    fun print() = values.map { "\t$it" }.forEach(::println)
}