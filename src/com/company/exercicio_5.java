package com.company;

import java.util.Scanner;

public class exercicio_5 {
    public static void main (String[] args){
        Scanner dados = new Scanner(System.in);
        System.out.println("Informe a temperatura em Graus Celsius");
        double grau = dados.nextDouble();

        double resultado = (grau * 9/5) + 32;

        System.out.printf("A conversão de %.2f Celsius é igual a %.2f Fahrenheit", grau, resultado);

    }
}
