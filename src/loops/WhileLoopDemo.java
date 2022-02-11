package loops;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class WhileLoopDemo {
    public static void main(String[] args) {
        Scanner k= new Scanner(System.in);
        int correctPin =1234;
        int count=0;
         System.out.println("Please enter your ATM pin :");
        int correct = k.nextInt();
        while (correctPin!=correct && count<3) {
            System.out.println("Please enter your correct pin ");
            correct = k.nextInt();
            count++;
        }
            if(correct==correctPin){
                System.out.println("Pin is correct. Welcome to ABC!");
            }
            else{
                System.out.println("Pin is incorrect and your account is locked");
            }


        }

    }


