package demo2;

public class Car3 {

    String color;
    int nosks;

    public Car3(String color, int nosks) {
        this.color = color;
        this.nosks = nosks;


    }
    public Car3(){
        color= "Red";
        nosks=16;
    }
    public void printcar() {
        System.out.println(" Color of Car :" + color);
        System.out.println(" No of spokes : " + nosks);
    }

    public static void steeringwheel(){
        System.out.println(" Number of steering wheel is : 1");
    }
    public static void main(String[] args) {
        Car3 Mercedes = new Car3("Silver", 10);
        Car3 Audi = new Car3("Black", 20);
        Car3 BMW = new Car3();
        Mercedes.printcar();
        Audi.printcar();
        BMW.printcar();
        steeringwheel();

    }
}