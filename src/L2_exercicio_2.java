import java.util.Scanner;

public class L2_exercicio_2 {
    public static void main (String[] args){
        Scanner dados = new Scanner(System.in);
        System.out.println("Verificador de Maioridade");
        System.out.println("informe o Ano Atual 'DDMMAAAA' (OBS: colocar tudo junto): ");
        double ano_atual = dados.nextDouble();
        System.out.println("Informe o Ano do Seu nascimento: ");
        double ano_nascimento = dados.nextDouble();

        double idade = ano_atual - ano_nascimento;

        if (idade > 18) {
            System.out.println("Você é maior de Idade");
        }else {
            System.out.println("Você é Menor de Idade");
        }
    }
}
