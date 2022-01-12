import java.util.Scanner;

public class LinkTeste {
    public static void main(String[] args) {
        LinkList teste = new LinkList();
        int i;
        int num;
        Scanner x = new Scanner(System.in);
        for (i =1; i<=5;i++) {
            System.out.println("Digite o primeiro numero");
            num = x.nextInt();
            teste.InsereInicio(num);
        }

    }
}
