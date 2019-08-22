/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_2;

import java.util.Scanner;

/**
 *
 * @author Chetan Singh Sengar
 */
public class assignment_2 {

    public static void call(){
        Scanner i = new Scanner(System.in);
        int n = i.nextInt();
        if(n==1){
            System.out.println( - 5 + 8 * 6 );
        }else if(n==2){
            System.out.println( (55 + 9) % 9 );
        }else if(n==3){
            System.out.println( 20 + - 3 * 5 / 8 );
        }else if(n==4){
            System.out.println( 5 + 15 / 3 * 2 - 8 % 3 );
        }else{
            System.out.println("!! Wrong Choice !! Select Again !!");
            call();
        }
    }
    public static void main(String[] args){
    
        System.out.println("Enter the choice to perform the below action : ");
        System.out.println("1) -5+8*6 ");
        System.out.println("2) (55+9)%9 ");
        System.out.println("3) 20+-3*5/8 ");
        System.out.println("4) 5+15/3*2-8%3 ");
        call();
    }
}
