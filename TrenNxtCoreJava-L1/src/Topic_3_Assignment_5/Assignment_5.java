/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Topic_3_Assignment_5;

import java.util.Scanner;

/**
 *
 * @author Chetan Singh Sengar
 */
public class Assignment_5 {
    public static int count(String s, char c){ 
        int res = 0; 
        for (int i=0; i<s.length(); i++){ 
            // checking character in string 
            if (s.charAt(i) == c) 
            res++; 
        }  
        return res; 
    } 
    // Driver method 
    public static void main(String args[]) 
    { 
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter the string : ");
        String str = scan.nextLine();
        System.out.printf("Enter the character you want to find : ");
        char c = scan.next().charAt(0);
        System.out.println(count(str, c)); 
    } 
} 

