import java.util.Scanner;

public class L2_exercicio_4 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.println("Classificador de Triângulo");
        System.out.println("informe o Primeiro Segmento: ");
        float r1 = dados.nextFloat();
        System.out.println("informe o Segundo Segemento: ");
        float r2 = dados.nextFloat();
        System.out.println("informe o Terceiro Segemnto: ");
        float r3 = dados.nextFloat();



        if (r1 < r2 + r3 & r2 < r1 + r3 & r3 < r1 + r2) {
            if (r1 == r2 && r2 == r3 && r3 == r1) {
                System.out.println("Formam trinagulo");
                System.out.println("É um triangulo equilatero");
            } else if (r1 != r2 & r2 != r3 & r3 != r1) {
                System.out.println("Formam trinagulo");
                System.out.println("É um triangulo escaleno");
            } else {
                System.out.println("Formam trinagulo");
                System.out.println("É isosceles");}
        }else{
                System.out.println("Não formam triangulo !!");
        }

    }
}
/*((a < b + c) & a > Math.abs(b -c )) & ((b < a + c) & b > Math.abs(a-c)) & ((c < a + b) & c > Math.abs(a-b))*/