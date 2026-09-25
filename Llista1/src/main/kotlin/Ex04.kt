// Dissenyeu un programa que ens informi si un any qualsevol és de traspàs.
// (Són de traspàs tots els anys múltiples de quatre, que no ho son de cent, a no ser,
// que siguin múltiples de quatre-cents, que llavors sí que són de traspàs)
package org.example
import java.util.Scanner
fun main() {
    println("Escriu un any i et dire si es de traspas")
    val sc = Scanner(System.`in`)
    val any = sc.nextInt()

    println(esTraspas(any))
}
fun esTraspas(any:Int):Boolean{
    var res:Boolean=false;
    if(any%4==0)
        res=true
    if(any%100==0 && any%400!=0)
        res=false
    return res;
}