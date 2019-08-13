/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Question 4:Write an interface called Playable, with a method void play();
Let this interface be placed in a package called music. Write a class called Veena which implements Playable interface. 
Let this class be placed in a package music.string.Write a class called Saxophone which implements Playable interface. 
Let this class be placed in a package music.wind.Write another class Test in a package called live. Then,

a. Create an instance of Veena and call play() method
b. Create an instance of Saxophone and call play() method
c. Place the above instances in a variable of type Playable and then call play().

*/
package Assignment_four;

import Music.Playable;
import Music.string.*;
import Music.wind.Saxophone;

/**
 *
 * @author Chetan Singh Sengar
 */
public class Music_Play {
    public static void main(String args[]) {
        Veena v = new Veena();
        v.play();
        
        Saxophone s = new Saxophone();
        s.play();
        
        Playable pv, ps; /*c. Place the above instances in a variable of type Playable and then call play().*/
        
        pv = new Veena();
        ps = new Saxophone();
       
        pv.play(); /*c. Place the above instances in a variable of type Playable and then call play().*/
        ps.play();   
    }
}
