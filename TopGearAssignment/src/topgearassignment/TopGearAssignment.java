/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topgearassignment;

import java.util.Scanner;

/**
 *
 * @author Chetan Singh Sengar
 */
public class TopGearAssignment {
    
	static int factorial(int x) {
		if(x==1||x==0)
			return 1;
		else
			return(x*factorial(x-1));
	}
        public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(factorial(x));
		sc.close();
	}

}