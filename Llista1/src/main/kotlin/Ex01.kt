// Escriu un programa que demani tres números entrats pel teclat, i ens digui quin és el més gran de
// tots tres. Cal contemplar la possibilitat de que dos dels tres números, o tots tres siguin iguals.
package org.example
import java.util.Scanner
fun main() {
    println("Escriu 3 numeros i et dire el mes gran")
    val sc = Scanner(System.`in`)
    var n1 = sc.nextInt()
    var n2 = sc.nextInt()
    var n3 = sc.nextInt()

    numeroMesGran(n1,n2,n3)
}
fun numeroMesGran(n1: Int, n2: Int, n3: Int){
    var major:Int=Int.MIN_VALUE

    if(n1>major)
        major=n1
    if(n2>major)
        major=n2
    if(n3>major)
        major=n3

    if(n1==n2&&n1==n3)
        println("El numero mes gran es $major i tots els numeros son iguals")
    else if(n1!=n2&&n1!=n3&&n2!=n3)
        println("El numero mes gran es $major i tots els numeros son diferents")
    else
        println("El numero mes gran es $major i hi ha dos numeros iguals")
}