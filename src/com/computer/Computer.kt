package com.computer

class Computer
{
    var modelId: String? = null
    private var cpu: CPU? = null
    private var hdd: HDD? = null
    private var ram: RAM? = null
    private var programs: DefaultPrograms? = null
    fun cpu(input: CPU.() -> Unit) {
        cpu = CPU()
        cpu?.input()
    }
    fun hdd(input: HDD.() -> Unit) {
        hdd = HDD()
        hdd?.input()
    }
    fun ram(input: RAM.() -> Unit) {
        ram = RAM()
        ram?.input()
    }
    fun program(input: DefaultPrograms.() -> Unit) {
        programs = DefaultPrograms()
        programs?.input()
    }
    fun build(){
        println("Model Id :\n  \t$modelId")
        println("CPU :\n  \t$cpu")
        println("HDD Size :\n  \t$hdd")
        println("RAM Size :\n  \t$ram")
        println("Default Programs")
        programs?.print()
    }
}