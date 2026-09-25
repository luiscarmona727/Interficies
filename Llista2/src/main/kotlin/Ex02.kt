//Donada una frase acabada en punt, fes un programa que compti el nombre de caràcters que hi apareixen
// a partir de la primera ‘a’, ja sigui majúscula o minúscula.
package org.example
import java.util.Scanner
fun main(){
    println("Escriu una frase acabada en . i et dire quants caracters te a partir de la primera a")
    val entrada = Scanner(System.`in`)
    entrada.useDelimiter("")
    var nChars = 0
    var caracterActual:Char = entrada.next()[0]
    while (caracterActual != 'a' && caracterActual != 'A')
    {
       caracterActual = entrada.next()[0]
    }
    caracterActual = entrada.next()[0]
    nChars++
    while(caracterActual != '.'){
        caracterActual = entrada.next()[0]
        nChars++
    }

    print ("S'han llegit $nChars caracters")
}