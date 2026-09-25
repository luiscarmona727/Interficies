// Escriu un programa per representar les taules de multiplicar de l’1 a N, on N es un natural
// entrat pel teclat. Cada taula ha de mostrar les multiplicacions del 0 al 10.
package org.example
import java.util.Scanner
const val TAULAINICIAL=1
const val MINIMMULT=1
const val MAXIMMULT=10
fun main(){
    println("Escriu un numero N i imprimire les taules de multiplicar del $TAULAINICIAL a N:")
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    imprimirTaules(n)
}
fun imprimirTaules(n:Int){
    for(i in TAULAINICIAL..n){
        println("TAULA DEL $i:")
        for(j in MINIMMULT..MAXIMMULT){
            println("$i x $j = ${i*j}")
        }
        println()
    }
}