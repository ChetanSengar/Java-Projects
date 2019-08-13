package sign_ip;
import javax.swing.SwingWorker;
import java.io.*;
import java.net.*;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.List;
import javax.swing.JProgressBar;
import javax.swing.JTextField;


public class Helper {
    
 boolean multi;   
 AtomicInteger ctaskk;   
 Chunk chnk;   
    
 CountDownLatch cdl;
 JProgressBar Pb; 
 JTextField Tfcomp;
 JTextField Tf2;
 AtomicInteger statee;
 AtomicInteger comp;
 
 RandomAccessFile raf;
 AtomicInteger strt;
 int endd;
 AtomicInteger dwn;
 AtomicInteger rem;
 int len;
 URL url;
 
    
 Helper(boolean multi,CountDownLatch cdl,JProgressBar Pb,JTextField Tfcomp,JTextField Tf2,AtomicInteger statee,AtomicInteger comp,URL url ,String fname, int strt , int endd,int len)
 {
      
     this.multi=multi;     
     this.ctaskk = new AtomicInteger(0); 
     
     
     try
      {
        this.raf = new RandomAccessFile(fname,"rw");
      }catch(Exception e){}

     this.cdl=cdl;
     this.Pb=Pb;
     this.Tfcomp=Tfcomp;
     this.Tf2=Tf2;
     this.statee=statee;
     this.comp=comp;
         
     this.url = url;
     this.strt= new AtomicInteger(strt);
     this.endd = endd; 
     this.dwn =new AtomicInteger(0);
     this.rem= new AtomicInteger(endd-strt+1); 
     
     this.len=len;
     
 }
    
 
   public boolean tsk()
   {
       if( (this.rem.get()==0) || (this.ctaskk.get()==1))
         return true;  
         
       return false;   
   }
 
 
    public void f() throws Exception
    { 
        this.ctaskk.set(0);
        this.chnk = new Chunk(this.multi,this.ctaskk,this.cdl,this.Pb,this.Tfcomp,this.Tf2,this.raf,this.statee,this.comp,this.url ,this.strt ,this.endd,this.dwn,this.rem,this.len);
        this.chnk.execute();
    }
}
