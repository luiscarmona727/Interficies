// Donada una expressió horària en el format hores, minuts, segons (cal que entrin 3 números
// i valideu que estiguin entre 0 i 23 o 0 i 59 en el cas dels minuts i segons), afegiu-hi un segon
// i retorneu el resultat en el mateix format.
package org.example
import java.util.Scanner
fun main() {
    println("Escriu hores, minuts i segons i afegire 1 segon")
    val sc = Scanner(System.`in`)
    var hores :Int=-1
    var minuts :Int=-1
    var segons :Int=-1
    println("Hores (entre 0 i 23):")
    hores = sc.nextInt()
    while (hores !in 0..23) {
        println("Siusplau escriu una hora entre 0 i 23:")
        hores = sc.nextInt()
    }
    println("Minuts (entre 0 i 59):")
    minuts = sc.nextInt()
    while (minuts !in 0..59) {
        println("Siusplau escriu un minut entre 0 i 59:")
        minuts = sc.nextInt()
    }
    println("Segons (entre 0 i 59):")
    segons = sc.nextInt()
    while (segons !in 0..59) {
        println("Siusplau escriu un segon entre 0 i 59:")
        segons = sc.nextInt()
    }

    println("Temps entrat: ${String.format("%02d:%02d:%02d", hores, minuts, segons)}")
    println("El teu temps mes 1 segon: ${horaMesUnSegon(hores,minuts,segons)}")
}
fun horaMesUnSegon(hores:Int,minuts:Int,segons:Int):String{
    var cadena :String = ""
    var segonsMod:Int=segons
    var minutsMod:Int=minuts
    var horesMod:Int=hores

    segonsMod+=1;
    if (segonsMod==60){
        segonsMod=0
        minutsMod+=1
        if(minutsMod==60){
            minutsMod=0
            horesMod+=1
            if(horesMod==24){
                horesMod=0
            }
        }
    }

    cadena=String.format("%02d:%02d:%02d", horesMod, minutsMod, segonsMod)
    return cadena
}