package exceptionHandling;

import com.sun.nio.sctp.ShutdownNotification;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner k= new Scanner(System.in);
        try {
            System.out.println("Enter a number1 - ");
            int num1 = k.nextInt();
            System.out.println("Enter a number2 - ");
            int num2 = k.nextInt();
            System.out.println("Result of the division " + num1 + " by " + num2 + " = " + num1 / num2);
        } catch (ArithmeticException e){
            System.out.println("Please do not enter 0 in the denominator ");
        }
        catch (InputMismatchException e){
            System.out.println(" Input only integer numbers ");
        }
        catch (Exception e){
            System.out.println("Please enter a valid input ");
        }
        finally {
            System.out.println(" Everything is working fine");
        }
    }
}

