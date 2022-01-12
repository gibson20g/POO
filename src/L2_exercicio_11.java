import java.util.Scanner;
public class L2_exercicio_11 {
    public static void main(String[] args) {
        Scanner tcd = new Scanner(System.in);
        System.out.println("----VERIFICADOR DE NÚMERO PRIMO----");
        System.out.println("DIGITE UM NÚMERO: ");
        int num = tcd.nextInt();

        int tot = 0;

        for (int c = 1; c < 4; c++) {
            if (num % c == 0) {
                tot += 1;
            }

        }
        if (tot == 2) {
            System.out.println("É Primo");
        }else{
            System.out.println("NÃO É PRIMO");
        }
    }
}