package fundamentos

fun main () {
//    var listaImutavel = listOf(1, 2, 3, 4, 5, 6) // Imutavel
//
//    var lista = mutableListOf(1, 2, 3, 4, 5, 6, 20, 15) // mutavel
//
//    var setNumeros = mutableSetOf(1, 2, 3, 2) // nao aceita valores duplicados

    var mapNomeIdade = mutableMapOf("Gabriel" to 24, "Daniel" to 23) // nao pode ter key duplicada
    mapNomeIdade.put("Bruno", 26)
    mapNomeIdade["Bruno"] = 27
    println(mapNomeIdade)

    mapNomeIdade.remove("Bruno")

    println(mapNomeIdade)

//    val pares = lista.filter { it % 2 == 0}.first()

//    println(lista)
//
//    lista.sort() // ordenar lista
//
//    println(lista)
//
//    lista.shuffle() // embaralhar lista
//
//    println(lista)

//    lista.add(8)
//    lista.removeAt(0)
//    lista.remove(2)
//    lista[0] = 20

//    lista.forEach{
//        println(it)
//    }
//
//    for (numero in lista) {
//        println(numero)
//    }

//    println(lista[0])
//    println(lista.get(0))
//    println(lista.size)
//    println(lista.indexOf(3))

//    println(pares)
}