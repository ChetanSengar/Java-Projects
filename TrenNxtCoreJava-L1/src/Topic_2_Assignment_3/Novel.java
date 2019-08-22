/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Topic_2_Assignment_3;

import java.util.Scanner;

/**
 *
 * @author Chetan Singh Sengar
 */
public class Novel extends Book{
    public Novel(){}
    public Novel(String title, String author, int isbn, double price) {
        super(title, author, isbn, price);
    }
    public static void main(String args[]){
        String title, author;
        int isbn, price;
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter the book title : ");
        title = scan.nextLine();
        System.out.printf("Enter the book author : ");
        author = scan.nextLine();
        System.out.printf("Enter the book number : ");
        isbn = scan.nextInt();
        System.out.printf("Enter the book price : ");
        price = scan.nextInt();
        Novel n = new Novel();
        n.setTitle(title);n.setAuthor(author);n.setISBN(isbn);n.setCost(price);
        System.out.println(n);
        
    }
}