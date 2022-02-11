package Inheritance;

public class HR extends Management{
    int annualBonus = 12000;

    public void bonus() {
        System.out.println("This is January");
    }

    public static void main(String[] args) {
        HR Joe = new HR();
        Joe.bonus();
        System.out.println("Total Salary= " + (Joe.annualSalary + Joe.annualBonus));
    }
}



