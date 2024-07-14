/*
Escribe un programa que imprima el mensaje de resumen según la cantidad de notificaciones que recibiste.
El mensaje debe incluir lo siguiente:

 * La cantidad exacta cuando haya menos de 100 notificaciones.
 * 99+ Como cantidad de notificaiones cuando haya mas de 100

 */

fun main() {

    println("Ingrese el numero de notificaciones =")
    val notifications: Int = readln().toInt()


    if (notifications < 100) {
        println("Notificaciones : $notifications")
    } else {
        println("Notificaciones : +99")
    }
}