package com.company;

import java.util.Scanner;

public class exercicio_1 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nota 1: ");
        float nota1 = entrada.nextFloat();
        System.out.println("Nota 2: ");
        float nota2 = entrada.nextFloat();
        System.out.println("Nota 3: ");
        float nota3 = entrada.nextFloat();

        double resultado = (nota1 + nota2 + nota3 ) / 3;
        System.out.println("Media é: " + resultado);
    }
}
