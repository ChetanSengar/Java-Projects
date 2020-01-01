/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Topic_5_Assignment_3;

import Topic_5_Assignment_3.Automobile.TwoWheeler.Hero;
import Topic_5_Assignment_3.Automobile.TwoWheeler.Honda;

/**
 *
 * @author ch954245
 */
public abstract class Main {
    public static void main(String[] args) {
		Hero hero = new Hero("Hero1234", "WB16F2222", "Chetan", 220);
		hero.modelName();
		hero.ownerName();
		hero.registrationNumber();
		hero.speed();
		System.out.println();
		
		Honda honda = new Honda("Honda GT", "WB16F4444", "Singh", 300);
		honda.modelName();
		honda.ownerName();
		honda.registrationNumber();
		honda.speed();
    }
}
