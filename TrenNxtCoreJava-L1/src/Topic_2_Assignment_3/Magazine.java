/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Topic_2_Assignment_3;
import Topic_2_Assignment_3.Book;
import java.util.Scanner;
/**
 *
 * @author Chetan Singh Sengar
 */
public class Magazine extends Book{
   
    public Magazine(String title,String author,int isbn,double price) {
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
        Magazine m = new Magazine(title,author,isbn,price);
        System.out.println(m);
    }
}
