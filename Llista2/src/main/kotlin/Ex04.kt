//Donada una sèrie de nombres acabada en zero, fes un programa que ens
// digui si aquesta sèrie està formada únicament per valors positius.
package org.example
import java.util.Scanner
fun main(){
    println("Escriu una serie de numeros i et dire si es estricament positiva, acaba amb 0")
    val sc = Scanner(System.`in`)
    var trobat=false
    val final=0

    var numeroActual :Int=sc.nextInt()
    if(numeroActual<0){
        trobat=true
    }

    while(!trobat && numeroActual!=final) {
        numeroActual=sc.nextInt()
        if(numeroActual<0){
            trobat=true
        }
    }

    if(trobat)
        println("La serie no es estrictament positiva")
    else
        println("La serie es estrictament positiva")
}
