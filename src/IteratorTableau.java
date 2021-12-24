public class IteratorTableau extends Iterator{
    Object[] objet;
    int iterator;
    public IteratorTableau(Object[] objet){
        init();
        this.objet = objet;

    }
    @Override
    void init() {
        iterator = 0;
    }

    @Override
    Object suivant() {
        iterator++;
        return objet[iterator];
    }

    @Override
    boolean fini() {
        return iterator == (objet.length-1);
    }

    @Override
    Object courant() {
        return objet[iterator];
    }
}
