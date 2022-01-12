import java.util.Scanner;
public class L2_exercicio_10 {
    public static void main(String[]args){
        Scanner tcd = new Scanner(System.in);
        int impa = 0;
        int par = 0;
        System.out.println("----VERIFICADOR DE NÚMEROS PRIMOS INTEIROS----");
        for (int c =1 ; c < 11; c++){
            System.out.printf("Informe o %fº de 10", c);
            int valor = tcd.nextInt();

            if(valor % 2 == 0){
                par += valor;
            }else{
                impa =  valor;
            }

        }












    }
}
