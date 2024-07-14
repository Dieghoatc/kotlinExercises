/*
Programa ingresos:

Escribe un programa que calcule los precios de las entradas basadas en la edad.
 * Precio de entrada infantil $15.000 para personas menores a 12 años o menos.
 * Un precio de entrada estandar de $30.000 para personas entre los 13 y 60 años,
  los lunes el precio estandar de descuento $25.000 para ese grupo etario.
 * Un precio para adultos mayores de $20.000 para personas mayores a 61 años hasta los 100 años.
 * Un valor de -1 cuando un usuario ingresa una edad fuera de las indicadas en el programa.

 */

data class Person(val name: String, val age: Int, val ticket: Int)

fun main() {
    val people = mutableListOf<Person>()

    println("Ingrese el dia: ")
    val day = readln().lowercase()

    println("Ingrese la cantidad de personas: ")
    val numberPersons: Int = readln().toInt()

    if (numberPersons == 0) {
        return println("No hay personas")
    }

    personalData(people, numberPersons, day)
    printer(people)
}

fun personalData(
    people: MutableList<Person>,
    numberPersons: Int,
    day: String
) {

    for (i in 1..numberPersons) {
        println("Ingrese el nombre de la persona #${i}: ")
        val namePerson: String = readln()

        println("Ingrese la edad de la persona #${i}: ")
        val age: Int = readln().toInt()

        val ticket: Int = validatePrices(age, day)
        val person = Person(namePerson, age, ticket)
        people.add(person)

    }
}

fun validatePrices(age: Int, day: String): Int {

    val childishPrice: Int = 15000
    val standardPrice: Int = 30000
    val standardWithDiscountPrice: Int = 25000
    val olderAdults: Int = 20000
    val ticket: Int

    if (age < 12) {
        ticket = childishPrice
    } else if (age >= 12 && age < 60 && day == "lunes") {
        ticket = standardWithDiscountPrice
    } else if (age >= 12 && age < 60 ) {
        ticket = standardPrice
    } else if (age >= 60 && age <= 100) {
        ticket = olderAdults
    } else {
        ticket = -1
    }
    return ticket
}

fun printer(people: MutableList<Person>) {
    for ((name, age, ticket) in people) {
        println("| $name        | $age Años    | $$ticket pesos")
    }
}

