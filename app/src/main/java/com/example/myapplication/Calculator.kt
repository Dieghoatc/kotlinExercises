fun main() {
    println("Ingrese primer valor: ")
    val firstValue: Float = readln().toFloat()

    println("Ingrese segundo valor: ")
    val secondValue: Float = readln().toFloat()
    calculator(firstValue, secondValue)
}

fun addition(firstNumber: Float, secondNumber: Float): String {
    val result = firstNumber + secondNumber
    return result.toString()
}

fun subtraction(firstNumber: Float, secondNumber: Float): String {
    val result = firstNumber - secondNumber
    return result.toString()
}

fun multiplication(firstNumber: Float, secondNumber: Float): String {
    val result = firstNumber * secondNumber
    return result.toString()
}

fun division(firstNumber: Float, secondNumber: Int): String {
    if (secondNumber == 0) {
        return "No se puede dividir por cero"
    } else {
        val result = firstNumber / secondNumber
        return result.toString()
    }
}

fun calculator(firstNumber: Float, secondNumber: Float) {
    printer(
        addition(firstNumber, secondNumber),
        subtraction(firstNumber, secondNumber),
        multiplication(firstNumber, secondNumber),
        division(firstNumber, secondNumber.toInt())
    )
}

fun printer(suma: String, resta: String, multiplication: String, division: String) {
    println("Resultado :")
    println("| Suma           | = ${suma}")
    println("| Resta          | = ${resta}")
    println("| Multiplicación | = ${multiplication}")
    println("| División       | = ${division}")
}