package com.company;

import java.util.Scanner;

public class exercicio_2 {
    public static void main (String[] args){
        Scanner dados = new Scanner(System.in);
        System.out.println("informe o tamanho em metros");
        double metro = dados.nextDouble();

        double resultado = metro / 100;
        System.out.printf("Os %.2f convertido é igual a %.2f centímetros", metro, resultado);




    }
}
