package Sequencial

import java.util.*
import kotlin.math.roundToInt

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
        var dias = (idade % 365) % 30

        println("Anos: ${anos}\nMeses: ${meses}\nDias: ${dias}")
    }

    //    Criar um algoritmo que receba uma determinada hora (hora e minutos separados) e apresente na tela a hora em minutos.
    fun ex08(): Unit {
        println("Informe as horas")
        println("Horas:")
        var horas = scanner.nextInt()
        println("Minutos:")
        var minutos = scanner.nextInt()
        var ht = (horas * 60) + minutos
        println("${horas} ${if (horas > 1) "horas" else "hora"} e ${minutos} ${if (minutos > 1) "minutos" else "minuto"} = ${ht} minutos")

    }

    //    Criar um algoritmo que leia o tempo de duração de um evento em uma fábrica expressa em segundos e apresente-o na tela expresso em horas, minutos e segundos.
    fun ex09(): Unit {
        println("Informe a duaração do evento em segundos:")
        var ts = scanner.nextInt()
        var horas = ts / 3600
        var min = (ts % 3600) / 60
        var seg = (ts % 3600) % 60
        println("Tempo total do evento : ${horas}  : ${min}  : ${seg}")
    }

    //    Criar um algoritmo que leia uma velocidade fornecida em m/s (metros por segundo) e apresente na tela a velocidade em km/h. Para efetuar a conversão, multiplique o valor em m/s por 3.6.
    fun exe10(): Unit {
        println("Informe a velocidade em metros por segundo:")
        var ms = scanner.nextDouble()

    }

    //    Criar um algoritmo que leia uma distância e o total de litros de combustível gasto por um automóvel para percorrê-la, calcule e apresente na tela o consumo médio de combustível.
    fun ex11(): Unit {

        println("Informe a distancia percorrida:")
        var d = scanner.nextDouble()
        println("Informe a quantidade de combustivel sonsumido na viagem:")
        var l = scanner.nextDouble()
        var cm = d / l
        println("O consumo médio foi: ${String.format("%.2f", cm)} litros")
    }

    //    Criar um algoritmo que receba o valor do salário de um funcionário e o valor do salário mínimo e apresente na tela quantos salários mínimos ganha esse funcionário.
    fun ex12(): Unit {
        println("Informe seu o salario do funcionario: R$")
        var sf = scanner.nextDouble()
        println("Informe  o valor do salario minimo: R$")
        var sm = scanner.nextDouble()
        var quant = sf / sm
        println("O funcionario recebe ${quant.roundToInt()} salarios")
    }
//    Criar um algoritmo que receba três notas de um aluno e apresente na tela a média aritmética entre essas notas.
    fun ex13(): Unit{
        println("Informe a primeira nota:")
    var n1 = scanner.nextDouble()
    println("Informe a segunda  nota:")
    var n2 = scanner.nextDouble()
    println("Informe a terceira nota:")
    var n3 = scanner.nextDouble()
    var media = (n1+n2+n3) / 3
    println("A media é: ${String.format("%.2f",media)}")
    }
}
