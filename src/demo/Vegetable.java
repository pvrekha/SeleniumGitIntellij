package demo;

public class Vegetable {
    public void chips(){
        System.out.println("Potatoes and air makes chips packet");
    }
    public void pataya(){
        System.out.println("Potato is a vegetable but pataya is a place");
    }
    public void fries(){
        System.out.println("Potatoes are tasty but make you have cholestrol");
    }
    public void couch(){
        System.out.println("Couch potato is not a dish");
    }
    public void sidedish(){
        System.out.println("Potato can be out into anything to make it a sidedish");
    }


    public static void main(String[] args) {
        Vegetable food = new Vegetable();
        food.chips();
        food.couch();
        food.fries();
        food.pataya();
        food.sidedish();
    }
}
