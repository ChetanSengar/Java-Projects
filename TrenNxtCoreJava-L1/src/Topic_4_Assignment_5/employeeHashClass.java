/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Topic_4_Assignment_5;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Chetan
 */
public class employeeHashClass {
    public static void retrieveValuesFromListMethod1(Set set){
        Iterator itr = set.iterator();
        while(itr.hasNext()){
            System.out.println("\t-"+itr.next());
        }
    }
    public static void main(String args[]){
        Set set = new HashSet();
        String n = "Y"; int number;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter how many employee names you want to store :");
        number = scan.nextInt();
        System.out.println("Enter employee names :");
        for(int i=0;i<=number;i++){
            n=scan.nextLine();
            set.add(n);
        }
        System.out.print("\n Retrieving values from HashSet using Iterator");
        retrieveValuesFromListMethod1(set);
    }
}
