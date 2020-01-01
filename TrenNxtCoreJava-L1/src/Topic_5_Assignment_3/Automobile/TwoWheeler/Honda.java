/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Topic_5_Assignment_3.Automobile.TwoWheeler;

import Topic_5_Assignment_3.Automobile.Vehicle;

/**
 *
 * @author ch954245
 */
public class Honda extends Vehicle{
    private String modelName;
    private String registrationNumber;
    private String ownerName;
    private int speed;
    
    public Honda(String modelName, String registrationNumber, String ownerName, int speed) {
	super();
	this.modelName = modelName;
	this.registrationNumber = registrationNumber;
	this.ownerName = ownerName;
	this.speed = speed;
    }
    @Override
    public String modelName() {
        System.out.println("modelName: " + modelName);
        return modelName;
    }

    @Override
    public String registrationNumber() {
        System.out.println("registrationNumber: " + registrationNumber);
        return registrationNumber;
    }

    @Override
    public String ownerName() {
        System.out.println("Owner Name : "+ownerName);
        return ownerName;
    }
    
    public int speed(){
        return speed;
    }
    public void cdplayer(){
        System.out.println("Accessing CD Player.");
    }
}
