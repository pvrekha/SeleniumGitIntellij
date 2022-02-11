package loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AssignInteger {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        boolean continueInput = true;
        do {
            try {
                System.out.println("Enter an integer number ");
                int num = k.nextInt();
                System.out.println(" The number entered by you is " + num);
                continueInput = false;
            } catch (InputMismatchException e) {
                System.out.println(" This is a string, Please enter integer number ");
                k.nextLine();
            }
        }
            while (continueInput) ;

        }
    }

