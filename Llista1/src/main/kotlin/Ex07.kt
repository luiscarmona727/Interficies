// Fes un programa que donat un import a pagar en Euros i una quantitat d’Euros amb la
// que es paga, ens descomposi el canvi en els diferents tipus de monedes (1 cèntim, 2 cèntims, 5 cèntims,
// 10 cèntims, 20 cèntims, 50 cèntims, 1 euro, 2 euros), de tal manera que hi hagi el mínim número de monedes.
// Si no hi haguès canvi no es pagués amb prou diners, cal informar d'aquest fet.
package org.example
import java.util.Scanner
fun main() {
    val sc = Scanner(System.`in`)
    var eurosAPagar : Double = 0.0
    var eurosPagats: Double=0.0
    println("Import a pagar en euros:")
    eurosAPagar = sc.nextDouble()
    println("Import pagat en euros:")
    eurosPagats = sc.nextDouble()
    if(eurosAPagar>eurosPagats)
        println("Fons insuficients, no s'ha pogut pagar l'import (falten ${eurosAPagar-eurosPagats} euros)")
    else if(eurosAPagar==eurosPagats)
        println("Import pagat, canvi retornat: 0,00 euros")
    else
        println("Import pagat, canvi retornat: ${canvi(eurosAPagar, eurosPagats)}")
}
fun canvi(eurosAPagar: Double, eurosPagats: Double):String{
    var cadena :String = ""
    var m2Euro : Int = 0
    var m1Euro : Int = 0
    var m50cent: Int=0
    var m20cent: Int=0
    var m10cent: Int=0
    var m5cent: Int=0
    var m2cent: Int=0
    var m1cent: Int=0

    var centimsACanviar = (eurosPagats-eurosAPagar)*100
    m2Euro=(centimsACanviar/200).toInt()
    centimsACanviar%=200
    m1Euro=(centimsACanviar/100).toInt()
    centimsACanviar%=100
    m50cent=(centimsACanviar/50).toInt()
    centimsACanviar%=50
    m20cent=(centimsACanviar/20).toInt()
    centimsACanviar%=20
    m10cent=(centimsACanviar/10).toInt()
    centimsACanviar%=10
    m5cent=(centimsACanviar/5).toInt()
    centimsACanviar%=5
    m2cent=(centimsACanviar/2).toInt()
    centimsACanviar%=2
    m1cent=centimsACanviar.toInt()

    cadena= "$m2Euro moneda/es de 2 euros, $m1Euro moneda/es de 1 euro, " +
            "$m50cent moneda/es de 50 centims, $m20cent moneda/es de 20 centims, " +
            "$m10cent moneda/es de 10 centims, $m5cent moneda/es de 5 centims, " +
            "$m2cent moneda/es de 2 centims, $m1cent moneda/es de 1 centim"
    return cadena
}
