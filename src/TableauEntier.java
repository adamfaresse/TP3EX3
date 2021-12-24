public class TableauEntier extends Tableau {

    public TableauEntier(Integer[] objet) {
        super(objet);
    }

    @Override
    public boolean sup(Object x, Object y) {
        Integer intX = (Integer) x;
        Integer intY = (Integer) y;

        return intX.intValue() > intY.intValue();
    }
}
