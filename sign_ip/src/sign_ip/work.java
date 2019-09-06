/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sign_ip;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Desktop;
import javax.swing.ImageIcon;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
/*import org.opencv.highgui.Highgui;
import org.opencv.highgui.VideoCapture;*/
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.media.CannotRealizeException;
import javax.media.ControllerEvent;
import javax.media.ControllerListener;
import javax.media.Manager;
import javax.media.NoPlayerException;
import javax.media.Player;
import javax.media.RealizeCompleteEvent;
import javax.swing.JFileChooser;
import javazoom.jl.decoder.JavaLayerException;
/*import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.core.MatOfRect;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
* 
/*import static javafx.application.Application.launch;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javax.imageio.ImageIO;
import org.opencv.core.Size;
import org.opencv.highgui.Highgui;
import org.opencv.highgui.VideoCapture;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;
/**
 *
 * @author hp 1
 */
public class work extends javax.swing.JFrame implements ActionListener,ControllerListener{
    int timeRun=0;
    int xMouse=0;
    int yMouse=0;
    // public DaemonThread myThread = null;
    int count = 0;
    /*VideoCapture webSource = null;
    Mat frame = new Mat();
    MatOfByte mem = new MatOfByte();
    CascadeClassifier faceDetector = new CascadeClassifier(FaceDetection.class.getResource("haarcascade_frontalface_alt.xml").getPath().substring(1));
    MatOfRect faceDetections = new MatOfRect();
*/
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void controllerUpdate(ControllerEvent ce) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
  /*  class DaemonThread implements Runnable {

        protected volatile boolean runnable = false;

        public DaemonThread() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void run() {
            synchronized (this) {
                while (runnable) {
                    if (webSource.grab()) {
                        try {
                            webSource.retrieve(frame);
                            Graphics g = jPanel1.getGraphics();
                            faceDetector.detectMultiScale(frame, faceDetections);
                            for (Rect rect : faceDetections.toArray()) {
                               // System.out.println("ttt");
                                Core.rectangle(frame, new Point(rect.x, rect.y), new Point(rect.x + rect.width, rect.y + rect.height),
                                        new Scalar(0, 255,0));
                            }
                            Highgui.imencode(".bmp", frame, mem);
                            Image im = ImageIO.read(new ByteArrayInputStream(mem.toArray()));
                            BufferedImage buff = (BufferedImage) im;
                            if (g.drawImage(buff, 0, 0, getWidth(), getHeight()-150 , 0, 0, buff.getWidth(), buff.getHeight(), null)) {
                                if (runnable == false) {
                                    System.out.println("Paused ..... ");
                                    this.wait();
                                }
                            }
                        } catch (Exception ex) {
                            System.out.println("Error");
                        }
                    }
                }
            }
        }
    }
    /**
     * Creates new form work
     */
    
    
    public work() {
        initComponents();
        new Thread(){
            public void run(){
                while(timeRun==0){
                    Calendar cal = new GregorianCalendar();
                    int hour = cal.get(Calendar.HOUR );
                    int min = cal.get(Calendar.MINUTE );
                    int sec = cal.get(Calendar.SECOND );
                    int am_pm = cal.get(Calendar.AM_PM );
                    
                    String day_night = "";
                    if(am_pm==1){
                        day_night="PM";
                    } else{
                        day_night="AM";
                    }
                    String time=hour+":"+min+":"+sec+" "+day_night;
                    clock.setText(time);
                }
            }
        }.start();
    }
   
    private int xstart=0;
    private int ystart=0;
    private int xend=0;
    private int yend=0;
    
    private Line2D linebuffer;
    private Ellipse2D circlebuffer;
    private Graphics2D g2;
    
