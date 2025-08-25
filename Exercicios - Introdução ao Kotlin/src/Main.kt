fun main() {
    /*
        1. Leia uma palavra do usuário e exiba-a em maiúsculas e em minúsculas.
        Entrada: Kotlin → Saída: Maiúsculas: KOTLIN | Minúsculas: kotlin
    */
    println(" ========== EX1 ========== ")
    println("Digite uma palavra e ela será exibida em letras maúsuclas e minúsculas.")
    val palavra = readLine();
    println("Maiúsculas: ${palavra?.uppercase()} | Minúsculas: ${palavra?.lowercase()}")


    /*
        2. Peça dois números inteiros e mostre a soma deles.
        Entrada: 3 e 7 → Saída: A soma é 10.
    */
    println(" ========== EX2 ========== ")
    println("Digite dois números para ver o resultado da soma entre eles.")
    val n1 = readLine()?.toIntOrNull() ?: 0
    val n2 = readLine()?.toIntOrNull() ?: 0
    println("A soma é ${n1?.plus(n2)}")


    /*
    3. Leia um número inteiro e mostre se ele é par ou ímpar. Trate entradas inválidas usando toIntOrNull().
    */
    println(" ========== EX3 ========== ")
    println("Digite um número inteiro para verificar se ele é par ou impar.")
    val n = readLine()?.toIntOrNull()

    if (n == null){
        println("Número inválido!")
    } else {
        if (n % 2 == 0) {
            println("O número é par!")
        } else {
            println("O numero é impar!")
        }
    }


    /*
    4. Solicite três notas (decimais) e calcule a média. Exiba se o aluno está aprovado (média ≥ 6), recuperação (média entre 4 e 5.9) ou reprovado (média < 4).
    */
    println(" ========== EX4 ========== ")
    println("Digite as três notas do aluno para calcular a média e verificar se está aprovado, reprovado ou de recuperação.")

    val nota1 = readLine()?.toDoubleOrNull()
    val nota2 = readLine()?.toDoubleOrNull()
    val nota3 = readLine()?.toDoubleOrNull()
    if (nota1 == null || nota2 == null || nota3 == null){
        println("Uma entre as três notas digitadas é inválida!")
    } else {
        val media: Double = (nota1 + nota2 + nota3) / 3
        println("Média: $media")
        if (media >= 6){
            println("O aluno esta aprovado.")
        } else if ( media >= 4 && media <= 5.9 ){
            println("O aluno esta de recuperação.")
        } else {
            println("O aluno está reprovado!")
        }
    }


    /*
    5. Crie um programa que leia um valor em graus Celsius e pergunte se o usuário quer converter para Fahrenheit ou Kelvin.
    */

    println("Digite um valor em Graus Celsius: ")
    val celsius = readLine()?.toDoubleOrNull()

    println("Escolha uma opção: ")
    println("1 - Converter para Fahrenheit")
    println("2 - Converter para Kelvin")
    val opcao = readLine()?.toIntOrNull() ?: 0

    if (celsius == null){
        println("Voce digitou um valor invalido para celsius.")
    } else {
        if (opcao == 1){
            println("$celsius graus Celsius são ${celsius * 9/5 + 32} Fahrenheit")
        } else if (opcao == 2){
            println("$celsius graus Celsius são ${celsius + 273.15} Kelvin")
        } else {
            println("Opção Inválida! ")
        }
    }

}