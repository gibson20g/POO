import java.util.Scanner;
public class L2_exercicio_6 {
    public static void main(String[] args) {
        Scanner tcd = new Scanner(System.in);
        float media_nota1 = 0;
        float media_nota2 = 0;

        float media1 = media_nota1 / 5;
        float media2 = media_nota2 / 5;

        for (int c = 1; c < 6; c++) {
            System.out.printf("Informe a Nota 1 do %sº anulo(a): ", c);
            float nota1 = tcd.nextFloat();
            media_nota1 += nota1;
            System.out.printf("Informe a Nota 2 do %sº anulo(a): ", c);
            float nota2 = tcd.nextFloat();
            media_nota2 += nota2;
            System.out.println("---------------Próximo---------");
        }

        if (media1 == 8 && media2 == 8) {
            System.out.printf("O total das media 1 foi : %.2f  e da média 2 foi : %.2f", media_nota1, media_nota2);

        }else{
            System.out.println("medias não maiores!!!");
        }
    }
}