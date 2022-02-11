package demo;

import java.util.Scanner;

public class SwitchCaseDemo {

    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        System.out.println("What day it is today");
        String day=d.nextLine();
        switch (day){
            case "Monday":{
                System.out.println("Wear white color dress");
                break;
            }
            case "Tuesday":{
                System.out.println("Wear yellow color dress");
                break;
            }
            case "Wednesday":{
                System.out.println("Wear red color dress");
                break;
            }
            case "Thursday":{
                System.out.println("Wear gold color dress");
                break;
            }
            case "Friday":{
                System.out.println("Wear blue color dress");
                break;
            }
            case "Saturday": {
                System.out.println("Wear Orange color dress");
                break;
            }
                case "Sunday":{
                    System.out.println("Wear brown dress");
                    break;
            }
            default:
                System.out.println("Invalid day");
            break;
            }
        }

            }

