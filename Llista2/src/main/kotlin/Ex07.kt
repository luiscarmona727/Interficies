//Feu un programa que a l’entrar N números enters, ens digui quants d’ells eren múltiples de
// 3 i quants més grans o iguals a 5. Cal tenir en compte que el zero no és múltiple de 3.
package org.example
import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    println("Quants numeros vols comprobar?")
    val n = sc.nextInt()
    var numero:Int=0
    var multiplesDe3:Int=0
    var mesGranOIgual5:Int=0
    for(i in 1..n){
        numero = sc.nextInt()
        if(numero%3==0&&numero!=0){
            multiplesDe3++
        }
        if(numero>=5){
            mesGranOIgual5++
        }
    }
    println("Multiples de 3: $multiplesDe3")
    println("Mes gran o iguals a 5: $mesGranOIgual5")
}
