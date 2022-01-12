import java.util.Scanner;
public class L2_exercicio_13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while (true) {
            System.out.println("Digite um valor entre 1 e 10");
            double valor = entrada.nextDouble();
            System.out.println("O valor não está dentro do limite definido, escreva outro valor");
            if (valor <= 0 && valor > 11) {
                break;
            }else if (valor >= 1 && valor < 11 )
                System.out.println("O valor está dentro dos limites, parabens");
        }
    }
}