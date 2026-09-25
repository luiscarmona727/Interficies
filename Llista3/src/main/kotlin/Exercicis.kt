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
    println("EXERCICI 9:")
    valorMenorPosEx09()
    println()
    println("EXERCICI 10:")
    maxMinAvgEx10()
    println()
    println("EXERCICI 11:")
    capgiraVector()
    println()
    println("EXERCICI 12:")
    comuns()
    println()
    println("EXERCICI 13:")
    noComuns()
    println()
    println("EXERCICI 14:")
    fusio()
    println()
    println("EXERCICI 15:")
    coronaRei()
    println()
    println("EXERCICI 16:")
    reunioVeins()
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
    println("ENTRA LA SERIE DE NUMEROS:")
    for(i in 0 until N){
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
    mostraVector(vector)
    println()
    println("VALOR MES PETIT: $minim , POSICIO: $posicio")
}
//9. Buscar el valor més petit dins d'una matriu (NxM) i la seva posició.
fun valorMenorPosEx09(){
    val sc = Scanner(System.`in`)

    val matriu=mutableListOf<MutableList<Int>>()
    for(i in 0 until N){
        val vector=ompleVectorEx07()
        matriu.add(vector)
    }

    var minim = Int.MAX_VALUE
    var minimFila=-1
    var minimColumna=-1

    matriu.forEachIndexed { fila, valors ->
        valors.forEachIndexed { columna, valor ->
            if (valor < minim) {
                minim = valor
                minimFila = fila
                minimColumna = columna
            }
        }
    }

    mostraMatriu(matriu)
    println("VALOR MES PETIT: $minim , POSICIO: $minimFila,$minimColumna")
}
//10.Calcular el màxim, el mínim i el promig d’un taula de n elements.
fun maxMinAvgEx10(){
    val sc = Scanner(System.`in`)
    val vector=ompleVectorEx07()

    var minim=Int.MAX_VALUE
    var maxim=Int.MIN_VALUE
    var promig:Double
    var sumaValors=0

    vector.forEach{ valor ->
        if(valor<minim){
            minim = valor
        }
        if(valor>maxim){
            maxim = valor
        }
        sumaValors+=valor
    }
    promig=sumaValors/N.toDouble()

    mostraVector(vector)
    println()
    println("VALOR MES PETIT: $minim , VALOR MES GRAN: $maxim PROMIG: $promig")
}

//11. Capgirar un vector de N elements.
fun capgiraVector(){
    val sc = Scanner(System.`in`)
    val vector=ompleVectorEx07()
    var vectorCapgirat=mutableListOf<Int>()

    for(valor in vector){
        vectorCapgirat.addFirst(valor)
    }
    mostraVector(vector)
    println("VECTOR CAPGIRAT: ")
    mostraVector(vectorCapgirat)
}
//12. Donades dues taules ordenades, sense duplicats i no necessàriament de la mateixa longitud dissenyar un programa que ens doni els elements comuns a les dues taules.
fun comuns(){
    val sc = Scanner(System.`in`)
    val vector1=mutableListOf<Int>(1,2,4,6,8,11,15)
    val vector2=mutableListOf<Int>(1,2,3,6,8,9,11,25,33,)
    val vectorComuns= mutableListOf<Int>()

    var i=0
    var j=0

    while(i<vector1.size&&j<vector2.size){
        if(vector1[i]>vector2[j]){
            j++
        }
        else if(vector1[i]<vector2[j]){
            i++
        }
        else{
            vectorComuns.add(vector1[i])
            i++
            j++
        }
    }

    println("VECTOR AMB COMUNS: ")
    mostraVector(vectorComuns)
}
//13. Donades dues taules ordenades, sense duplicats i no necessàriament de la mateixa longitud dissenyar un programa que ens doni els elements no comuns a les dues.
fun noComuns(){
    val sc = Scanner(System.`in`)
    val vector1=mutableListOf<Int>(1,2,4,6,8,11,15)
    val vector2=mutableListOf<Int>(1,2,3,6,8,9,11,25,33,)
    val vectorNoComuns= mutableListOf<Int>()

    var i=0
    var j=0

    while(i<vector1.size&&j<vector2.size){
        if(vector1[i]>vector2[j]){
            vectorNoComuns.add(vector2[j])
            j++
        }
        else if(vector1[i]<vector2[j]){
            vectorNoComuns.add(vector1[i])
            i++
        }
        else{
            i++
            j++
        }
    }

    while(i<vector1.size){
        vectorNoComuns.add(vector1[i])
        i++
    }

    while(j<vector2.size){
        vectorNoComuns.add(vector2[j])
        j++
    }
    println("VECTOR AMB COMUNS: ")
    mostraVector(vectorNoComuns)
}
//14. Donades dues taules ordenades, sense duplicats i no necessàriament de la mateixa longitud dissenyar un programa que les fusioni.

