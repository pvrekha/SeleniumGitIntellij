package demo2;

public class Methoverloaded {


    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public void add(float a, float b) {
        System.out.println(a + b);
    }

        public static void main(String[]args){
            Methoverloaded basicCal = new Methoverloaded();
            basicCal.add(10, 20);
            basicCal.add(10, 20, 30);
            basicCal.add(10.2f, 11.2f);
        }
    }
