package demo;


public class Calculator {


    public void add(int a, int b) {
        System.out.println(a + b);
    }
    public void subtract(int a ,int b){
        System.out.println(a-b);
    }
    public int multiply(int a,int b){
        return(a * b);
    }
    public void divide(int a,int b){
        System.out.println(a / b);
    }
    public static void main(String[] args){
        Calculator basicCal= new Calculator();
        basicCal.add(10,20);
        basicCal.subtract(20,20);
        System.out.println(basicCal.multiply(10,20));
        basicCal.divide(20 , 10);


    }
}
