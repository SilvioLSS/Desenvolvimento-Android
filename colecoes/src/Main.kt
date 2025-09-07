fun main() {

    println(" ========== EX1 ========== ")

    val numeros = mutableListOf<Int>();

    println("Digite 5 números inteiros: ");
    for(i in 1..5){
        numeros.add(readLine()?.toIntOrNull() ?: 0);
    }

    val pares = numeros.filter { it % 2 == 0 };

    if (pares.size == 0) println("Nenhum número par encontrado!") else println(pares)


    println(" ========== EX2 ========== ")

    println("Digite uma frase: ");
    val frase = readLine();
    val palavras = frase?.split(" ");
    val palavrasUnicas = palavras?.toSet();
    println(palavrasUnicas)
    val qtdPalavrasUnicas = palavrasUnicas?.size;

    println("Na frase há $qtdPalavrasUnicas palavras únicas");
}