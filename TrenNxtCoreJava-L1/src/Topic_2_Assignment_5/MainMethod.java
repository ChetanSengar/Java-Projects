/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Topic_2_Assignment_5;

/**
 *
 * @author Chetan Singh Sengar
 */
public class MainMethod {
    
    public static void main(String args[]){
        Instrument ins[] = new Instrument[10];
        for(int i=0; i<10;i++){
            if(i==1 || i==9 || i==5){
                ins[i]=new Piano();
            }else if (i==3 || i==4 || i==7){
                ins[i]=new Flute();
            }else{
                ins[i]=new Guitar();
            }
            ins[i].play();
            if(ins[i] instanceof Piano) 
                System.out.println("InstanceOf Piano"); 
            else if(ins[i] instanceof Flute) 
                System.out.println("InstanceOf Flute"); 
            else 
                System.out.println("InstanceOf Guitar"); 
            System.out.println();
        }
    } 
}
