// Escriu un programa que ens mostri els N primers termes de la sèrie de Fibonacci, on N és un
// natural entrat pel teclat. (1, 1, 2, 3, 5, 8, 13, ... )
package org.example
import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    println("Escriu un numero N i calculare els N primers termes de la serie de fibonacci:")
    val n: Int = sc.nextInt()
    for (i in 1..n) {
        println("Fibonacci de $i = ${fibonacci(i)}")
    }
}
fun fibonacci(n: Int): Long {
    if(n<=1)
        return n.toLong()
    else
        return fibonacci(n,2,1,0)
}
fun fibonacci(n:Int, index:Int, fibAnt:Long, fib2Ant:Long): Long {
    var resultat:Long = 0
    if(index==n)
        resultat = fibAnt+fib2Ant
    else
        resultat = fibonacci(n, index + 1, fibAnt + fib2Ant, fibAnt);
    return resultat;
}
