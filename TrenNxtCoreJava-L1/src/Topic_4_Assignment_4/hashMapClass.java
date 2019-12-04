/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Topic_4_Assignment_4;

import java.util.HashMap;

/**
 *
 * @author Chetan
 */
public class hashMapClass {
    public HashMap teletelephoneBook;
    hashMapClass(){
            teletelephoneBook = new HashMap();
            teletelephoneBook.put("Chetan", "1234567");
            teletelephoneBook.put("Singh", "7654321");
            teletelephoneBook.put("Sengar", "5437621");
    }
    public void printTeleNumber(String name){
        if(teletelephoneBook.containsKey(name)){
            String teleNumber=(String) teletelephoneBook.get(name);
            System.out.println("The Telephone Number of " +
                           name + " is: " + teleNumber);
        }else{
            System.out.println("The is not present in the list!");   
        }
    }
    public void inputEntry(String name, String number){
        teletelephoneBook.put(name, number);
    }
    public void numberOfEntries(){
        System.out.println("The number of entries: " + teletelephoneBook.size());    
    }
    public static void main(String args[]) 
    { 
        String name = "Singh";
      hashMapClass a = new hashMapClass();
      a.printTeleNumber(name);    
    } 
}
