package sign_ip;
import java.io.*;
import java.net.*;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class Download_2 extends javax.swing.JFrame{
 
    AtomicInteger over;
    String saveName;
    boolean pathIsSet;
    boolean extIsSet;
    Integer ind;
    String temp1;
    String temp2;
    String temp3;
    String temp4;
    
    String path;
    String ext;
    
    CountDownLatch cdl;
    AtomicInteger statee;
    AtomicInteger comp;  //  amount of download completed //
    
    
    String str;  // get download string from maingui //
    URL url;
    boolean multi;
    int len;
    int chunk;
    int ccode;    // check response code //
    
    Helper h1,h2,h3,h4,h5;
    Merger merger1;
    int errorstate;
     
    
    
    public Download_2(String str,Integer ind) {
        
        this.over=new AtomicInteger(0);
        this.pathIsSet=false;
        this.extIsSet=false;
        this.path="";
        this.ext="";
        
        this.ind=ind;
        
        this.temp1=this.ind.toString();
        this.ind++;
        this.temp2=this.ind.toString();
        this.ind++;
        this.temp3=this.ind.toString();
        this.ind++;
        this.temp4=this.ind.toString();
        
       
        this.str=str; 
        setTitle("Frame Of Download Link");
        initComponents();
        this.Tf2.setText("YET TO START");
        this.Tfurl.setText(this.str);
        
        
        this.setVisible(true);
        this.Pb.setValue(0);
        this.Pb.setStringPainted(true);
        this.errorstate=0;
        
        this.Bpause.setEnabled(false);
        this.Bresume.setEnabled(false);
        this.Brefresh.setEnabled(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pb = new javax.swing.JProgressBar();
        Bstrt = new javax.swing.JButton();
        Bpause = new javax.swing.JButton();
        Bresume = new javax.swing.JButton();
        Bcancel = new javax.swing.JButton();
        Brefresh = new javax.swing.JButton();
        Tf2 = new javax.swing.JTextField();
        Tfcomp = new javax.swing.JTextField();
        Tflen = new javax.swing.JTextField();
        Tfurl = new javax.swing.JTextField();
        Lresumable = new javax.swing.JLabel();
        Lurl = new javax.swing.JLabel();
        Lstatus = new javax.swing.JLabel();
        Lsize = new javax.swing.JLabel();
        Ldownloaded = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("DOWNLOAD");
        setResizable(false);

        Bstrt.setText("START");
        Bstrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BstrtActionPerformed(evt);
            }
        });

        Bpause.setText("PAUSE");
        Bpause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BpauseActionPerformed(evt);
            }
        });

        Bresume.setText("RESUME");
        Bresume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BresumeActionPerformed(evt);
            }
        });

        Bcancel.setText("CANCEL");
        Bcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcancelActionPerformed(evt);
            }
        });

        Brefresh.setText("REFRESH");
        Brefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrefreshActionPerformed(evt);
            }
        });

        Tf2.setEditable(false);
        Tf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tf2ActionPerformed(evt);
            }
        });

        Tfcomp.setEditable(false);

        Tflen.setEditable(false);

        Lresumable.setText("RESUME SUPPORT : UNDETECTED");

        Lurl.setText("URL");

        Lstatus.setText("STATUS");

        Lsize.setText("SIZE  (bytes)");

        Ldownloaded.setText("DOWNLOADED");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lstatus)
                            .addComponent(Ldownloaded)
                            .addComponent(Lsize, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lresumable, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Lurl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Tfurl, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 43, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(Brefresh))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Tf2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Bstrt)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Pb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Bpause)
                                                .addGap(18, 18, 18)
                                                .addComponent(Bresume)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Bcancel))
                                            .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(Tflen, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Tfcomp, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(20, 20, 20)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tfurl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lurl))
                .addGap(18, 18, 18)
                .addComponent(Lresumable, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bstrt)
                    .addComponent(Bpause)
                    .addComponent(Bresume)
                    .addComponent(Bcancel))
                .addGap(18, 18, 18)
                .addComponent(Pb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(Brefresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lstatus))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tflen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lsize))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tfcomp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ldownloaded))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BstrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BstrtActionPerformed
       try
       {
         this.setDownload(); 
       }catch(Exception e){}
      
    }//GEN-LAST:event_BstrtActionPerformed

    private void BpauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BpauseActionPerformed

        
        if(this.multi==false)
        {
            this.statee.set(2);
            this.Tf2.setText("PAUSED");
            this.Bresume.setEnabled(true);
            this.Bpause.setEnabled(false);   
        }
        else
        {
            this.Tf2.setText("PAUSED");
            this.Bresume.setEnabled(false);
            this.Brefresh.setEnabled(false);
            
            this.pau(); 
        }   
          
    }//GEN-LAST:event_BpauseActionPerformed

    private void BresumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BresumeActionPerformed
        
        
        if(this.multi==false)
        {
            this.Tf2.setText("DOWNLOADING IN PROGRESS");
            this.statee.set(1);
            this.Bresume.setEnabled(false);
            this.Bpause.setEnabled(true);
        }
        else
        {
          
          try
           {
             this.res();   
           }catch(Exception e){} 
        }
   
    }//GEN-LAST:event_BresumeActionPerformed

    private void BcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcancelActionPerformed
       
        try
         {
           this.cncel();
         }catch(Exception e){}
          
        
        try
         {
           this.merger1.cancel(true);   
         }catch(Exception e){}    
        
    }//GEN-LAST:event_BcancelActionPerformed

    private void BrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrefreshActionPerformed
       
            this.Tf2.setText("REFRESHING");
        
            try
            {
             this.ref();   
            }catch(Exception e){} 
         
    }//GEN-LAST:event_BrefreshActionPerformed

    private void Tf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tf2ActionPerformed

   
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bcancel;
    private javax.swing.JButton Bpause;
    private javax.swing.JButton Brefresh;
    private javax.swing.JButton Bresume;
    private javax.swing.JButton Bstrt;
    private javax.swing.JLabel Ldownloaded;
    private javax.swing.JLabel Lresumable;
    private javax.swing.JLabel Lsize;
    private javax.swing.JLabel Lstatus;
    private javax.swing.JLabel Lurl;
    private javax.swing.JProgressBar Pb;
    private javax.swing.JTextField Tf2;
    private javax.swing.JTextField Tfcomp;
    private javax.swing.JTextField Tflen;
    private javax.swing.JTextField Tfurl;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables

    
    
    
 public void ref() throws Exception
 {
   this.Bpause.setEnabled(false);
   this.Bresume.setEnabled(false);  
   this.pau();
   this.res();
 }
      
 private void pau()
 {
       
     this.statee.set(2);
      
     //modified here , sleeping thread removed//
     while( (!(this.h1.tsk())) || (!(this.h2.tsk())) || (!(this.h3.tsk())) || (!(this.h4.tsk()))   )
     {
         
     }
     
      try
       {
           
         if(this.h1.rem.get()!=0)  
          this.h1.chnk.cancel(true);
         if(this.h2.rem.get()!=0)
          this.h2.chnk.cancel(true);
         if(this.h3.rem.get()!=0)
          this.h3.chnk.cancel(true);
         if(this.h4.rem.get()!=0)
          this.h4.chnk.cancel(true);
           
         
       }catch(Exception e){}
     
     
     this.Bresume.setEnabled(true);
     this.Brefresh.setEnabled(false);
     this.Bpause.setEnabled(false);
     
 }
    
 private void res()throws Exception
 {
     
     this.Bpause.setEnabled(false);
     this.Brefresh.setEnabled(false);
     this.Tf2.setText("RESUMING");
     
     this.statee.set(1);
     this.dwn();
 }
 
 private void cncel() throws Exception
 {
     
      if(this.multi==false)
        {
           this.statee.set(3);  
           this.Bpause.setEnabled(false);
           this.Bresume.setEnabled(false);
           
            try
            {
              this.h5.chnk.cancel(true);  
            }catch(Exception e){}
        }

      else
       { 
             this.statee.set(3);   
    
             this.pau();  //as this method only for multi //
 
             this.Bpause.setEnabled(false);
             this.Bresume.setEnabled(false);
             this.Brefresh.setEnabled(false);
       
             try
             {
                this.h1.raf.setLength(0);
             }catch(Exception e){}
       
            try
             {
                this.h2.raf.setLength(0);
             }catch(Exception e){}
       
            try
            {
                this.h3.raf.setLength(0);
            }catch(Exception e){}
       
            try
            {
               this.h4.raf.setLength(0);
            }catch(Exception e){}
          
       }
      
     try{
         Thread.currentThread().sleep(1000);
     }catch(Exception e){}  // to wait 1 sec for proper disposal //
      
     this.dispose();
     
 }
 
 private void dwn()throws Exception
   {
        
       this.Tf2.setText("DOWNLOADING IN PROGRESS");
        
       if(this.multi==false)
       {
          
          this.Bresume.setEnabled(false);
          this.Brefresh.setVisible(false);
          this.Bpause.setEnabled(true);
          this.Bstrt.setEnabled(false);
          
          this.h5.f(); 
       }
        
       else
       { 
          
         this.Bpause.setEnabled(true);
         this.Bresume.setEnabled(false);
         this.Brefresh.setEnabled(true);
           
        
         if(this.h1.rem.get()!=0) 
           this.h1.f();
         if(this.h2.rem.get()!=0)
           this.h2.f();
         if(this.h3.rem.get()!=0)
           this.h3.f();
         if(this.h4.rem.get()!=0)
           this.h4.f();
       }
       
   }

 
 
  private void setDownload() throws Exception
    {
      
        try
           {
             this.url=new URL(str);
           }catch(Exception e){}
         
         
         this.statee= new AtomicInteger(1);
         this.comp = new AtomicInteger(0);
         
        
         HttpURLConnection conn = (HttpURLConnection)url.openConnection();
         conn.setRequestProperty("Range","bytes="+0+"-");
  
         
         try{
             
              conn.connect();
              this.len = conn.getContentLength();
            
              if(len==-1)
                this.errorstate=1;
            
              this.ccode =conn.getResponseCode();
            
              if(!(ccode==200 || ccode==206))
                this.errorstate=1;
            
                
            }catch(Exception e){ this.errorstate=1;}
         
         if(this.errorstate==1)
         {
           JOptionPane.showMessageDialog(null,"error in connection, start again");  
           this.dispose();
         }
         
         else
         {
             while(this.pathIsSet==false)
               this.setPath();  
             while(this.extIsSet==false)
              this.setExt();
              
             this.saveName=this.path+"."+this.ext; 
              
             this.Bstrt.setEnabled(false);
             this.Tf2.setText("STARTED");
             
             
             this.len = conn.getContentLength();
             Integer kkk=new Integer(len);             
             this.Tflen.setText(kkk.toString());
             
             this.ccode =conn.getResponseCode();

         
             if(ccode==200)
               {
                
                 this.Lresumable.setText("RESUME SUPPORT : NO");
                   
                 this.multi=false;
                 this.cdl=new CountDownLatch(1);
                 this.h5 = new Helper(multi,cdl,Pb,Tfcomp,Tf2,statee,comp,url,this.saveName,0,len-1,len);
                 this.merger1 = new Merger(Pb,this.cdl,this.multi,this.over,this.Bpause,this.Bresume,this.Tf2);
              
               }
  
                 
              else if (ccode==206)
               {
                   
                  this.Lresumable.setText("RESUME SUPPORT : YES"); 
                  this.multi=true;

                  this.chunk=this.len/4;

                  this.cdl=new CountDownLatch(4);

                  this.h1 = new Helper(multi,this.cdl,Pb,Tfcomp,Tf2,statee,comp,url,temp1,0,chunk,len);
                  this.h2 = new Helper(multi,this.cdl,Pb,Tfcomp,Tf2,statee,comp,url,temp2,chunk+1,2*chunk,len);
                  this.h3 = new Helper(multi,this.cdl,Pb,Tfcomp,Tf2,statee,comp,url,temp3,2*chunk+1,3*chunk,len);
                  this.h4 = new Helper(multi,this.cdl,Pb,Tfcomp,Tf2,statee,comp,url,temp4,3*chunk+1,len-1,len);
             
                  this.merger1 = new Merger(Pb,this.cdl,this.multi,temp1,temp2,temp3,temp4,this.saveName,this.over,this.Bpause,this.Bresume,this.Brefresh,this.Tf2);

               }  

               this.dwn();
               this.merger1.execute();
               
         }
         

         
    }
 
 
 
  
  void setPath()
  {
             JFileChooser fileChooser = new JFileChooser();
             fileChooser.setDialogTitle("Specify a file to save");

             int userSelection = fileChooser.showSaveDialog(null);
             
             if (userSelection == JFileChooser.APPROVE_OPTION) {
               File fileToSave = fileChooser.getSelectedFile();
                 path=fileToSave.getAbsolutePath();
               }
             
             if(this.path.length()==0)
                 this.pathIsSet= false;
             else
                 this.pathIsSet= true;
  }

  void setExt()
     {

          this.ext="myrmidons";
      
           final String afterLastSlash = this.str.substring(str.lastIndexOf('/') + 1);
           final int afterLastBackslash = afterLastSlash.lastIndexOf('\\') ;
           final int dotIndex = afterLastSlash.indexOf('.', afterLastBackslash+1); // after occurence of last // , so +1 //

          // str.indexof('c',x) returns index of first  occurence of 'c' at or after  index 'x'  //

           this.ext= (dotIndex == -1) ? "" : afterLastSlash.substring(dotIndex + 1);

          int i=2;
          //     i=2 when joptionpane returns cancel, ie yes/no not selected //
          //   joptionpane returns 0 for yes, 1 for no , 2 for cancel , -1 for  closing//
          
           if(this.ext.length()==0) 
               this.ext= JOptionPane.showInputDialog(null,"manually enter extension. eg : mp4,pdf");
           
           else
           {
               while(i==2 || i==-1)
                   i =  JOptionPane.showConfirmDialog(null,"confirm detected extension  : "+this.ext);
              
               if(i==1)  // no is pressed //
                     this.ext= JOptionPane.showInputDialog(null,"manually enter extension. eg : mp4,pdf");  
               
           }
           
          
          if(this.ext!="myrmidons")
            this.extIsSet=true;  
          
       } 
      
     
  
  }
  
  
  
 
