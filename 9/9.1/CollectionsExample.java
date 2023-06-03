import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Betty");
        names.add("Sirius");
        names.add("Ben");
        names.add("Brita");
        names.add("Miles");
        names.add("Annie");

        System.out.println("List of names: " + names);
        Collections.sort(names);
        System.out.println("List of names sorted using collections: " + names);
    }
}