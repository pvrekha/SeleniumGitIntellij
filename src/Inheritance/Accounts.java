package Inheritance;

public class Accounts extends Management {
    int annualBonus = 10000;

    public void bonus() {
        System.out.println("This is January");
    }
    public void day(){
        System.out.println("Today is Sunday");
    }
    public static void main(String[] args) {
        Accounts Syam = new Accounts();
        Syam.bonus();
        System.out.println("Total Salary= " + (Syam.annualSalary + Syam.annualBonus));
    }
}