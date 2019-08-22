/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_4;

import java.util.Scanner;

/**
 *
 * @author Chetan Singh Sengar
 */
public class Assignment_4 {
 
    private static void printMonth(int num, String name) {
        System.out.printf("Month number : %d, Name : %s%n", num, name);
    }
    public static void main(String args[]){
        int num;
        System.out.print("Enetr the month number : ");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        switch(num){
            case 1:
                printMonth(num, "January");
                break;
            case 2:
                printMonth(num, "February");
                break;
            case 3:
                printMonth(num, "March");
                break;
            case 4:
                printMonth(num, "April");
                break;
            case 5:
                printMonth(num, "May");
                break;
            case 6:
                printMonth(num, "June");
                break;
            case 7:
                printMonth(num, "July");
                break;
            case 8:
                printMonth(num, "August");
                break;
            case 9:
                printMonth(num, "September");
                break;
            case 10:
                printMonth(num, "October");
                break;
            case 11:
                printMonth(num, "November");
                break;
            case 12:
                printMonth(num, "December");
                break;
            default: 
                System.out.printf("Wrong choice !!");
        }
    }
}

/* Without Switch Case.....

String[] months = {"January", "February", "March", ..., "December"};
if (num >= 1 && num <= 12) {
    System.out.format("The name of month number %d is %s\n", num, months[num-1]);
} else {
    System.out.println("You have entered an invalid number");
}

*/