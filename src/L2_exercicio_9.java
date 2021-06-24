import java.util.Scanner;
public class L2_exercicio_9 {
    public static void main(String[]args){
        Scanner tcd = new Scanner(System.in);
        int soma = 0;
        System.out.println("-----SOMA DE NÚMEROS PARES-----");
        System.out.print("Informe 10 números de 1 a 50:\n");
        for ( int n = 1; n < 11; n++){
            System.out.printf("%dº de 10: ",n);
            double valor = tcd.nextDouble();
            if (valor % 2 == 0){
                soma = (int) (soma + valor);

            }
        }System.out.format("A soma dos números  é: %s", soma);
        if (soma == 0){
            System.out.println("Vcoê não digitou valores pares");
        }

    }
}
