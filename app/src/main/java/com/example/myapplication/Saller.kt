/* 3. Calcule el total a pagar a un vendedor según las siguientes caracteristicas.

    - Si venta es menor a 500.000 el vendedor no tendra comisión
    - Si venta es menor a 1.000.000 el vendedor tendra 5% comisión (venta * 0.05)
    - Si venta es menor a 1.500.000 el vendedor tendra el 10% comisión (venta * 0.10)
    - Si venta es menor a 2.000.000 el vendedor tendra el 15% comisión (venta * 0.15)
    - Si venta es mayor a 2.000.000 el vendedor tendra el 20% comisión (venta * 0.20)

    NOTA: Todos los vendedores tiene un básico de 1.600.000
*/

fun main() {

    val baseSalary: Float = 1600000f

    println("Ingrese el valor de la venta =>")
    val sale: Float = readln().toFloat()

    commission(sale, baseSalary)

}

fun calculateSalary(sale: Float, commission: Float, baseSalary: Float): Pair<Float, Float> {
    val commissionTotal: Float = sale * commission
    println(commissionTotal)
    val totalSalary: Float = baseSalary + commissionTotal
    return Pair(commissionTotal, totalSalary)
}

fun commission(sale: Float, baseSalary: Float) {

    val commission1: Float = 500000f
    val commission2: Float = 1000000f
    val commission3: Float = 1500000f
    val commission4: Float = 2000000f

    if (sale < commission1) {
        val (commissionTotal, totalSalary) = calculateSalary(sale, 0f, baseSalary)
        invoice(
            baseSalary.toString(),
            sale.toString(),
            commissionTotal.toString(),
            totalSalary.toString()
        )
    } else if (sale < commission2) {
        val (commissionTotal, totalSalary) = calculateSalary(sale, 0.05f, baseSalary)
        invoice(
            baseSalary.toString(),
            sale.toString(),
            commissionTotal.toString(),
            totalSalary.toString()
        )
    } else if (sale < commission3) {
        val (commissionTotal, totalSalary) = calculateSalary(sale, 0.10f, baseSalary)
        invoice(
            baseSalary.toString(),
            sale.toString(),
            commissionTotal.toString(),
            totalSalary.toString()
        )
    } else if (sale < commission4) {
        val (commissionTotal, totalSalary) = calculateSalary(sale, 0.15f, baseSalary)
        invoice(
            baseSalary.toString(),
            sale.toString(),
            commissionTotal.toString(),
            totalSalary.toString()
        )
    } else if (sale > commission2) {
        val (commissionTotal, totalSalary) = calculateSalary(sale, 0.20f, baseSalary)
        invoice(
            baseSalary.toString(),
            sale.toString(),
            commissionTotal.toString(),
            totalSalary.toString()
        )
    }

}

fun invoice(baseSalary: String, sale: String, commission: String, totalSalary: String) {
    println("| Salario base  = $${baseSalary}")
    println("| Valor venta   = $${sale}")
    println("| Comisión      = $${commission}")
    println("| Salario total = $${totalSalary}")
}
