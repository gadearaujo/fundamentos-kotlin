package fundamentos
fun main() {
    dizOi(retornaNome(), 24)
    dizOi(idade = 24, nome = "Gabriel")
    dizOi("Gabriel")
}
fun retornaNome(): String {
    return "Gabriel"
}

fun dizOi(nome: String, idade: Int = 20) {
    println("Oi, ${nome}, parabéns pelos seus ${idade} anos")
}