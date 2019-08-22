/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Topic_2_Assignment_4;

/**
 *
 * @author Chetan Singh Sengar
 */
public class TestDemo
{
    public static void main(String[] args){
        CreditCardPayment x = new CreditCardPayment(2.12, "Chetan Singh","11/27", "************3575");
	CashPayment p = new CashPayment(20.03);
        CreditCardPayment y = new CreditCardPayment(11.22, "Cherry","22/11","897986");
        CashPayment q = new CashPayment(55.12);
	x.paymentDetails();
	p.paymentDetails();
	y.paymentDetails();
	q.paymentDetails();
    }	
}
