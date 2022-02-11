package demo2;

public class Car2 {

    String color ;
    int nosks;

    public Car2(String colorOfCar , int spokes){
        color=colorOfCar;
        nosks =spokes;

    }
    public void printcar(){
        System.out.println(" Color of Car :"+color);
        System.out.println(" No of spokes : "+nosks);
    }

    public static void main(String[] args) {
        Car2 Mercedes = new Car2("Silver" ,10);
        Car2 Audi = new Car2("Black", 20);
         Mercedes.printcar();
         Audi.printcar();

    }
}
