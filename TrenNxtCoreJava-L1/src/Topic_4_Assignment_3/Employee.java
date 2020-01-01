/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Topic_4_Assignment_3;

/**
 *
 * @author ch954245
 */
public class Employee{
        private int id;
	private String name;
	private Double salary;
	
	public Employee(int id, String name, String address, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}	
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "----------------------------------------------" + "\nName\t\tID\t\tSalary\n"
        + "----------------------------------------------\n"+id+"\t\t"+name+"\t\t"+salary;
	}
}