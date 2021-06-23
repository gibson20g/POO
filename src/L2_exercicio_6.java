import java.util.Scanner;
public class L2_exercicio_6 {
    public static void main(String[] args){
        Scanner tcd = new Scanner(System.in);
        double notas[][]= new double[5][2];
        String nomes[]= new String[5];

        for (int a = 0; a <5; a++) {
            System.out.println("Escreva seu nome: ");
            nomes[a] = tcd.nextLine();
            for (int n = 0; n < 2; n++) {
                System.out.println(nomes[a]);
                System.out.println("Nota 1: ");
                notas[a][0] = tcd.nextInt();
                System.out.println("Nota 2: ");
                notas[a][1] = tcd.nextInt();

            }
        }




        for (int i = 0; i <5; i++){
            System.out.println(nomes[i]);
            for (int x = 0; x < 2; x++){
                System.out.println(notas[i][x]);
            }
        }
    }
}
