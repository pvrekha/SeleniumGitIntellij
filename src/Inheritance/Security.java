package Inheritance;

public class Security extends Management{
    int annualBonus = 5000;

    public void bonus(){
        System.out.println("This is January");
    }

    public static void main(String[] args) {
        Security John = new Security();
        John.bonus();
        System.out.println("Total Salary= " + (John.annualSalary+John.annualBonus));
    }



}





