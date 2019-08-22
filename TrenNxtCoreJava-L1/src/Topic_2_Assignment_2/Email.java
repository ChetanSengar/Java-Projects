/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Topic_2_Assignment_2;
import Topic_2_Assignment_2.Document;
import java.util.Scanner;
/**
 *
 * @author Chetan Singh Sengar
 */
public class Email extends Document{
    static String sender, recipient, title;
    static Document d = new Document();
    
    static String getSender(String sender){
        return sender;
    }
    static String setText(String sender, String recipient, String title){
        Email.sender=sender;
        Email.recipient=recipient;
        Email.title=title;
        d.text ="Sender : "+Email.sender+", Recipient : "+Email.recipient+", Title : "+Email.title;
        return d.text;
    }
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        System.out.printf("Enter the sender name : ");
        sender = sn.nextLine();
        System.out.printf("Enter the recipient name : ");
        recipient = sn.nextLine();
        System.out.printf("Enter the Title of email : ");
        title = sn.nextLine();
        d.text = setText(getSender(sender),recipient,title);
        d.toString(d.text);
    }
}
