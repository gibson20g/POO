import java.util.Scanner;

public class L2_exercicio_5 {
    public static void main(String[]args){
        Scanner dados = new Scanner(System.in);
        System.out.println("Calculo de IMC");
        System.out.println("Informe seu Peso em KG ?");
        float peso = dados.nextFloat();
        System.out.println("Informe Sua Altura ?");
        float altura = dados.nextFloat();

        double imc = peso / Math.pow(altura, 2);


        if (imc < 18.5){
            System.out.format("Seu IMC é %s", imc);
            System.out.println("Abaixo do Peso");
        }else if (18.5 <= imc && imc < 24.99){
            System.out.format("Seu IMC é %s", imc);
            System.out.println("Peso dentro do Normal");
        }else if (24.99 <= imc && imc < 34.9){
            System.out.format("Seu IMC é %s", imc);
            System.out.println("Acima do Peso");
        }else if (imc >= 40){
            System.out.format("Seu IMC é %s", imc);
            System.out.println("Está com Obsedida, Procure um Médico");
        }
        else{
            System.out.println("Dados não compatíveis");
        }
        System.out.println("A tabela que usamos de referência foi \n");
        System.out.println("Entre 18.5 e 24.99: peso normal");
        System.out.println("Entre 25 e 29.99: Acima do peso");
        System.out.println("Entre 30 e 34.99: Obesidade");
    }
}
