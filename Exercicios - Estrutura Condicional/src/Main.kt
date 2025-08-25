fun main() {

    /*
    1. Peça ao usuário para digitar um número inteiro e informe se ele é par ou ímpar,
    utilizando o if como expressão.
    */

    println(" ========== EX1 ========== ")

    println("Digite um número para verificar se ele é par ou impar: ")
    val num = readLine()?.toIntOrNull();

    if (num == null){
        println("Número inválido!")
    } else{
        if (num % 2 == 0){
            println("O numero $num é par!")
        } else {
            println("O numero $num é impar!")
        }
    }


    /*
    2. Escreva um programa que leia três números inteiros e indique qual o menor valor dentre
    eles.
    */

    println(" ========== EX2 ========== ")

    println("Digite três números para que seja exibido o menor entre eles: ")
    val num1 = readLine()?.toIntOrNull()
    val num2 = readLine()?.toIntOrNull()
    val num3 = readLine()?.toIntOrNull()

    var menor: Int = Int.MAX_VALUE

    if(num1 == null){
        println("O primeiro número digitado é inválido!")
    } else {
        if ( num1 < menor ){
            menor = num1
        }
    }

    if(num2 == null){
        println("O segundo número digitado é inválido!")
    } else {
        if ( num2 < menor ){
            menor = num2
        }
    }

    if(num3 == null){
        println("O terceiro número digitado é inválido!")
    } else {
        if ( num3 < menor ){
            menor = num3
        }
    }

    println("O menor número digitado foi o: $menor")


    /*
    3. Peça dois números e uma operação (+, -, *, /). Mostre o resultado da operação
    escolhida. Se a operação for inválida, exiba uma mensagem de erro.
    */

    println(" ========== EX3 ========== ")

    println("Digite dois números para realizar uma operação: ")
    val n1 = readLine()?.toDoubleOrNull();
    val n2 = readLine()?.toDoubleOrNull();

    if (n1 == null || n2 == null){
        println("Um dos números digitados é inválido")
    } else {
        println("Escolha uma operação: ")
        println("1 - (+)")
        println("2 - (-)")
        println("3 - (/)")
        println("4 - (*)")
        val operacao = readLine()?.toIntOrNull();

        if (operacao == null || operacao < 1 || operacao > 4) {
            print("Operação inválida!")
        } else {

            when (operacao) {
                1 -> println("A soma entre os números é: ${n1 + n2}")
                2 -> println("A subtração entre os números é: ${n1 - n2}")
                3 -> if (n1 == 0.0 || n2 == 0.0) {
                        println("Não é possível dividir por 0.")
                    } else {
                        println("A divisão entre os números é: ${n1 / n2}")
                    }
                4 -> println("A multiplicação entre os números é: ${n1 * n2}")
            }

        }

    }
}