import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        TableauEntierNouvelleVersion tab = new TableauEntierNouvelleVersion(new Integer[]{5, 8, 6, 0, 7});
        System.out.println(tab.maximum());
        LinkedList<Integer> listEntier = new LinkedList<>();
        listEntier.add(5);listEntier.add(8);listEntier.add(6);listEntier.add(0);listEntier.add(7);
        ListeEntier list = new ListeEntier(listEntier);
        System.out.println(list.maximum());
    }
}
