/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Topic_4_Assignment_1;

/**
 *
 * @author Chetan
 */
public class MainClass {
    public static void main(String[] args) {
        Runnable1 r = new Runnable1();
        Thread t = new Thread(r);
        
        try{
            for ( int i=0; i < 5; i++){
                t.run(); 
                int value = r.getValue();
                Runnable r2 = new Runnable2(value);
                Thread t2 = new Thread(r2);
                t2.run();
            }
        }catch(Exception err){
            err.printStackTrace();
        }
    }
}

class Runnable2 implements Runnable{
    int v, res=1;
    Runnable2(int k){
        v=k;
    }
    synchronized public void run(){
        for(int j=1;j<v;j++)
            res=res*j;
        System.out.println("Factorial : "+res);
    }
}

class Runnable1 implements Runnable{
    private int i;
    public void run(){
        i = (int) (Math.random() * (11 - 1)+1);
        System.out.println("Number : "+i);
    }
    public int getValue(){
        return i;
    }
}
