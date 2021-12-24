public class TableauEntierNouvelleVersion extends Agregat{
    Integer[] objet;
    public TableauEntierNouvelleVersion(Integer[] objet) {
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
        return new IteratorTableau(objet);
    }
}
