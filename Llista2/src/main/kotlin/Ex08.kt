//Feu un programa, que després d’haver-li entrat N números positius,
// ens digui quin és el més petit, i quina posició ocupa dins la seqüència.
package org.example
import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    println("Quants numeros vols comprobar?")
    val n = sc.nextInt()
    var numero:Int=0
    var posicio:Int=0
    var posicioMinim:Int=0
    var minim = Int.MAX_VALUE
    for(i in 1..n){
        numero = sc.nextInt()
        posicio++
        if(numero<minim){
            minim=numero
            posicioMinim=posicio
        }
    }
    println("Minim de la serie: $minim")
    println("Posicio del numero minim: $posicioMinim")
}
