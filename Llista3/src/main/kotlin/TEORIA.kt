package Llista3

fun main(){
    var numList = listOf(1,2,3,4,5)
    val mutableNumList = mutableListOf(1,2,3,4,5)

    numList=listOf(10,20,30,40,50)
    mutableNumList[0]=100
    mutableNumList.add(60)

    val modificable=numList.toMutableList()
    modificable.add(444)
    numList=modificable

    numList.removeFirst()
    modificable.removeFirst()

    for(num in modificable){
        println(num)
    }

    numList.forEach { num->
        println(num)
    }

    numList.forEachIndexed { index, num->
        println("Index: $index, Value: $num")
    }

    val valors = mutableMapOf(
        "As" to 1,
        "Dos" to 2,
        "Tres" to 3,
        "Sota" to 4,
        "Cavall" to 5,
        "Rei" to 6
    )
    println(valors["As"])

    val parells=numList.filter { num->num%2==0 }
}