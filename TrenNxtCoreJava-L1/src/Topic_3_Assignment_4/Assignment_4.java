/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Topic_3_Assignment_4;

import java.util.Scanner;

/**
 *
 * @author Chetan Singh Sengar
 */
public class Assignment_4 {
    public static void main(String args[]){
        String a, b = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string you want to check : ");
        a = s.nextLine();
        int n = a.length();
        for(int i = n - 1; i >= 0; i--){
            b = b + a.charAt(i);
            System.out.println(b);
        }
        if(a.equalsIgnoreCase(b)){
            System.out.println("The string is palindrome.");
        }else
            System.out.println("The string is not palindrome.");
    }
}
