package Inheritance;

public class Mechanical extends Management {
    int annualBonus = 8000;
    public void bonus() {
        System.out.println("This is January");
    }

    public static void main(String[] args) {
        Accounts Neal = new Accounts();
        Neal.bonus();
        System.out.println("Total Salary= " + (Neal.annualSalary + Neal.annualBonus));
    }
}


