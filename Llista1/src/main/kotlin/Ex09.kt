//Escriu un programa que ens proporcioni la següent sortida:
//
//1 = 1
//1 + 2 = 3
//1 + 2 + 3 = 6
// ...
//Cal generar tantes línies com indiqui una entrada pel teclat.
package org.example
import java.util.Scanner
fun main(){
    println("Escriu el numero de linies a generar:")
    val sc = Scanner(System.`in`)
    val linies = sc.nextInt()
    imprimirSumes(linies)
}
fun imprimirSumes(n:Int){
    for(i in 1..n){
        var suma=0
        val cadenaSuma = StringBuilder()
        for (j in 1..i) {
            suma += j
            cadenaSuma.append(j)
            if (j < i) {
                cadenaSuma.append(" + ")
            }
        }
        println("$cadenaSuma = $suma")
    }
}