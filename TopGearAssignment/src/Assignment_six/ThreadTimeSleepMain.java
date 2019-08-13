/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_six;

import java.util.Date;

/**
 *
 * @author Chetan Singh Sengar
 */

/*
Question 6: 6.	Write  a  program  to  assign  the  current  thread  to  t1. 
Change  the  name  of  the  thread  to  MyThread.  Display  the  changed  name  of  the  thread. 
Also  it  should  display  the  current  time.
Put  the  thread  to  sleep  for  10  seconds  and  display  the  time  again.
*/
class ThreadTimeSleep extends Thread{
        private String threadName;
    
    ThreadTimeSleep(String name) {
        threadName = name;
        System.out.println("Creating "+threadName);
    }

    static void printDateTime() {
        Date date = new Date();
        String str = String.format("Current Date/Time : " + date );
        System.out.println(str);
    }
    
    public void run() {
        System.out.println("Running "+threadName);
        try {
            for(int i=0; i<2; i++) {
                printDateTime();
                Thread.sleep(10000);
            }
        }catch(InterruptedException e) {
                System.out.println("Thread " +  threadName + " interrupted.");
        }
    }
}
public class ThreadTimeSleepMain {
    public static void main(String args[]) {
        ThreadTimeSleep tt = new ThreadTimeSleep("MyThread");
        tt.start();
    }
}
