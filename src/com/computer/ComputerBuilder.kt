package com.computer

fun computer(input: Computer.() -> Unit) = Computer().apply(input)

fun main(){
    val dsl = computer {
        modelId = "0000000"
        program {
            + "Paint"
            + "Notepad"
            + "Outlook"
        }
    }
    dsl.build()
}
