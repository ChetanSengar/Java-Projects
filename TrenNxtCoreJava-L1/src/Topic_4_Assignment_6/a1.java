/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Topic_4_Assignment_6;

/**
 *
 * @author ch954245
 */
public class a1 {
    @Override
    protected void finalize() throws Throwable{
        try {
            System.out.println("Finalizze method called.");
        } finally {
            super.finalize();
        }
    }
}
