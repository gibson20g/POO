import java.util.Scanner;
public class teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float soma = 0;
        for (int c = 1; c < 11; c++) {
            System.out.println("Digite um valor: ");
            float impar = entrada.nextFloat();
            if (impar % 2 != 0) {
                soma += c;
            }
        }
        System.out.printf("A soma dos valores impares fornecidos é: %.1f;", soma);
    }
}