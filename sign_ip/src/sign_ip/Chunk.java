package sign_ip;
import java.io.*;
import java.net.*;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.SwingWorker;



public class Chunk extends SwingWorker<Void,AtomicInteger> {

 boolean multi;
 AtomicInteger ctaskk;   
  int connFlag;  
    
 CountDownLatch cdl;
 JProgressBar Pb;
 JTextField Tfcomp;
 JTextField Tf2;
 RandomAccessFile raf;      
 AtomicInteger statee;
 AtomicInteger comp;
 AtomicInteger strt;
 AtomicInteger dwn;
 AtomicInteger rem;
 
 
 int endd;
 int len;
 URL url;
 BufferedInputStream bis ;
 
    
 int num;
 int maxx;
 byte dta[];
    
    
 
 
 Chunk(boolean multi,AtomicInteger ctaskk,CountDownLatch cdl,JProgressBar Pb,JTextField Tfcomp,JTextField Tf2,RandomAccessFile raf,AtomicInteger statee,AtomicInteger comp,URL url ,AtomicInteger strt ,int endd,AtomicInteger dwn,AtomicInteger rem,int len)
 {
      this.multi=multi;
      this.connFlag=0;
     
      this.ctaskk=ctaskk;
     
      this.cdl=cdl;
      this.Pb=Pb;
      this.Tfcomp=Tfcomp;
      this.Tf2=Tf2;
      this.raf = raf;
      this.statee=statee;
      this.comp=comp;
      this.strt = strt;
      this.dwn=dwn;
      this.rem=rem;
      
      
      this.endd = endd;
      
      this.url = url;
      this.len=len;
      
      this.maxx=10000000;
      this.dta= new byte[maxx];
      
 }
    
    
 
 public void f1() throws Exception
   {    
        this.connFlag=1;
        
        HttpURLConnection conn;
        try
        {
          conn = (HttpURLConnection)url.openConnection();  
          conn.setRequestProperty("Range","bytes="+strt.get()+"-");
          conn.connect();
          try
          {
          this.bis = new BufferedInputStream(conn.getInputStream());
          }catch(Exception e){}
          
          
        }catch(Exception e){this.connFlag=0;}
            
   }
 
 
 
 
 public void f() throws Exception
    {
       
       this.raf.seek(this.dwn.get());
       
       int x;
       
        while((this.statee.get()==1) && (this.rem.get()>0) )
        {
            
             if((x=bis.available())!=0)
              {
                   
                   if(rem.get()>maxx)
                      num=bis.read(dta,0,maxx);
                   else
                     num=bis.read(dta,0,rem.get());   
        
              
                     raf.write(dta,0,num);
                   
                     this.rem.getAndAdd((-1)*num);
                     this.strt.getAndAdd(num);
                     this.comp.getAndAdd(num);
                     this.dwn.getAndAdd(num);
                     publish(this.comp);
                       
                       
               }  
                
         } 
        
        
           if(bis!=null)
             {
                try
                 {
                    bis.close();
                 }catch(Exception e){}
             }

            
          
      if(this.rem.get()==0)
            {
                this.cdl.countDown();
                this.ctaskk.set(1);  
            }
            else
                this.ctaskk.set(1);
        
        
    }
 
 

 public void f2() throws Exception
 {

         HttpURLConnection conn = (HttpURLConnection)url.openConnection();

         conn.setRequestProperty("Range","bytes="+strt+"-");
         
         try{
           conn.connect();  
         }catch(Exception e){}
           
             
            
           this.bis = new BufferedInputStream(conn.getInputStream());

           int x;
           
            while((this.statee.get()!=3) && (this.rem.get()>0) )
            {
 
               if(this.statee.get()==1 )
                {
           
                    if((x=bis.available())!=0) 
                      {
                          if(rem.get()>maxx)
                            num=bis.read(dta,0,maxx);
                          else
                            num=bis.read(dta,0,rem.get());  
                   
                          raf.write(dta,0,num);
                          this.rem.getAndAdd((-1)*num);
                          this.strt.getAndAdd(num);
                          this.comp.getAndAdd(num);
                          this.dwn.getAndAdd(num);
                          publish(this.comp);
                      }
                  
                 }//end of if state==1 //
             }//end of while state!=3 && rem>0 //



               if(raf!=null)
                 {
                    try
                     {
                        raf.close();
                     } catch(Exception e){}
                 }

              if(bis!=null)
                {
                   try
                     {
                       bis.close();
                     }catch(Exception e){}
                }

               if(this.rem.get()==0)
                  this.cdl.countDown();
     
 }


  protected Void doInBackground()
    {
    
        if(this.multi==false)
         {
               try
                {
                  this.f2();   
                }catch(Exception e){}     
         }
        
        else
         {
             try
              {
                 int i;
           
                 for(i=0;i<2 && this.connFlag==0;i++)
                     this.f1();   // try 2 times to connect //
                   
                  if(this.connFlag==1) 
                     this.f(); 
                  else
                     this.ctaskk.set(1);
     
               }catch(Exception e){}  
         }
        
       
        return null;
    }
    
    
  protected void process(List <AtomicInteger> lis)
    {
        Pb.setValue(  (int) (  (lis.get(lis.size() - 1)).get() / (len/100) )   );
        this.Tfcomp.setText(this.comp.toString());
    }
  
 
  protected void done()
  {
  }
  
  
}