fun fusio(){
    val sc = Scanner(System.`in`)
    val vector1=mutableListOf<Int>(1,2,4,6,8,11,15)
    val vector2=mutableListOf<Int>(1,2,3,6,8,9,11,25,33,)
    val vectorFusio= mutableListOf<Int>()

    var i=0
    var j=0

    while(i<vector1.size&&j<vector2.size){
        if(vector1[i]>vector2[j]){
            vectorFusio.add(vector2[j])
            j++
        }
        else if(vector1[i]<vector2[j]){
            vectorFusio.add(vector1[i])
            i++
        }
        else{
            vectorFusio.add(vector1[i])
            i++
            j++
        }
    }

    while(i<vector1.size){
        vectorFusio.add(vector1[i])
        i++
    }

    while(j<vector2.size){
        vectorFusio.add(vector2[j])
        j++
    }
    println("VECTOR FUSIONAT: ")
    mostraVector(vectorFusio)
}
//15. Quan coronen un rei, cal decidir el número que l'identificarà per a la posteritat, sinó seria difícil distingir a reis amb el mateix nom.
//Donada una taula amb una gran quantitat de noms diversos, de vegades repetits (cal que no es diferenciï entre majúscules i minúscules),
// cal crear una estructura de dades que permeti que l'usuari pregunti una vegada i una altra per un nom i el programa li contesti quin número se li
// hauria d'associar. Si el nom no existia, la resposta serà 1. Si el nom ja s'ha repetit 3 vegades, la resposta serà 4 La taula tan sols es pot llegir
// una vegada, les consultes cal fer-les sobre l'estructura de dades que s'ha creat.
fun coronaRei(){
    val sc = Scanner(System.`in`)
    println("ESCRIU LA LLISTA DE REIS ACTUALS SEPARAT PER ESPAIS:")
    val reis=mutableMapOf<String,Int>()
    val noms = sc.nextLine().trim().split(" ")
    for(nom in noms){
        val clau = nom.lowercase()
        reis[clau] = (reis[clau] ?: 0) + 1
    }

    println("QUIN REI VOLS CORONAR?:")
    val reiCoronar=sc.next().trim().lowercase()
    var numeroRei = 0

    numeroRei=(reis[reiCoronar] ?: 0) + 1

    println("REI CORONAT: $reiCoronar $numeroRei")
}

//16. Sempre que tenim reunió de veïns, tenim el mateix problema. No podem començar fins que hi ha representades la meitat de les vivendes del bloc de pisos.
//El secretari de la comunitat ens demana un programa per determinar si podem o no començar la reunió.
//El programa rebrà com a entrada:
//Número de pisos del bloc
//Número de portes de cada pis
//Una cadena de text que representarà la vivenda on viu cada assistent de la reunió. La cadena tindrà el format pis i porta separats per espais.
//"1 A 2 A 2 B" i hi ha una entrada "num lletra" per a cada assistent. Per tant, hi haurà pisos repetits.
//Cal dir, si a la cadena de text hi ha representada al menys la meitat de les vivendes de l'edifici.
//Número d'assistents fins al moment, ha de coincidir amb la cadena de text, en l'exemple 3.
fun reunioVeins() {
    val sc = Scanner(System.`in`)
}
