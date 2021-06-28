import java.util.Scanner;

public class L2_exercicio_3 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.println("Verificador de Divisão por 4 e 5");
        System.out.println("Informe um número entre 1 e 100: ");
        double valor = dados.nextDouble();

        if (valor % 4 == 0 & valor % 5 == 0){
            System.out.println("O número é divisivel por 4 e 5 ao mesmo tempo");
        }else if(valor % 5 ==0){
            System.out.println("valor Divisivel só por 5 ");
        }else if(valor % 4 == 0){
            System.out.println("valor Divisivel só por 4 ");
        }else if(valor % 4 != 0 && valor % 5 !=0){
            System.out.println("número NÃO é divisivel por 4 e nem por 5 ");
        }


    }
}