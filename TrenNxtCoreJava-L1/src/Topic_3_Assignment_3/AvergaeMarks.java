/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Topic_3_Assignment_3;

import static java.sql.Types.NULL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Chetan Singh Sengar
 */
public class AvergaeMarks {
    
    public static void main(String args[]){
      int i;
      double avg=0;
      int n;
      n=args.length;
      try {
        if(args != null && n==5){
            for( i=0;i<n;i++){
                 avg=avg+Integer.parseInt(args[i]);
            }
            System.out.print("Average marks of (");
            for(i=0;i<n-1;i++){
                 System.out.print(args[i]+",");
            }
            System.out.println(args[i]+") ="+avg/n);
        }else   
            throw new ArrayIndexOutOfBoundsException();
      }catch (ArrayIndexOutOfBoundsException ex) {
          System.out.println(ex.getMessage());
      }
   }
}
