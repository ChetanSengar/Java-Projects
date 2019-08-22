/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Topic_2_Assignment_1;

import java.util.Scanner;

/**
 *
 * @author Chetan Singh Sengar
 */
public class Book {
    
    Book(){
        String title;
        String author;
        int price, dis;
    }
    
    public void isl(String title, String author, double dprice){
        System.out.println("Book Name: "+title);
        System.out.println("Book Author : "+author);
        System.out.println("Price after Discount : "+dprice);
    }
    
    private static double discountedprice(double price, double dget){
        double dprice = price - price * dget /100;
        return dprice;
    }
    
    static public void main(String args[]){
        Book b = new Book();
        double dprice, price, dget;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the price for the book : ");
        price = scan.nextDouble();
        System.out.print("Enter the discount for the book : ");
        dget = scan.nextDouble();
        dprice=discountedprice(price, dget);
        b.isl("Half Girlfriend", "Chetan Bhagat", dprice);
    }
}
