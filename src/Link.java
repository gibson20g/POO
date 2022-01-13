//Essa classe serve para guarda os dados

public class Link {

    public int dado;
    public Link prox;

    public Link (int id) {
        dado = id;
    }
    //a função abaixo vai mostrar os dados armazenados na váriavel dado
    public void MostraNo () {
        System.out.printf("\n%d aqui",dado);
    }
}
