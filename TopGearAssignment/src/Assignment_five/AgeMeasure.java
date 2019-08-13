/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_five;

/**
 *
 * @author Chetan Singh Sengar
 */

/*
Question 5: 5.	Write a program to accept name and age of a person from the command prompt
(passed as arguments when you execute the class) and ensure that the age entered is >=18 and < 60. 
Display proper error messages. The program must exit gracefully after displaying the error message 
in case the arguments passed are not proper. 
(Hint : Create a user defined exception class for handling errors.)
*/

@SuppressWarnings("serial")
class InvalidAgeException extends Exception{    
        @Override
	public String toString() {
		return ("Age must be >=18 and <60");
	}
}
class AgeMeasure {
    public static void main(String[] args) {
        String name = args[0];
		int age = Integer.parseInt(args[1]);
		if(age>=18 && age<60)
			System.out.println(name+" has proper Age");
		else
			try {
				throw new InvalidAgeException();
			}
			catch(InvalidAgeException ex) {
				ex.printStackTrace();
			}
	}

}       