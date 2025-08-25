import java.lang.Math.*
import kotlin.random.Random

fun main() {

    println(" ========== EX1 ========== ")

    val x1 = Random.nextDouble() * 10
    val y1 = Random.nextDouble() * 10
    val x2 = Random.nextDouble() * 10
    val y2 = Random.nextDouble() * 10
    val distancia = sqrt(pow(x2 - x1, 2.0) + pow(y2 - y1, 2.0))
    println("Distância: $distancia")

    if(distancia < 5){
        println("[ENTRAR NO MODO ATAQUE]")
    }


    println(" ========== EX2 ========== ")

    println("Escreva uma palavra para verificar se é um palindromo")
    val palavra = readLine()?.lowercase()
    val palavraInvertida = palavra?.reversed()
    if(palavra == palavraInvertida) println("A palavra $palavra é palíndromo!") else println("A palavra $palavra não é palíndromo")


    println(" ========== EX3 ========== ")
    val n1 = Random.nextInt(9)
    val n2 = Random.nextInt(9)

    if ( (n1 + n2) % 2 == 0 ) println("Casa preta") else println("Casa branca")
}