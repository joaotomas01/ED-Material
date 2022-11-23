fun main(args: Array<String>) {
    println("Qual o seu nome")
    val nome : String? = readLine()
    Pessoa(nome ?: "John Doe")
    println("O seu nome e $nome")
    /*
    processamento (errorCallback = {
        println("Deu asneira")
    })
    */
    // como isto e kotlin podemos fazer:

    processamento {
        println("Deu asneira")
    }
}

data class Pessoa(val nome : String)

fun processamento (errorCallback: () -> Unit) {
    try {

    } catch (e: Exception) {

    }
}