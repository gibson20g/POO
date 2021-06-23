import java.util.concurrent.TimeUnit;
public class L2_exercicio_14 {
    public static void main(String[] args) throws InterruptedException {
        for (int n = 10; n > 0; n--){
            System.out.format("%d\n",n);
            TimeUnit.SECONDS.sleep(1);


        }
        System.out.println("Feliz Ano Novo");
    }
}
