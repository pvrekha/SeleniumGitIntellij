package collectionsFranework;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>(); // ArrayList is a generic class
        cities.add("London");
        cities.add("Tokyo");
        cities.add("New york");
        cities.add("Paris");

        for(String t: cities){
            System.out.println(t);
        }
        System.out.println("Total size of ArrayList : "+cities.size());
        System.out.println("Index of New york : "+cities.indexOf("New york"));
        System.out.println("City in the second index : "+cities.get(2));
        System.out.println("Is Paris part of this list ?"+cities.contains("Paris"));
    }
}
