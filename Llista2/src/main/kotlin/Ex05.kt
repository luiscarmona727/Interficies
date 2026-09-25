//Feu un programa que permeti la introducció d’una sèrie de números fins que un d’aquests números
// sigui major que la suma dels dos números anteriors. Al finalitzar, ha de dir el número d'introduccions
// i valors dels números que han complert la condició de finalització del programa.
package org.example
import java.util.Scanner
fun main(){
    println("Escriu la serie de numeros, para quan un sigui mes gran que la suma dels dos anteriors:")
    val sc = Scanner(System.`in`)

    var numero2Ant:Int=0
    var numero1Ant:Int=0
    var numeroActual=0
    var sumaDosAnteriors:Int=0
    var contador=3

    numero2Ant=sc.nextInt()
    numero1Ant=sc.nextInt()
    numeroActual=sc.nextInt()
    sumaDosAnteriors=numero2Ant+numero1Ant

    while(numeroActual<sumaDosAnteriors){
        numero2Ant=numero1Ant
        numero1Ant=numeroActual
        numeroActual=sc.nextInt()
        sumaDosAnteriors=numero2Ant+numero1Ant
        contador++
    }

    println("Valors introduits: $contador")
    println("Numero antepenultim: $numero2Ant")
    println("Numero penultim: $numero1Ant")
    println("Suma dels dos anteriors: $sumaDosAnteriors")
    println("Numero actual: $numeroActual")
}
