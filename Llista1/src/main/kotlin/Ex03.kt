// Donats dos números naturals (no negatius) entrats pel teclat que han de ser diferents de
// zero (en cas de que algun dels números, o tots dos siguin zero, cal que tregui un missatge d’error
// per pantalla), digues si són divisors entre ells. No importa l'ordre en que s'entrin en número,
// són divisors entre ells i un d'ells divideix l'altre
package org.example
import java.util.Scanner
fun main() {
    println("Escriu 2 numeros i et dire si son divisibles")
    val sc = Scanner(System.`in`)
    val n1 = sc.nextInt()
    val n2 = sc.nextInt()
    if(n1<=0||n2<=0)
        throw Exception("Els numeros no poden ser 0 o negatius")
    println(sonDivisibles(n1,n2))
}
fun sonDivisibles(n1:Int, n2:Int):Boolean{
    var sonDiv : Boolean
    var major:Int
    var menor:Int
    if(n1>n2) {
        major=n1
        menor=n2
    }
    else if(n2>n1) {
        major=n2
        menor=n1
    }
    else {
        major=n1
        menor=n2
    }
    if(major%menor==0)
        sonDiv=true
    else
        sonDiv=false

    return sonDiv
}