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

        println("${n1} % ${n2} = ${(n1 % n2)}")

    }

//    Criar um algoritmo que leia a idade de uma pessoa expressa em anos e apresente na tela esta idade expressa em meses e dias.

    fun ex05(): Unit {
        println("Informe sua idade em anos:")
        var idade = scanner.nextInt()

        var meses = idade * 12
        var dias = idade * 365

        println("Anos: ${idade}\nMeses: ${meses}\nDias: ${dias}")
    }

//    Criar um algoritmo que leia a idade de uma pessoa expressa em anos, mês e dias e apresente na tela a idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.
    fun ex06() : Unit{
    println("Informe sua idade em anos:")
    var anos = scanner.nextInt()

    println("Informe sua idade em meses:")
    var meses = scanner.nextInt()

    println("Informe sua idade em dias:")
    var dias = scanner.nextInt()

    var total = (anos*365) + (meses + 30) + dias

    println("Idade: ${total} dias")
    }

//    Criar um algoritmo que leia a idade de uma pessoa expressa em dias e apresente na tela a idade dessa pessoa expressa em anos, meses e dias. Considerar ano com 365 dias e mês com 30 dias.

    fun ex07(): Unit{
        println("Informe sua idade em dias:")
        var idade = scanner.nextInt()

        var anos = idade / 365
        var meses = (idade % 365) / 30
        var  dias = (idade % 365) % 30

        println("Anos: ${anos}\nMeses: ${meses}\nDias: ${dias}")
    }

//    Criar um algoritmo que receba uma determinada hora (hora e minutos separados) e apresente na tela a hora em minutos.
    fun ex08(): Unit{
        println("Informe as horas")
        println("Horas:")
        var horas = scanner.nextInt()
        println("Minutos:")
        var minutos = scanner.nextInt()
        var ht = (horas * 60) + minutos
        println("${horas} ${ if (horas > 1) "horas" else "hora"} e ${minutos} ${ if (minutos > 1) "minutos" else "minuto"} = ${ht} minutos")

    }
}
