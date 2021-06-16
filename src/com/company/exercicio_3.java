package com.company;
import java.util.Scanner;
public class exercicio_3 {
    public static void main (String[] args){
        Scanner dados = new Scanner(System.in);
        System.out.println("informe o Raio do Circulo");
        double raio = dados.nextDouble();

        double resultado = 3.1415 * Math.pow(raio, 2);
        System.out.printf("A área do circulo é %.2f", resultado);

    }
}
