// Escriu un programa en que calculi el valor absolut de la diferència de dos números entrats pel teclat.
package org.example
import java.util.Scanner
fun main() {
    println("Escriu 2 numeros i et dire el valor absolut de la seva diferencia")
    val sc = Scanner(System.`in`)
    var n1 = sc.nextInt()
    var n2 = sc.nextInt()

    println(diferenciaAbs(n1,n2))


}
fun diferenciaAbs(n1: Int, n2: Int):Int{
    var resultat: Int

    resultat=n1-n2

    if(resultat<0)
        resultat=resultat*-1

    return resultat
}