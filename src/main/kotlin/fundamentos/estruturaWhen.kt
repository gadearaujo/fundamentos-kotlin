package fundamentos

import java.util.*

fun main() {

//    val x = 21
//
//    when(x) {
//        5, -5 -> println("x == 5")
//        8 -> println("x == 8")
//        9 -> println("x == 9")
//        10 -> {
//            println("x == 10")
//            println("X é uma dezena")
//        }
//        in 11 .. 15 -> println("X está entre 11 e 15")
//        !in 11..20 -> println("número não está no range de 11 a 20")
//        else -> println("Número não mapeado")
//    }
//    println(comecaComOi("Oi"))

    when {
        comecaComOi(5) -> println("5")
        comecaComOi("oi, tudo bem") -> println("oi, tudo bem")
    }

}

fun comecaComOi(x: Any) : Boolean {
   return when (x) {
        is String -> x.lowercase(Locale.getDefault()).startsWith("oi")
        else -> false
    }
}