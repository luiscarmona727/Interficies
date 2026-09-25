//Donada una sèrie de nombres acabada en zero, fes un programa que ens digui si aquesta sèrie és
// creixent.
package org.example
import java.util.Scanner
fun main(){
    println("Escriu una serie de numeros i et dire si es creixent, acaba amb 0")
    val sc = Scanner(System.`in`)
    var trobat=false
    val final=0

    var numeroActual :Int=sc.nextInt()
    var numeroSeguent:Int=sc.nextInt()
    if (numeroSeguent<numeroActual)
        trobat=true
    numeroActual = numeroSeguent

    while(!trobat && numeroActual!=final) {
        numeroActual =sc.nextInt()
        numeroSeguent =sc.nextInt()
        if (numeroSeguent<numeroActual&&numeroSeguent!=0)
            trobat=true
        numeroActual = numeroSeguent
    }

    if(trobat)
        println("La serie no es creixent")
    else
        println("La serie es creixent")
}
