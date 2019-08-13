package sign_ip;
import javax.swing.JOptionPane;


public class MainGui extends javax.swing.JFrame {

    Integer ind;
   
    public MainGui() {
        
        this.ind=new Integer(1);
        initComponents();
        
             this.addWindowListener(new java.awt.event.WindowAdapter() {
           @Override
           public void windowClosing(java.awt.event.WindowEvent windowEvent)
           {
               if (JOptionPane.showConfirmDialog(
                            null
                             ,"Closing application cancels all current downloads . Sure to close?"
                             , "CONFIRM CLOSING APPLICATION !"
                             ,JOptionPane.YES_NO_OPTION
                             ,JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION
                       )
                            {
                              System.exit(0);
                            }
            }});
        
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Badd = new javax.swing.JButton();
        Tfurl = new javax.swing.JTextField();
        Lhome = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Minfo = new javax.swing.JMenu();
        Mversion = new javax.swing.JMenuItem();
        Mhelp = new javax.swing.JMenu();
        Mtutor = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("DOWNLOAD MANAGER");
        setResizable(false);

        Badd.setText("ADD URL");
        Badd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaddActionPerformed(evt);
            }
        });

        Tfurl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfurlActionPerformed(evt);
            }
        });

        Lhome.setText("         DOWNLOAD    MANAGER    HOME");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Minfo.setText("INFO");

        Mversion.setText("VERSION");
        Mversion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MversionActionPerformed(evt);
            }
        });
        Minfo.add(Mversion);

        jMenuBar1.add(Minfo);

        Mhelp.setText("HELP");
        Mhelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MhelpActionPerformed(evt);
            }
        });

        Mtutor.setText("TUTOR");
        Mtutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MtutorActionPerformed(evt);
            }
        });
        Mhelp.add(Mtutor);

        jMenuBar1.add(Mhelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(Tfurl, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(Badd, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Lhome, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Lhome, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Tfurl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(Badd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TfurlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfurlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfurlActionPerformed

    private void BaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaddActionPerformed
        Download_2 d = new Download_2(this.Tfurl.getText(),this.ind);
        this.ind+=4;
        this.Tfurl.setText("");
        
    }//GEN-LAST:event_BaddActionPerformed

    private void MversionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MversionActionPerformed
       JOptionPane.showMessageDialog(null,"18 MAY 2017_version.");
    }//GEN-LAST:event_MversionActionPerformed

    private void MhelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MhelpActionPerformed
      
    }//GEN-LAST:event_MhelpActionPerformed

    private void MtutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MtutorActionPerformed

        Help helpp=new Help();
        helpp.setVisible(true);
        
    }//GEN-LAST:event_MtutorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        work h = new work();
        h.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Badd;
    private javax.swing.JLabel Lhome;
    private javax.swing.JMenu Mhelp;
    private javax.swing.JMenu Minfo;
    private javax.swing.JMenuItem Mtutor;
    private javax.swing.JMenuItem Mversion;
    private javax.swing.JTextField Tfurl;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
