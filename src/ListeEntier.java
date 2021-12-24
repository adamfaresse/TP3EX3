import java.util.LinkedList;

public class ListeEntier extends Agregat{
    LinkedList<Integer> objet;
    public ListeEntier(LinkedList<Integer> objet) {
        this.objet = objet;
    }


    @Override
    public boolean sup(Object x, Object y) {
        Integer intX = (Integer) x;
        Integer intY = (Integer) y;

        return intX.intValue() > intY.intValue();
    }

    @Override
    protected Iterator getIterator() {
        return new IteratorListe(objet);
    }
}
