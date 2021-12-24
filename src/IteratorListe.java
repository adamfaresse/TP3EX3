import java.util.LinkedList;

public class IteratorListe extends Iterator{
    LinkedList liste;
    int iterator;

    public IteratorListe(LinkedList liste){
        init();
        this.liste = liste;

    }
    @Override
    void init() {
        iterator = 0;
    }

    @Override
    Object suivant() {
        iterator++;
        return liste.get(iterator);
    }

    @Override
    boolean fini() {
        return iterator == (liste.size()-1);
    }

    @Override
    Object courant() {
        return liste.get(iterator);
    }
}