    private List<Line2D> linecontainer = new ArrayList();
    private List<Ellipse2D> circlecontainer = new ArrayList();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        clock = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        app = new javax.swing.JButton();
        gam = new javax.swing.JButton();
        audio = new javax.swing.JButton();
        pai = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        extra = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        app_panel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        game_panel = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        audio_panel = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        paint_panel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        extra_panel = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 0, 102));

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Ravie", 0, 48)); // NOI18N
        jLabel2.setText("APPLICATION CONSOLE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 102, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        clock.setFont(new java.awt.Font("Ravie", 0, 48)); // NOI18N
        clock.setText("00:00:00");

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(clock, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(0, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        app.setFont(new java.awt.Font("Ravie", 0, 14)); // NOI18N
        app.setText("Application");
        app.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appActionPerformed(evt);
            }
        });

        gam.setFont(new java.awt.Font("Ravie", 0, 24)); // NOI18N
        gam.setText("Game");
        gam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gamActionPerformed(evt);
            }
        });

        audio.setFont(new java.awt.Font("Ravie", 0, 14)); // NOI18N
        audio.setText("Audio Player");
        audio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                audioActionPerformed(evt);
            }
        });

        pai.setFont(new java.awt.Font("Ravie", 0, 24)); // NOI18N
        pai.setText("Paint");
        pai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paiActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/a/cart0003.gif.pagespeed.ce.2uB6Noh30u.gif"))); // NOI18N

        extra.setFont(new java.awt.Font("Ravie", 0, 24)); // NOI18N
        extra.setText("Extras");
        extra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extraActionPerformed(evt);
            }
        });

        jButton13.setText("LOGOUT");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(audio, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(gam, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(app, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addComponent(pai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(extra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton13))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(app, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(gam, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(audio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pai, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(extra, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jButton13))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setLayout(new java.awt.CardLayout());

        app_panel.setBackground(new java.awt.Color(255, 0, 255));
        app_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/a/didoihethong copy_2.png"))); // NOI18N
        app_panel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 210, 180));

        jButton11.setFont(new java.awt.Font("Ravie", 0, 36)); // NOI18N
        jButton11.setText("CALCULATOR");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        app_panel.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 370, 80));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/a/calco.png"))); // NOI18N
        app_panel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 500, 330));

        jButton12.setFont(new java.awt.Font("Ravie", 0, 36)); // NOI18N
        jButton12.setText("CLICK FOR NOTEPAD");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        app_panel.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 530, 90));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/a/didoihethong copy.png"))); // NOI18N
        app_panel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 300, 190));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/a/math-152688_960_720.png"))); // NOI18N
        app_panel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 40, 230));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/a/calculator.jpg"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        app_panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 610, 380));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/a/notepad.jpg"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        app_panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/a/notte.png"))); // NOI18N
        app_panel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 380, 250));

        jPanel5.add(app_panel, "card2");

        game_panel.setBackground(new java.awt.Color(51, 0, 102));
        game_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Ravie", 0, 36)); // NOI18N
        jButton2.setText("TEKKEN 3");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        game_panel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, 280, 60));

        jButton3.setFont(new java.awt.Font("Ravie", 0, 24)); // NOI18N
        jButton3.setText("PUZZLE (WEB)");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        game_panel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 260, 44));

        jButton4.setFont(new java.awt.Font("Ravie", 1, 24)); // NOI18N
        jButton4.setText("BLOODY ROAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        game_panel.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 550, 300, 60));

        jButton5.setFont(new java.awt.Font("Ravie", 0, 24)); // NOI18N
        jButton5.setText("CHESS");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        game_panel.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 560, 154, 46));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/a/thumb.jpg"))); // NOI18N
        game_panel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 630));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/a/a.jpg"))); // NOI18N
        game_panel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 270, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/a/shenlong_wp_by_ffanatic.jpg"))); // NOI18N
        game_panel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 370, 630));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/a/di45bKg4T.jpg"))); // NOI18N
        game_panel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 310, 630));

        jPanel5.add(game_panel, "card3");

        audio_panel.setBackground(new java.awt.Color(0, 0, 0));
        audio_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setFont(new java.awt.Font("Ravie", 0, 48)); // NOI18N
        jButton6.setText("Select");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        audio_panel.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 530, 270, 90));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/a/2324.png"))); // NOI18N
        audio_panel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, 510, 370));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/a/6990817-anime-music-girl.jpg"))); // NOI18N
        jLabel13.setText("jLabel13");
        audio_panel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 1010, 580));

        jPanel5.add(audio_panel, "card3");

        paint_panel.setBackground(new java.awt.Color(153, 255, 153));
        paint_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Ravie", 0, 48)); // NOI18N
        jButton1.setText("Get Started");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        paint_panel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 590, 460, 70));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/a/Untitled copy.png"))); // NOI18N
        paint_panel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 700, 480));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/a/watercolor-paint-monotype-art-pattern-water-hd-wallpaper.jpg"))); // NOI18N
        paint_panel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 671));

        jPanel5.add(paint_panel, "card3");

        extra_panel.setBackground(new java.awt.Color(102, 102, 255));
        extra_panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        extra_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setText("IDM");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        extra_panel.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, 120, 30));

        jButton8.setText("WEBCAM");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        extra_panel.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 560, 130, 30));

        jButton9.setText("DETAILS");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        extra_panel.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 520, 120, 33));

        jButton10.setText("Video Player");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        extra_panel.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 560, 122, 30));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/a/construction-banner.png"))); // NOI18N
        extra_panel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1100, 670));

        jPanel5.add(extra_panel, "card3");

        jLabel1.setBackground(new java.awt.Color(255, 255, 51));
        jLabel1.setFont(new java.awt.Font("Ravie", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DRAG");
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel1)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        xMouse = evt.getX();
       yMouse = evt.getY();// TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseDragged

    private void gamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gamActionPerformed
        jPanel5.removeAll();
        jPanel5.repaint();
        jPanel5.revalidate();
        jPanel5.add(game_panel);
        jPanel5.repaint();
        jPanel5.revalidate();// TODO add your handling code here:
    }//GEN-LAST:event_gamActionPerformed

    private void appActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appActionPerformed
        jPanel5.removeAll();
        jPanel5.repaint();
        jPanel5.revalidate();
                // TODO add your handling code here:
        jPanel5.add(app_panel);
        jPanel5.repaint();
        jPanel5.revalidate();// TODO add your handling code here:
    }//GEN-LAST:event_appActionPerformed

    private void audioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_audioActionPerformed
       jPanel5.removeAll();
        jPanel5.repaint();
        jPanel5.revalidate();
                // TODO add your handling code here:
        jPanel5.add(audio_panel);
        jPanel5.repaint();
        jPanel5.revalidate(); // TODO add your handling code here:
    }//GEN-LAST:event_audioActionPerformed

    private void paiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paiActionPerformed
        jPanel5.removeAll();
        jPanel5.repaint();
        jPanel5.revalidate();
                // TODO add your handling code here:
        jPanel5.add(paint_panel);
        jPanel5.repaint();
        jPanel5.revalidate();// TODO add your handling code here:
    }//GEN-LAST:event_paiActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try{
            getfile();
            createfile();
        }catch(Exception ex){
            
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void extraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extraActionPerformed
       jPanel5.removeAll();
        jPanel5.repaint();
        jPanel5.revalidate();
                // TODO add your handling code here:
        jPanel5.add(extra_panel);
        jPanel5.repaint();
        jPanel5.revalidate(); // TODO add your handling code here:
    }//GEN-LAST:event_extraActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        MainGui n = new MainGui();
        setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       // FaceDetection f  = new FaceDetection();
        //setVisible(true);
        // TODO add your handling code here:*/
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        Detail d = new Detail();
        setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        /*Main m = new Main();
        setVisible(true);
        setVisible(false);          for the .java file which named as (Main.java) in the sign_ip.
        dispose();*/
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        paint_form p = new paint_form();
        p.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        Chetan_notepad n = new Chetan_notepad();
        n.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
       Calculator c = new Calculator();
        c.setVisible(true);
         // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        setVisible(false);
        dispose();
        login l = new login();
        l.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        Desktop desktop = Desktop.getDesktop();

        try {
            desktop.open(new File("C:\\Users\\hp 1\\Documents\\NetBeansProjects\\sign_ip\\src\\new\\bloody roar.exe"));
        } catch (IOException ex) {
            Logger.getLogger(work.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Desktop desktop = Desktop.getDesktop();

        try {
            desktop.open(new File("C:\\Users\\hp 1\\Documents\\NetBeansProjects\\sign_ip\\src\\new\\Tekken 3.exe"));
        } catch (IOException ex) {
            Logger.getLogger(work.class.getName()).log(Level.SEVERE, null, ex);
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Desktop desktop = Desktop.getDesktop();

        try {
            desktop.open(new File("C:\\Users\\hp 1\\Documents\\NetBeansProjects\\sign_ip\\src\\new\\My Puzzle\\ImagePuzzle\\puzzle.html"));
        } catch (IOException ex) {
            Logger.getLogger(work.class.getName()).log(Level.SEVERE, null, ex);
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Desktop desktop = Desktop.getDesktop();

        try {
            desktop.open(new File("C:\\Users\\hp 1\\Documents\\NetBeansProjects\\sign_ip\\src\\sign_ip\\jChess-1.5.jar"));
        } catch (IOException ex) {
            Logger.getLogger(work.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed
    private void DrawAll(){
            for(int i=0; i< linecontainer.size() ; i++){
                    g2.draw(linecontainer.get(i));
                            }
            for(int i=0; i< circlecontainer.size() ; i++){
                    g2.draw(circlecontainer.get(i));
                            }
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(work.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(work.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(work.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(work.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //music
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
            java.util.logging.Logger.getLogger(work.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(work.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(work.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(work.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
            //System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
            //launch(args);
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new work().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton app;
    private javax.swing.JPanel app_panel;
    private javax.swing.JButton audio;
    private javax.swing.JPanel audio_panel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel clock;
    private javax.swing.JButton extra;
    private javax.swing.JPanel extra_panel;
    private javax.swing.JButton gam;
    private javax.swing.JPanel game_panel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton pai;
    private javax.swing.JPanel paint_panel;
    // End of variables declaration//GEN-END:variables

    public File file;
    public Player player; 
    private void getfile() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        try{
        JFileChooser ch = new JFileChooser();
        ch.showOpenDialog(this);System.out.println("After Open Dialog !");
        file = ch.getSelectedFile();System.out.println("After getSelectedFile !");
        if(!file.exists()){
            throw new FileNotFoundException();
        }
    }catch(HeadlessException | FileNotFoundException e){
        JOptionPane.showMessageDialog(null, "Error in Get File .");
        JOptionPane.showMessageDialog(null, e);
    }
    }

    private void createfile() throws JavaLayerException {
    try{
        System.out.println("Before Create player !");
        
        //Getting Error In this statement to the URL.
        player = Manager.createRealizedPlayer(file.toURL());
        
        
        System.out.println("After URL !");
        player.addControllerListener(this); System.out.println("After This !");
        player.start(); System.out.println("After Start !");
        player.realize();System.out.println("After realize !");
       }catch(IOException | CannotRealizeException | NoPlayerException ex){
        JOptionPane.showMessageDialog(null, "Error in Create File .");
        JOptionPane.showMessageDialog(null, ex);
    }
    }
    
/*video player.
    public void start(Stage primaryStage) {
   // String workingDir = System.getProperty("user.dir");
    final File f = new File("D:\\a.mp4");
    
    final Media m = new Media(f.toURI().toString());
    final MediaPlayer mp = new MediaPlayer(m);
    final MediaView mv = new MediaView(mp);
    
    final DoubleProperty width = mv.fitWidthProperty();
    final DoubleProperty height = mv.fitHeightProperty();
    
    width.bind(Bindings.selectDouble(mv.sceneProperty(), "width"));
    height.bind(Bindings.selectDouble(mv.sceneProperty(), "height"));
    
    mv.setPreserveRatio(true);
    
    StackPane root = new StackPane();
    root.getChildren().add(mv);
    
    final Scene scene = new Scene(root, 960, 540);
    scene.setFill(Color.BLACK);
    
    primaryStage.setScene(scene);
    primaryStage.setTitle("Full Screen Video Player : International");
    primaryStage.setFullScreen(true);
    primaryStage.show();
    
    mp.play();
  }//player ends.*/
}
