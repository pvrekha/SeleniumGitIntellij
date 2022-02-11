package collectionsFranework;

import java.util.LinkedList;

public class LinkedListsDemo {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
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


