//Fes un programa que permeti triar entre calcular la longitud d’una circumferència,
// l’àrea d’un cercle o el volum d’una esfera donat un Radi entrat pel teclat.
// (Longitud = 2 * π * Radi; Àrea = π * Radi * Radi; Volum = 4/3 * π * Radi * Radi * Radi)
package org.example
import java.util.Scanner
import kotlin.math.PI
import kotlin.math.pow

fun main(){
    val sc = Scanner(System.`in`)
    do {
        var radi:Double = 0.0
        mostrarMenu()
        val tecla = sc.nextInt()
        if(tecla==1){
            println("Escriu el radi amb el que vols treballar:")
            radi = sc.nextDouble()
            println("Longitud de la circumferencia: ${longCirc(radi)}")
        }
        else if(tecla==2){
            println("Escriu el radi amb el que vols treballar:")
            radi = sc.nextDouble()
            println("Area del cercle: ${areaCerc(radi)}")
        }
        else if(tecla==3) {
            println("Escriu el radi amb el que vols treballar:")
            radi = sc.nextDouble()
            println("Volum de l'esfera: ${volumEsf(radi)}")
        }
        else
            println("Opcio no valida, escull una opcio valida")
    }
    while (tecla!=0)
}
fun mostrarMenu(){
    println("CALCULADORA")
    println("------------------------")
    println("1-CALCULAR LONGITUD DE CIRCUMFERENCIA")
    println("2-CALCULAR AREA DEL CERCLE")
    println("3-CALCULAR VOLUM DE L'ESFERA")
    println("0-SORTIR DEL PROGRAMA")
}
fun longCirc(radi:Double):Double{
    var resultat = 2* PI*radi;
    return resultat
}
fun areaCerc(radi:Double):Double{
    var resultat=PI* radi.pow(2.0)
    return resultat
}
fun volumEsf(radi:Double):Double{
    var resultat = 4.0/3* PI*radi.pow(3.0)
    return resultat
}