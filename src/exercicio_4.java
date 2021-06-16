import java.util.Scanner;

public class exercicio_4 {
    public static void main (String[] args){
        Scanner dados = new Scanner(System.in);
        System.out.println("Informe o Lado do Quadrado: ");
        double lado = dados.nextDouble();

        double perimetro = lado * 4;
        double area = lado * lado;

        System.out.printf("A área do Quadrado é: %.2f e o Perímetro é: %.2f ", area, perimetro);
    }
}
