/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_7;

/**
 *
 * @author Chetan Singh Sengar
 */
public class Assignment_7 {
        static int fact(int n){
            if(n==1)
                return 1;
            return n*=fact(n-1);
        }

        public static void main(String args[]){
            int f=fact(5);
            System.out.println(f);
        }
}
