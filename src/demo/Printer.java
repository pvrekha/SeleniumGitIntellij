package demo;

public class Printer {
   private String shape;
    private String color;

    public Printer(String shape, String color) {
        this.shape =shape;
        this.color= color;
    }

    public void printInfo(Printer obj){
        System.out.println("Color of Pizza is :" + obj.shape);
        System.out.println("Color of Pizza is :" + obj.color);

    }

    public static void main(String[] args) {
        Printer pizza = new Printer("Round","Brown");
         pizza.printInfo(pizza);
    }
}
