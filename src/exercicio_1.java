import java.util.Scanner;

public class exercicio_1 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Calculadora de Mádia Aritmética");
        System.out.println("Informe a Nota do 1º Bimestre: ");
        float nota1 = entrada.nextFloat();
        System.out.println("Informe a Nota do 2º Bimestre: ");
        float nota2 = entrada.nextFloat();
        System.out.println("Informe a Nota do 3º Bimestre: ");
        float nota3 = entrada.nextFloat();


        double resultado = (nota1 + nota2 + nota3 ) / 3;
        System.out.printf("Media Final é: %.2f" , resultado);
    }
}
