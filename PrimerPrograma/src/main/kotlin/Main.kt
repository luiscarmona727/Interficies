package org.example
import java.util.Scanner
fun main() {
    var mida: Int = 10
    val paraula = "Bon dia"
    var cadena : String?=null
    var midaNullable: Int ? = if(mida>0) mida else null
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()

    println(a+b)
    midaNullable = cadena?.length

    mida=cadena?.length?:0
    println(multiplica(10, 5))
    saluda("Pipe")
    saluda()

    while (mida>0){
        println("mida: $mida")
        mida--
    }

    for(i: Int in 1..10){
        println("index:$i")
    }
    for(i in 0 until mida){
        println("index: $i")
    }
    (0..10).forEach { valor:Int->
        println("index: $valor")
    }
    (0..10).forEach {
        println("index: $it")
    }
    (0..10).forEachIndexed { valor, index ->
        println("index:$index valor:$valor")
    }
}
fun multiplica(a:Int, b:Int):Int = a*b
fun saluda(nom:String="Marta"): Unit {
    println("Hola, $nom!")
}

fun mesGran(a:Int, b:Int):Int {
    if(a>b)
        return a
    else
        return b
}

fun selecciona(valor:Int){
    when{
        valor<0 -> println("Negativo")
        valor == 0 -> println("Zero")
        valor > 0 -> println("Positivo")
    }
    when(valor){
        1 -> println("Opció 1")
        2 -> println("Opció 2")
        3,4,5 -> println("Opció entre 3 i 5")
        in (6..10)-> println("Opció entre 6 i 10")
        else -> println("Opcio no valida")
    }
}