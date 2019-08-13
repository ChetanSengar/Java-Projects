package sign_ip;
import java.io.*;
import java.net.*;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.SwingWorker;

public class Merger extends SwingWorker<Void,Void> {

    JTextField Tf2;
    JButton Bpause;
    JButton Bresume;
    JButton Brefresh;
    AtomicInteger over;
    String temp1;
    String temp2;
    String temp3;
    String temp4;
    String saveName;
    
    CountDownLatch cdl ;
    boolean multi;
    RandomAccessFile rafx;
    FileInputStream fis1;
    FileInputStream fis2;
    FileInputStream fis3;
    FileInputStream fis4;
    JProgressBar Pb;
   
   
   
   Merger(JProgressBar Pb,CountDownLatch cdl, boolean multi,String temp1,String temp2,String temp3,String temp4,String saveName,AtomicInteger over,JButton Bpause,JButton Bresume,JButton Brefresh,JTextField Tf2)
   {
       this.Tf2=Tf2;
       this.Bpause=Bpause;
       this.Bresume=Bresume;
       this.Brefresh=Brefresh;
   
       this.over=over;
       this.cdl=cdl;
       this.multi=multi;
       this.Pb=Pb;  
       this.temp1=temp1;
       this.temp2=temp2;
       this.temp3=temp3;
       this.temp4=temp4;
       this.saveName=saveName;
           
   }
   
   Merger(JProgressBar Pb,CountDownLatch cdl, boolean multi,AtomicInteger over,JButton Bpause,JButton Bresume,JTextField Tf2)
   {
       this.Tf2=Tf2;
       this.over=over;
       this.cdl=cdl;
       this.multi=multi;
       this.Pb=Pb;
       this.Bpause=Bpause;
       this.Bresume=Bresume;
   }
   
   
   
 protected Void doInBackground()
    {
         
        try{
           cdl.await(); 
        }catch(Exception e){}
        
        
        if(this.multi==true)
        {
             
             try{
                 this.rafx = new RandomAccessFile(this.saveName,"rw"); 
             }catch(Exception e){}
             
             
             try{
                 fis1 = new FileInputStream(temp1); 
             }catch(Exception e){}
             
             try{
                 fis2 = new FileInputStream(temp2); 
             }catch(Exception e){}
             
             try{
                 fis3 = new FileInputStream(temp3); 
             }catch(Exception e){}
             
             
             try{
                 fis4 = new FileInputStream(temp4); 
             }catch(Exception e){}
            

             int num;

             byte dta[] = new byte[81920];

             try
             {
                 while((num=fis1.read(dta,0,81920))!=-1)
                  rafx.write(dta,0,num);
                 while((num=fis2.read(dta,0,81920))!=-1)
                  rafx.write(dta,0,num);
                 while((num=fis3.read(dta,0,81920))!=-1)
                  rafx.write(dta,0,num);
                 while((num=fis4.read(dta,0,81920))!=-1)
                  rafx.write(dta,0,num);
             }catch(Exception e){}
             


              if(rafx!=null)
                 {
                    try
                    {
                      rafx.close();
                    } catch(Exception e){}
                 }

              if(fis1!=null)
                {
                    try
                      {
                        fis1.close();
                      }catch(Exception e){}
                }
              if(fis2!=null)
                {
                   try
                    {
                       fis2.close();
                    }catch(Exception e){}
                 }
              if(fis3!=null)
               {
                  try
                   {
                       fis3.close();
                   }catch(Exception e){}
               }
              if(fis4!=null)
                {
                   try
                    {
                       fis4.close();
                   }catch(Exception e){}
                }
            
        }
        
        return null;
    }
    
    protected void process()
    {
    }
    
    protected void done()
    {
      Pb.setValue(100);
      this.over.set(1);
      
      if(this.multi==false)
      {
         this.Bpause.setEnabled(false);
         this.Bresume.setEnabled(false);
         this.Tf2.setText("TASK DONE");
      }
      
      else
      {
         this.Bpause.setEnabled(false);
         this.Bresume.setEnabled(false);
         this.Brefresh.setEnabled(false);
         this.Tf2.setText("TASK DONE");
      }
      
      
    }
    
}
