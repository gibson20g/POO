public class LinkList {

    private Link primeiro;

    public LinkList () {
        primeiro = null;
    }

    public boolean ListaVazia () {
        if (primeiro == null) {
            return true;
        }
        return false;
    }

    public void InsereInicio (int id) {
        Link novoNo = new Link(id);
        novoNo.prox = primeiro;
        primeiro = novoNo;
    }
}
/*ja ja */