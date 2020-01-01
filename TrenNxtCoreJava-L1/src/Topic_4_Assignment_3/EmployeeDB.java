/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Topic_4_Assignment_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ch954245
 */
public class EmployeeDB {
    /*
    private int eCode;
    private String Name;
    private long Salary;
    ArrayList<EmployeeDB> Contacts = new ArrayList<EmployeeDB>();
    
    EmployeeDB(int eCode, String Name, long Salary){
        this.eCode = eCode;
        this.Name = Name; 
        this.Salary = Salary;
    }
    boolean addEmployee(Employee e){
        boolean str = false;
        
        return str;
    }
    boolean deleyteEmployee(int eCode){
        boolean str = false;
        
        return str;
    }*/
    public static void main(String[] args) {
        
                //To Add the employees.
		List<Employee> list = new ArrayList<>();	
		list.add(new Employee(123, "Chetan", "UP, India", 20000.0));
		list.add(new Employee(456, "Singh Sengar", "Maharastra, India", 30000.0));
		
                //To search with the eCode. 
		Iterator<Employee> it = list.iterator();
		Scanner scan = new Scanner(System.in);
                System.out.println("Enter the eCode of employee for Search : ");
                int searchId = scan.nextInt();
		while (it.hasNext()) {
			Employee emp = it.next();
			if (emp.getId() == searchId)
				System.out.println(emp);
		}
	}
}
