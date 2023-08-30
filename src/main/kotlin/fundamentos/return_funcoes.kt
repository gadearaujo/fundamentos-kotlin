package fundamentos
fun retornaNumeroPorExtenso(numero: Int): String {
    if (numero == 5) {
        return "Cinco"
    } else if(numero == 6) {
        return "Seis"
    }
    return "Número naão mapeado"
}
fun main() {
    println(retornaNumeroPorExtenso(6))
}