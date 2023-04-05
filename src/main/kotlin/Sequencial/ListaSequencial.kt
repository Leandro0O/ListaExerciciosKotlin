package Sequencial

import java.util.Scanner

val scanner = Scanner(System.`in`)

class ListaSequencial {

    //Criar um algoritmo que leia um número
    //inteiro e apresente na tela o seu antecedente e o seu sucessor.

    fun ex01(): Unit {
        println("Informe um numero:")
        var n1 = scanner.nextInt()

        print("Antecessor ${n1 - 1}\nSucessor: ${n1 + 1}")
    }

    //    Criar um algoritmo que lê dois números inteiros e imprime os números consecutivos desses números. (Por exemplo: se o usuário digitar 2 e ­9, a saída deverá ser 3 e ­8, porque 3 é consecutivo de 2. –8 é consecutivo de –9).
    //
    fun ex02(): Unit {

        println("Informe um número:")
        var n1 = scanner.nextInt()

        println("Informe um segundo número:")
        var n2 = scanner.nextInt()

        println("Conssecutivo de ${n1} é ${n1 + 1} e o conseccutivo de ${n2} é ${n2 + 1}")

    }

    //Criar um algoritmo que leia dois números inteiros e apresenta na tela a soma, subtração, multiplicação e divisão dos respectivos números.

    fun ex03(): Unit {

        println("Informe um número:")
        var n1 = scanner.nextInt()
        println("Informe outro número:")
        var n2 = scanner.nextInt()

        println("${n1} + ${n2} = ${(n1 + n2)}")
        println("${n1} - ${n2} = ${(n1 - n2)}")
        println("${n1} x ${n2} = ${(n1 * n2)}")
        println("${n1} / ${n2} = ${(n1 / n2)}")
    }

    //    Criar um algoritmo que leia dois números inteiros e apresente na tela o resto da divisão do primeiro pelo segundo número.

    fun ex04(): Unit {
        println("Informe um número:")
        var n1 = scanner.nextInt()

        println("Informe outro numero:")
        var n2 = scanner.nextInt()

        println("${n1} % ${n2} = ${(n1%n2)}")

    }


}