package fundamentos

class Carro (var cor: String, var anoFabricacao: Int, var marca: String, var categoria: String,
    val dono: Dono) {
}
data class Dono(var nome: String, var idade: Int) {

}
fun main () {
    var carro = Carro("Vermelho", 2004, "Honda", "Sedan",
        Dono("Gabriel", 24))
    println(carro.cor)
    carro.cor = "Azul"
    println(carro.cor)
    println(carro.dono.idade)
}