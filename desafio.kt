class Usuario(val nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
    val formacao1 = Formacao("Desenvolvimento de Apps Android", listOf(
        ConteudoEducacional("Introdução ao Android"),
        ConteudoEducacional("Desenvolvimento de Interfaces com XML"),
        ConteudoEducacional("Programação Orientada a Objetos com Kotlin")
    ))
    
        val formacao2 = Formacao("Desenvolvimento Front end", listOf(
        ConteudoEducacional("Introdução ao HMTL"),
        ConteudoEducacional("Estilizando com CSS"),
        ConteudoEducacional("Utilizando Javascript")
    ))

    val usuario1 = Usuario("João")
    val usuario2 = Usuario("Maria")
    val usuario3 = Usuario("Lucas")
    val usuario4 = Usuario("Bruna")

    formacao1.matricular(usuario1)
    formacao1.matricular(usuario2)
    formacao1.matricular(usuario3)
    
    formacao2.matricular(usuario3)
    formacao2.matricular(usuario4)

    println("Alunos da formação: " + formacao1.nome)
    for (usuario in formacao1.inscritos) {
        println(usuario.nome)
    }
    
    println("Alunos da formação: " + formacao2.nome)
    for (usuario in formacao2.inscritos) {
        println(usuario.nome)
    }
}
