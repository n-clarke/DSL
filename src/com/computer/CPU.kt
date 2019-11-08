package com.computer

class CPU {
    private var values = mutableListOf<String>()
    fun syrup(syrup:String) = values.add(syrup)
    fun print() = values.map { "\t$it" }.forEach(::println)
}