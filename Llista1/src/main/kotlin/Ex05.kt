// Escriu un programa que donat un número enter que designa un període de temps
// expressat en segons, ens informi per pantalla de l’equivalent en format dies, hores : minuts : segons.
package org.example
import java.util.Scanner
fun main() {
    println("Escriu una quantitat de segons i t'ho passare a d:hh:mm:ss")
    val sc = Scanner(System.`in`)
    val segonsTotal = sc.nextInt()

    println("El temps total es ${segonsFormat(segonsTotal)}")
}
fun segonsFormat(segonsTotal: Int):String{
    var cadena :String = ""
    var segonsRestants=segonsTotal
    var dies : Int=0
    var hores : Int=0
    var minuts : Int=0
    var segons : Int=0

    dies=segonsRestants/86400
    segonsRestants%=86400
    hores=segonsRestants/3600
    segonsRestants%=3600
    minuts=segonsRestants/60
    segonsRestants%=60
    segons=segonsRestants%60
    if(dies>0)
        cadena=String.format("%d:%02d:%02d:%02d", dies, hores, minuts, segons)
    else
        cadena=String.format("%02d:%02d:%02d", hores, minuts, segons)
    return cadena
}