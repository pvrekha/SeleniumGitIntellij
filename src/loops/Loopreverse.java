package loops;

import java.util.Scanner;

public class Loopreverse {
    public static void main(String[] args) {
        {
            String original ="";
            String reverse ="";
            int length1 ;
            Scanner k=new Scanner(System.in);
            System.out.println(" Enter the string ");
            original = k.nextLine();
            length1 = original.length();
            for (int i=length1-1;i>=0;i--){
                reverse = reverse + original.charAt(i);

            }
            System.out.println("Reverse of original string is : "+reverse );
        }
    }
}
