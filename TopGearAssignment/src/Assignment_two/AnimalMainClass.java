/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Question 3:There is an animal class which has the common characteristics of all animals. 
Dog, Horse, Cat are animals(sub-class). 
Each can shout, but each shout is different. 
Use polymorphism to create objects of same and using an animal variable, make each of the animals shout.
*/

package Assignment_two;

/**
 *
 * @author Chetan Singh Sengar
 */
public class AnimalMainClass {
	public static void main(String[] args) {
		Animal a = new Animal();   //Will print "Animal Shout".
		a.shout();                 //Will print "Shout...Shout...Shout".
		Cat c = new Cat();         //Will print "Animal Shout" & then print "Cat Shouts".
		c.shout();                 //Will print "meow...meow...meow".
		Dog d = new Dog();
		d.shout();
		Horse h = new Horse();
		h.shout();
	}
}
