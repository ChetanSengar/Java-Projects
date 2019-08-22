/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_3;

import java.util.Scanner;

/**
 *
 * @author Chetan Singh Sengar
 */
public class Assignment_3 {
    
    
    public static void main(String args[]){
        int m, year, week, day;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of days:");
        m = s.nextInt();
        year = m / 365;
        m = m % 365;
        System.out.print(year+" years ");
        week = m / 7;
        m = m % 7;
        System.out.println(week+" weeks ");
        day = m;
        System.out.println(day+" days");
    }
}
