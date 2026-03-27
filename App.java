import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        ex01();
        ex02();
        ex03();
        ex04();
        ex05();
        ex06();
        ex07();
        ex08();
        ex09();


    }

    // EX 01

    //Crie um programa em Java que solicite o nome e exiba a mensagem
    //“Olá” logo depois o nome digitado.

    public static void ex01() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Olá " + nome);
    }

    // EX 02

    // Crie um programa que solicite dois valores numéricos. O mesmo devera calcular e exibir:
    // A soma dos dois valores
    // A multiplicação dos dois valores
    // A subtração dos dois valores
    // A divisão dos dois valores

    public static void ex02() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Primeiro Numero: ");
        double num1 = sc.nextDouble();

        System.out.println("Digite o Segundo Numero: ");
        double num2 = sc.nextDouble();

        double soma = num1 + num2;
        double multiplicacao = num1 * num2;
        double subtracao = num1 - num2;
        double divisao = num1 / num2;


        System.out.println("Soma " + soma);
        System.out.println("Multiplicação " + multiplicacao);
        System.out.println("Subtração " + subtracao);
        System.out.println("Divisão " + divisao);

    }

        // EX 03

        // Crie um programa que solicite o peso e altura de uma determinada
        //pessoa e calcule o seu IMC (Índice de Massa Corpórea). A fórmula:
        //IMC = peso * altura2

        public static void ex03() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Peso: ");
        double peso = sc.nextDouble();

        System.out.println("Digite a Altura: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura*altura);
        System.out.println("Seu imc é: " +imc);

    }
    //EX 04

    //Crie um programa que receba o salário de um funcionário e calcule o
    //novo salário com um aumento de 15%. Por Exemplo:

    public static void ex04() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Salário: ");

        double salario = sc.nextDouble();

        double newsalario = salario + (salario * 0.15);
        System.out.println("Seu novo salario é: " + newsalario);

    }

    // EX 05

    //Uma loja paga aos seus vendedores:
    //a. Salário base de R$ 1.800,00
    //b. Comissão fixa de R$ 150,00 por produto vendido
    //c. 3% sobre o valor total das vendas
    //Escreva um programa que solicite:
    //• Nome do vendedor
    //• Quantidade de produtos vendidos
    //• Valor total das vendas
    //O programa deve calcular e exibir o salário final.

    public static void ex05() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do vendedor: ");
        String nome = sc.nextLine();

        System.out.println("Digite a quantidade de vendas: ");
        int quantidade = sc.nextInt();

        System.out.println("Digite o valor total de vendas: ");
        double totalVendas = sc.nextDouble();

        double salarioBase = 1800;
        double comissaoProdutos = quantidade * 150;
        double comissaoVendas = totalVendas * 0.3;
        double salarioFinal = salarioBase + comissaoProdutos + comissaoVendas;

        System.out.println("Vendedor: " + nome);
        System.out.println("Salario: " + salarioFinal);


    }
    // Ex06

    // Escreva um programa que receba dois números inteiros e troque seus valores utilizando uma terceira variável auxiliar. Exiba os valores antes e depois da troca.
    public static void ex06() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero 1: ");
        int numero1 = sc.nextInt();

        System.out.println("Digite o numero 2: ");
        int numero2 = sc.nextInt();

        System.out.println("Antes da Troca: ");
        System.out.println("Numero1 : " + numero1);
        System.out.println("Numero2 : " + numero2);

        int aux = numero1;
        numero1 = numero2;
        numero2 = aux;

        System.out.println("Depois da Troca: ");
        System.out.println("Numero1 : " + numero1);
        System.out.println("Numero2 : " + numero2);

    }
    // Ex07

    // Escreva um programa que receba um número inteiro com quatro dígitos e mostre o número invertido.

    public static void ex07() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número de 4 digitos: ");
        int numero = sc.nextInt();

        int milhar = numero / 1000;
        int centena = (numero % 1000) / 100;
        int dezena = (numero % 100) / 10;
        int unidade = numero % 10;

        int ordeminvert = unidade * 1000 + dezena * 100 + centena * 10 + milhar;
        System.out.println("Numero invertido : " + ordeminvert);
    }
    // Ex08

    // Escreva um programa que receba um número inteiro com quatro dígitos e mostre o número invertido.

    public static void ex08() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a distância percorrida(km): ");
        double distancia = sc.nextDouble();

        System.out.println("Digite a Quantidade de combustivel gasto(L) : ");
        double combustivel = sc.nextDouble();

        double consumoM = distancia / combustivel;

        System.out.println("Consumo médio do seu veiculo(litros por km): " + consumoM);

    }
    // Ex09

    // Escreva um programa que receba um número inteiro com quatro dígitos e mostre o número invertido.

    public static void ex09() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tempo(horas) ");
        double horas = sc.nextDouble();

        System.out.println("Digite o tempo(minutos) : ") ;
        double minutos = sc.nextDouble();

        double horasSeg = horas * 3600;
        double minSeg = minutos * 60;


        System.out.println("Seu tempo de horas convertido para segundos : "+ horasSeg);
        System.out.println("Seu tempo de minutos convertido para segundos: "+ minSeg);
        System.out.println("Tempo total em segundos: " + (horasSeg + minSeg) );


        sc.close();

    }
}