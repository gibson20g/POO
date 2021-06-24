import java.util.Scanner;
public class L2_exercicio_17 {
    public static void main(String[]args){
        System.out.println("---MÉDIA E SOMA DE VALORES LIDOS----");
        Scanner tcd = new Scanner(System.in);
        float soma = 0;
        System.out.println("Informe DEZ Valores");
        for(float c = 1; c < 11; c++){
            System.out.printf("%.0fº Valor: ", c);
            double valor = tcd.nextDouble();

            soma += valor;

        }
        System.out.printf("A média dos valores digitados é: %.1f\n", soma/10);
        System.out.printf("A soma dos valores é: %.1f",soma);
    }
}
