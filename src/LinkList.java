// Classe da função que adiciona os dados na lista
public class LinkList {

    private Link primeiro;
    public LinkList () {
        primeiro = null;
    }
    // metodo boleado, de uma função, para saber o estado atual da função lista
    public boolean ListaVazia () {
        if(primeiro == null) {
            return true;
        }
        return false;
    }
    // essa função Inserir, serve pra inserir os dados, no inicio da lista, sempre
    //criando uma nova lista
    public void InsereInicio (int id) {
        Link novoNo = new Link(id);
        novoNo.prox = primeiro;
        primeiro = novoNo;
    }


}

