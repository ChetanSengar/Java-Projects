/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Topic_4_Assignment_2;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
/**
 *
 * @author Chetan
 */

public class MyTimer{
    static int count=0;
        
    public static void main(String args[]){
    
        final Timer timer = new Timer(); 
        timer.schedule( new TimerTask() 
        { 
        @Override
        public void run() { 
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            System.out.println(formatter.format(date));
            count++;
            if(count > 10){
                timer.cancel();
                timer.purge();
            }
        } 
        }, 0, 2000);
    }
}