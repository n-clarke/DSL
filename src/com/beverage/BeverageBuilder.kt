package com.beverage

fun beverage(input: Beverage.() -> Unit) = Beverage().apply(input) //obj.apply(lambda)

fun main(){
    val dsl = beverage {
        name = "Coffee"
        size = CupSize.LARGE
        syrups {
            syrup("Caramel")
            syrup("Chocolate")
            syrup("Vanilla")
        }
        toppings {
            + "Cream"
            + "Flake"
            + "Cinnamon"
            + "Marshmallow"
        }
    }
    dsl.brew()
}
