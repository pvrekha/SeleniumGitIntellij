package collectionsFranework;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("London");
        cities.add("Tokyo");
        cities.add("New york");
        cities.add("Paris");
        cities.add("New york"); // Allows duplicate value insertion

        for (String t : cities) {
            System.out.println(t);
        }
        System.out.println("Total size of HashSet : " + cities.size());
        //System.out.println("Index of New york : " + cities.indexOf("New york")); //Indexing wont work in HashSet
       // System.out.println("City in the second index : " + cities.get(2));   //Indexing wont work in HashSet
        System.out.println("Is Paris part of this list ?" + cities.contains("Paris"));
    }
}