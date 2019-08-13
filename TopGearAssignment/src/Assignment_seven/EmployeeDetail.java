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
public class EmployeeDetail {
    	private String id = null;
	private String name = null;
	private String addrs = null;
	private int sal = 0;
	
	void getData(int i) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
                System.out.print("Please enter the below information for "+(i+1)+" User.");
		System.out.println("Employee ID:  ");
		id = sc.next();
		
                System.out.println("Name:         ");
		name = sc.next();
		
                System.out.println("Address:      ");
		addrs = sc.next();
		
                System.out.println("Salary:       ");
		sal = sc.nextInt();
	}
	boolean searchBot(String srch) {
		if(name.matches(srch) || id.matches(srch))
			return true;
		else
			return false;
	}
	void displayData() {
		System.out.println("Employee ID:  "+id);
		System.out.println("Name:         "+name);
		System.out.println("Address:      "+addrs);
		System.out.println("Salary:       "+sal);
	}
}
