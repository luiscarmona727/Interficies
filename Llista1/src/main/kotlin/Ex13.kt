//Escriure un programa en el que quan se li entra un lletra minúscula, ensenya la seva majúscula
// corresponent. (Només si se li entra una lletra minúscula)
package org.example
import java.util.Scanner

fun main(){
    val sc = Scanner(System.`in`)
    println("Introdueix una lletra minuscula i et tornare la majuscula:")
    var lletra: String = sc.next()
    while(lletra !in "a".."z"){
        println("No has introduit una lletra minuscula, siusplau torna a intentar:")
        lletra=sc.next()
    }
    println(lletra.uppercase())
}