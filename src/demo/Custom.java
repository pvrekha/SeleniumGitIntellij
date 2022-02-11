package demo;

import java.util.Scanner;

public class Custom {
    public void usname(String username){

        System.out.println("You have entered your name as "+ username);
    }

    public static void main(String[] args) {
        Custom kk = new Custom();
        Scanner uname = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter name");
        String userName = uname.nextLine();  // Read user input
        kk.usname(userName);

    }
}
