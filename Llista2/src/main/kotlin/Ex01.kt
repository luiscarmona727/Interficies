//Donada una frase acabada en punt, fes un programa que
// compti el nombre de caràcters que hi apareixen, sense comptar el punt finalitzador.
package org.example
import java.util.Scanner
fun main(){
    println("Escriu una frase acabada en . i et dire quants caracters te")
    val entrada = Scanner(System.`in`)
    entrada.useDelimiter("")
    var nChars = 0
    var caracterActual:Char = entrada.next()[0]

    while (caracterActual != '.')
    {
        nChars ++
        caracterActual = entrada.next()[0]
    }

    print ("S'han llegit $nChars caracters")
}

