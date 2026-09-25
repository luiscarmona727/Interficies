//Escriu l’algorisme d’Euclides per calcular el Màxim Comú Divisor de dos números estrictament positius.
package org.example
import java.util.Scanner
fun main() {
    val sc = Scanner(System.`in`)

    println("Introdueix el primer numero (ha de ser positiu):")
    var a = sc.nextInt()
    while (a <= 0) {
        println("Error: El numero ha de ser mes gran que 0. Torna a provar:")
        a = sc.nextInt()
    }

    println("Introdueix el segon numero (ha de ser positiu):")
    var b = sc.nextInt()
    while (b <= 0) {
        println("Error: El numero ha de ser mes gran que 0. Torna a provar:")
        b = sc.nextInt()
    }

    val mcd = calcularMCD(a, b)
    println("El Maxim Comu Divisor de $a i $b es: $mcd")
}

fun calcularMCD(num1: Int, num2: Int): Int {
    var a = num1
    var b = num2
    while (b != 0) {
        val residu = a % b
        a = b
        b = residu
    }
    return a
}
