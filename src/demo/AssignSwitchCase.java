package demo;

import java.util.Scanner;

public class AssignSwitchCase {
                public static void main(String[] args) {
            Scanner d = new Scanner(System.in);
            System.out.println("What day it is today");
            String day=d.nextLine().toLowerCase();
            switch (day){
                case "monday":{
                    System.out.println("Wear white color dress");
                    break;
                }
                case "tuesday":{
                    System.out.println("Wear yellow color dress");
                    break;
                }
                case "wednesday":{
                    System.out.println("Wear red color dress");
                    break;
                }
                case "thursday":{
                    System.out.println("Wear gold color dress");
                    break;
                }
                case "friday":{
                    System.out.println("Wear blue color dress");
                    break;
                }
                case "saturday": {
                    System.out.println("Wear Orange color dress");
                    break;
                }
                case "sunday":{
                    System.out.println("Wear brown dress");
                    break;
                }
                default:
                    System.out.println("Invalid day");
                    break;
            }
        }

    }






