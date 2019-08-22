
package Topic_2_Assignment_6;

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
