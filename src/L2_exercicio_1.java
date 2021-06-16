import java.util.Scanner;

public class L2_exercicio_1 {
    public static void main (String[] args){
        Scanner dados = new Scanner(System.in);
        System.out.println("IDENTIFICADOR DE NÚMEROS PARES E ÍMPARES");
        System.out.println("Informe o número INTEIRO que deseja analisar: ");
        double num = dados.nextDouble();

        if (num/2 == 0) {
            System.out.println("legal");
        }else{
            System.out.println("errado");
            }

    }
}
