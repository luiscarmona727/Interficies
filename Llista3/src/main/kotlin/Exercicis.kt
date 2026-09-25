package Llista3
import java.util.Scanner
const val N = 3
const val M = 3
const val NUMINICIAL = 1
fun main(){
    println("EXERCICI 2:")
    mostraMatriu(ompleMatriuEx02())
    println()
    println("EXERCICI 3:")
    mostraMatriu(ompleMatriuEx03())
    println()
    println("EXERCICI 4:")
    mostraMatriu(ompleMatriuEx04())
    println()
    println("EXERCICI 5:")
    mostraMatriu(ompleMatriuEx05())
    println()
    println("EXERCICI 6:")
    mostraMatriu(ompleMatriuEx06())
    println()
    println("EXERCICI 7:")
    mostraVector(ompleVectorEx07())
    println()
    println("EXERCICI 8:")
    valorMenorPosEx08()
    println()
}
//1. Fes una un programa que utilitzi dues funcions, una que rebi una matriu quadrada i la mostri
// per la consola, i una altra que rebi un vector i també mostri el seu contingut per pantalla.
fun mostraVector(llista:List<Int>){
    print("[ ")
    for(i in llista){
        print("$i ")
    }
    print("]")
}
fun mostraMatriu(matriu:List<List<Int>>){
    for(fila in matriu){
        print("[ ")
        for(valor in fila){
            print("$valor ")
        }
        print("]")
        println()
    }
}
//2. Omple una matriu de NxM de la manera següent:
//1	1 1
//2	2 2
//3	3 3
fun ompleMatriuEx02():List<List<Int>>{
    val matriu=mutableListOf<List<Int>>()
    for(i in 0 until N){
        val fila = mutableListOf<Int>()
        for(j in 0 until M){
            fila.add(i+1)
        }
        matriu.add(fila)
    }
    return matriu
}
//3. Omple una matriu de NxM de la manera següent:
//1	2 3
//1	2 3
//1	2 3
fun ompleMatriuEx03():List<List<Int>>{
    val matriu=mutableListOf<List<Int>>()
    for(i in 0 until N){
        val fila = mutableListOf<Int>()
        for(j in 0 until M){
            fila.add(j+1)
        }
        matriu.add(fila)
    }
    return matriu
}
//4. Omple una matriu de NxM amb números naturals consecutius. ex:
//1	2	3	4
//5	6	7	8
//9	10	11	12
fun ompleMatriuEx04():List<List<Int>>{
    val matriu=mutableListOf<List<Int>>()
    var numero=NUMINICIAL
    for(i in 0 until N){
        val fila = mutableListOf<Int>()
        for(j in 0 until M){
            fila.add(numero)
            numero++
        }
        matriu.add(fila)
    }
    return matriu
}
//5. Omple una matriu NxM amb números naturals consecutius en ordre invers: ex:
//12 11	10 9
//8	7 6	5
//4	3 2	1
fun ompleMatriuEx05():List<List<Int>>{
    val matriu=mutableListOf<List<Int>>()
    var numero=N*M
    for(i in 0 until N){
        val fila = mutableListOf<Int>()
        for(j in 0 until M){
            fila.add(numero)
            numero--
        }
        matriu.add(fila)
    }
    return matriu
}
//6. Omple una matriu de NxN de la manera següent:
//1	0 0	0
//0	1 0	0
//0	0 1	0
//0	0 0	1
fun ompleMatriuEx06():List<List<Int>>{
    val matriu=mutableListOf<List<Int>>()
    for(i in 0 until N){
        val fila = mutableListOf<Int>()
        for(j in 0 until M){
            if(i==j)
                fila.add(1)
            else
                fila.add(0)
        }
        matriu.add(fila)
    }
    return matriu
}
//7. Omplir un vector de N elements enters amb valors entrats pel teclat.
fun ompleVectorEx07():MutableList<Int>{
    val sc = Scanner(System.`in`)
    val vector=mutableListOf<Int>()
    var numero:Int=0
    for(i in 0 until N){
        println("ENTRA UN NUMERO:")
        numero=sc.nextInt()
        vector.add(numero)
    }
    return vector
}
//8. Buscar el valor més petit d'un vector i la seva posició.
fun valorMenorPosEx08(){
    val sc = Scanner(System.`in`)
    val vector=ompleVectorEx07()
    var minim = Int.MAX_VALUE
    var posicio=0
    vector.forEachIndexed { index, valor ->
        if (valor<minim){
            minim = valor
            posicio = index
        }
    }
    println(mostraVector(vector))
    println("VALOR MES PETIT: $minim , POSICIO: $posicio")
}
//9. Buscar el valor més petit dins d'una matriu (NxM) i la seva posició.
fun valorMenorPosEx09(){
    val sc = Scanner(System.`in`)

    val matriu=mutableListOf<MutableList<Int>>()
    for(i in 0 until M){
        val vector=ompleVectorEx07()
        matriu.add(vector)
    }

    var minim = Int.MAX_VALUE
    var posicioN=0
    var posicioM=0


    println(mostraMatriu(matriu))
    println("VALOR MES PETIT: $minim , POSICIO: $posicioN,$posicioM")
}