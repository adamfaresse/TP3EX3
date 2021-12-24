public abstract class Tableau {
    Object[] objet;
    public Tableau(Object[] objet){
        this.objet = objet;

    }
    abstract public boolean sup(Object x, Object y);
    public Object maximum(){
        Object max = objet[0];
        for(Object objet : objet){
            if(sup(objet,max)){
                max = objet;
            }
        }
        return max;
    }
}
