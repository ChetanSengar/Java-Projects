/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Topic_5_Assignment_1;

import Topic_5_Assignment_1.test.Foundation;

/**
 *
 * @author ch954245
 */
public class Main extends Foundation{
    public static void main(String args[]){
        Foundation foundation = new Foundation();
	foundation.Var4 = 5;
        /*foundation.Var2 = 5;
        foundation.Var3 = 5;
        foundation.Var1 = 5;*/
        System.out.println(foundation.Var4);
    }
    //As mentioned here only the Var4 is accessable from the foundation class.
}
