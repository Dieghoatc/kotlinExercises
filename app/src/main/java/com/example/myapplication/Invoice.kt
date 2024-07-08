/* 2. Realice un programa que calcula una factura así.
    - a. Se ingresan tres precios (la sumatoria de los precios dan el SUBTOTAL)
    - b. Subtotal es igual al la suma de los precios.
    - c. IVA =  (subtotal * 0.19 => 19%)
*/

fun main() {

    println("Ingrese el primer valor")
    var priceOne: Float = readln().toFloat()

    println("Ingrese el segundo valor")
    var priceTwo: Float = readln().toFloat()

    println("Ingrese el tercer valor")
    var priceThree: Float = readln().toFloat()

    val subTotal = subTotal(priceOne, priceTwo, priceThree)
    val iva = iva(subTotal)
    val total = totalInvoice(subTotal, iva)

    invoice(subTotal, iva, total)
}

fun subTotal(priceOne: Float, priceTwo: Float, priceThree: Float): Float {
    return priceOne + priceTwo + priceThree
}

fun iva(subTotal: Float): Float {
    return subTotal * 0.19f
}

fun totalInvoice(iva: Float, subTotal: Float): Float {
    return iva + subTotal
}

fun invoice(subTotal: Float, iva: Float, total: Float) {
    println("| Subtotal = ${subTotal}")
    println("| IVA      = ${iva}")
    println("| Total    = ${total}")
}