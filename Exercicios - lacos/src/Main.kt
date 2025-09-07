import kotlin.random.Random

fun main() {

    println(" ========== EX1 ========== ")

    print("Informe a quantidade de números que deseja somar: ");
    val qtd : Int = readLine()?.toIntOrNull() ?: 0;
    var soma : Double = 0.0;

    if(qtd <= 0 ){
        print("Quantidade inválida.")
    } else {
        for (i in 1..qtd){
            print("Digite o número $i: ");
            soma += readLine()?.toDoubleOrNull() ?: 0.0;
        }
    }

    println("A soma dos números é: $soma");


    println(" ========== EX2 ========== ")

    print("Digite um número: ");
    val num = readLine()?.toIntOrNull() ?: 0;

    if ( num <= 0 ) {
        print("Digite um número válido!")
    } else {
        for ( i in 1..num ){
            print("\n")
            for ( j in 1..i ){
                print("#");
            }
        }
    }


    println("\n ========== EX3 ========== ")

    val na : Int = Random.nextInt(1, 101);

    println("Tente adivinhar o número secreto entre 1 e 100. (Você tem 10 tentativas!): ");
    var nt : Int = readLine()?.toIntOrNull() ?: 0;


    for ( i in 1..10 ){
        if ( nt == na ) {
            println("Parabéns você ganhou!");
            break;
        } else {
            if ( na > nt ){
                println("Você errou, o número é maior! Tente novamente (você tem ${10 - i} tentativas): ")
                nt = readLine()?.toIntOrNull() ?: 0;
            } else {
                println("Você errou, o número é menor! Tente novamente (você tem ${10 - i} tentativas): ")
                nt = readLine()?.toIntOrNull() ?: 0;
            }
        }
    }

}