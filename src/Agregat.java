public abstract class Agregat {
    abstract public boolean sup(Object x, Object y);
    abstract protected Iterator getIterator();
    public Object maximum(){
        Iterator i = getIterator();
        Object max =  i.courant();

        while(!i.fini()){


            if(sup(i.suivant(),max)){

                max = i.courant();

            }



        }
        return max;
    }

}
