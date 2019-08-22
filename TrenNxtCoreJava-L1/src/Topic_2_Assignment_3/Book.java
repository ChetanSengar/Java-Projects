/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Topic_2_Assignment_3;

/**
 *
 * @author Chetan Singh Sengar
 */
public class Book {
    
    public String title;
    public String author;
    public int isbn;
    public double price;
    
    public Book(){
        
    }
    public Book(String title,String author,int isbn,double price)
    {   this.title=title;
        this.author=author;
        this.isbn=isbn;
        this.price=price;
    } 
    public String getTitle()
    {
        return title;
    }
    
     public String getAuthor()
    {
        return author;
    }
    public int getISBN()
    {
        return isbn;
    }
    public double getPrice()
    {
        return price;
    }
    public void setTitle(String title)
    {
        this.title=title;
    }
     public void setAuthor(String author)
    {
       this.author=author;
    }
    public void setISBN(int isbn)
    {
        this.isbn=isbn;
    }
    public void setCost(double cost)
    {
        this.price=cost;
    }    
    public String toString()
    {
        return "The details of the book are: "
                + title + ", " + author + 
                ", " + isbn + ", " + price;
    }
}
