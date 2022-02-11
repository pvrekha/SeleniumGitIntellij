package demo;


import java.util.Scanner;

public class Dayassign {

    public static boolean isItWeekday() {
        Scanner k = new Scanner(System.in);
        boolean dayInfo;
        System.out.println("Enter the day");
        String day = k.nextLine();
        if (day.equals("Saturday") || (day.equals("Sunday"))) {
            dayInfo = false;
        } else {
            dayInfo = true;
        }
        return dayInfo;
    }

    public static void main(String[] args) {


            if (isItWeekday()) {
                System.out.println("Dominos gives 50% off on weekdays");
            } else
            { System.out.println("Dominos gives 50% extra on weekends");
        }
    }
}



