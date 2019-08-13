/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_seven;

import java.util.Scanner;

/**
 *
 * @author Chetan Singh Sengar
 */
public class Employee_Search {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of Emplyees: ");
		int n = sc.nextInt();
		EmployeeDetail emp[] = new EmployeeDetail[n];
		for(int i=0; i<n; i++) {
			emp[i] = new EmployeeDetail();
			emp[i].getData(i);
		}
		System.out.print("Search (<name> or <id>): ");
		String srch = sc.next();
		sc.close();
		int c=0;
		for(int i=0; i<n; i++) {
			if(emp[i].searchBot(srch)) {
				emp[i].displayData();
				c++;
			}
		}
		if(c==0)
			System.out.println("No such element found");
	}
}