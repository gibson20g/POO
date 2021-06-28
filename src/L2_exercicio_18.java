import java.util.Scanner;

public class L2_exercicio_18 {
    public static void main(String[] args) {
        int a = 0;
        while ( a == 5) {
            Scanner tcd = new Scanner(System.in);
            System.out.println("-----Calculadora-----");
            System.out.println("Informe o 1 valor: ");
            float num1 = tcd.nextFloat();
            System.out.println("Informe o 2 valor: ");
            float num2 = tcd.nextFloat();
            System.out.println("--------------------------");
            System.out.println("Escolha a Operação");
            System.out.println("--------------------------");

            System.out.println("1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");

            System.out.println("Informe a opção desejada: ");
            int op = tcd.nextInt();
            /*---------------------------------------*/
            /*-------------------OPÇOES ESCOLHIDAS E RESULTADO------------------------*/
            switch (op) {
                case 1:
                    float soma = num1 + num2;
                    System.out.printf("A soma de %f com %f = %f", num1, num2, soma);
                    break;
                case 2:
                    float subtracao = num1 - num2;
                    System.out.printf("A soma de %f com %f = %f", num1, num2, subtracao);
                    break;
                case 3:
                    float multiplicacao = num1 * num2;
                    System.out.printf("A soma de %f com %f = %f", num1, num2, multiplicacao);
                    break;
                case 4:
                    float divisao = num1 / num2;
                    System.out.printf("A soma de %f com %f = %f", num1, num2, divisao);
                    break;
                default:
                    System.out.println("invalido");

            }
            System.out.println("Quer cotinuar?: ");
            String a = tcd.nextInt();
            if (a == 1){
                break;
            }

        }
    }
/