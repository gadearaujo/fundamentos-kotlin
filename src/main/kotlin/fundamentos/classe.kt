package fundamentos

data class Pessoa (var nome: String, var idade: Int) {

    override fun toString(): kotlin.String {
        return "Classe: Pessoa. Nome: ${nome}: Idade ${idade}"
    }

}
fun main() {
    var gabriel = Pessoa(nome = "Gabriel", idade = 24)
    println(gabriel)
}