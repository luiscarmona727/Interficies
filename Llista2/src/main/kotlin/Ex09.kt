//Feu un programa, que ens digui si un número donat és primer.
package org.example
import java.util.Scanner
fun main(){
    println("Entra un numero i et dire si es primer:")
    val sc = Scanner(System.`in`)
    val numero = sc.nextInt()
    var trobat = false
    var final = false
    var possibleDivisor=2

    if(numero<2) {
        println("El numero no es primer")
    }
    else{
        while(!trobat && !final) {
            if(numero%possibleDivisor==0&&possibleDivisor!=numero){
                trobat=true
            }
            if(possibleDivisor==numero){
                final=true
            }
            possibleDivisor++
        }

        if(final){
            println("El numero es primer")
        }
        else{
            println("El numero no es primer")
        }
    }
}
