/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Mahe
 */


class MyClass implements ActionListener {
    
    String date;
    String time;
    int id;
    int doc_id; 
    String type;
    
    MyClass(int id,int doc_id,String date,String time,String type) {
 
        this.date=date;
        this.time=time;
        this.id=id;
        this.doc_id=doc_id;
        this.type=type;
    }
    
    public void actionPerformed(ActionEvent e) {
        String[] args={Integer.toString(id),Integer.toString(doc_id),date,time,type};
        confirm.main(args);    
    }
}

public class time_slot extends javax.swing.JFrame {

    /**
     * Creates new form time_slot
     */
    
    public static int doc_id;
    public static Connection conn;
    public static int id; 
    public static String date;
    public static String name;
    public static String city;
    public static String practise;
    public static String type;
    
    public time_slot() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        jButton1.setText(dateFormat.format(date));

        Calendar c = Calendar.getInstance(); 
        c.setTime(date); 
        c.add(Calendar.DATE, 1);
        date = c.getTime();      
        jButton2.setText(dateFormat.format(date));

        c.setTime(date); 
        c.add(Calendar.DATE, 2);
        date = c.getTime();
        jButton3.setText(dateFormat.format(date));  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Select a time slot to book an appointment");

        jLabel8.setText("Morning");

        jLabel9.setText("Afternoon");

        jLabel10.setText("Evening");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jButton4.setText("Main Page");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(jButton1)
                        .addGap(94, 94, 94)
                        .addComponent(jButton2)
                        .addGap(111, 111, 111)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(280, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(402, 402, 402))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton5))
                        .addGap(167, 167, 167)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton1))
                        .addGap(69, 69, 69)
                        .addComponent(jLabel8)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jPanel1.removeAll();
        jPanel1.updateUI();
        jPanel2.removeAll();
        jPanel2.updateUI();
        jPanel3.removeAll();
        jPanel3.updateUI();
        date=jButton1.getText();
        try {
           Statement st=conn.createStatement();
           ResultSet rs;
           if(type=="Doctor") {
               rs=st.executeQuery("select * from doctors where id="+doc_id);
           } else {
               rs=st.executeQuery("select * from lab_test where id="+doc_id);
           }
           rs.next();
           String[] timings=rs.getString("timings").split(",");
           int length=timings.length;
           for(int i=0;i<length;i++) {
               if(type=="Doctor") {
                    rs=st.executeQuery("select * from appointments where app_date='"+date+"' and app_time='"+timings[i]+"';");
               } else {
                    rs=st.executeQuery("select * from lab_appointments where app_date='"+date+"' and app_time='"+timings[i]+"';");
               }
               if(!rs.next()) {
                   if(Integer.parseInt(timings[i])<1200) {
                       JButton bt=new JButton(timings[i]);
                       bt.setSize(60,30);
                       bt.addActionListener(new MyClass(id,doc_id,time_slot.date,bt.getText(),type));
                       jPanel1.add(bt);

                   } else if(Integer.parseInt(timings[i])>=1200 && Integer.parseInt(timings[i])<1600) {
                       JButton bt=new JButton(timings[i]);
                       bt.setSize(60,30);
                       jPanel2.add(bt);
                       bt.addActionListener(new MyClass(id,doc_id,time_slot.date,bt.getText(),type));
                   }
                   else {
                       JButton bt=new JButton(timings[i]);
                       bt.setSize(60,30);
                       jPanel3.add(bt);
                       bt.addActionListener(new MyClass(id,doc_id,time_slot.date,bt.getText(),type));
                   }
               }
           }
       } catch(Exception e) {} 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jPanel1.removeAll();
        jPanel1.updateUI();
        jPanel2.removeAll();
        jPanel2.updateUI();
        jPanel3.removeAll();
        jPanel3.updateUI();
        date=jButton2.getText();
        try {
           Statement st=conn.createStatement();
           ResultSet rs;
           if(type=="Doctor") {
               rs=st.executeQuery("select * from doctors where id="+doc_id);
           } else {
               rs=st.executeQuery("select * from lab_test where id="+doc_id);
           }
           rs.next();
           String[] timings=rs.getString("timings").split(",");
           int length=timings.length;
           for(int i=0;i<length;i++) {
                if(type=="Doctor") {
                    rs=st.executeQuery("select * from appointments where app_date='"+date+"' and app_time='"+timings[i]+"';");
               } else {
                    rs=st.executeQuery("select * from lab_appointments where app_date='"+date+"' and app_time='"+timings[i]+"';");
               }
                if(!rs.next()) {
                   if(Integer.parseInt(timings[i])<1200) {
                       JButton bt=new JButton(timings[i]);
                       bt.setSize(60,30);
                       jPanel1.add(bt);
                       bt.addActionListener(new MyClass(id,doc_id,time_slot.date,bt.getText(),type));

                   } else if(Integer.parseInt(timings[i])>=1200 && Integer.parseInt(timings[i])<1600) {
                       JButton bt=new JButton(timings[i]);
                       bt.setSize(60,30);
                       jPanel2.add(bt);
                       bt.addActionListener(new MyClass(id,doc_id,time_slot.date,bt.getText(),type));
                   }
                   else {
                       JButton bt=new JButton(timings[i]);
                       bt.setSize(60,30);
                       jPanel3.add(bt);
                       bt.addActionListener(new MyClass(id,doc_id,time_slot.date,bt.getText(),type));
                   }
               }
           }
       } catch(Exception e) {} 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jPanel1.removeAll();
        jPanel1.updateUI();
        jPanel2.removeAll();
        jPanel2.updateUI();
        jPanel3.removeAll();
        jPanel3.updateUI();
        date=jButton1.getText();
        try {
           Statement st=conn.createStatement();
           ResultSet rs;
           if(type=="Doctor") {
               rs=st.executeQuery("select * from doctors where id="+doc_id);
           } else {
               rs=st.executeQuery("select * from lab_test where id="+doc_id);
           }
           rs.next();
           String[] timings=rs.getString("timings").split(",");
           int length=timings.length;
           for(int i=0;i<length;i++) {
              if(type=="Doctor") {
                    rs=st.executeQuery("select * from appointments where app_date='"+date+"' and app_time='"+timings[i]+"';");
               } else {
                    rs=st.executeQuery("select * from lab_appointments where app_date='"+date+"' and app_time='"+timings[i]+"';");
               }
               if(!rs.next()) {
                   if(Integer.parseInt(timings[i])<1200) {
                       JButton bt=new JButton(timings[i]);
                       bt.setSize(60,30);
                       jPanel1.add(bt);
                       bt.addActionListener(new MyClass(id,doc_id,time_slot.date,bt.getText(),type));

                   } else if(Integer.parseInt(timings[i])>=1200 && Integer.parseInt(timings[i])<1600) {
                       JButton bt=new JButton(timings[i]);
                       bt.setSize(60,30);
                       jPanel2.add(bt);
                       bt.addActionListener(new MyClass(id,doc_id,time_slot.date,bt.getText(),type));
                   }
                   else {
                       JButton bt=new JButton(timings[i]);
                       bt.setSize(60,30);
                       jPanel3.add(bt);
                       bt.addActionListener(new MyClass(id,doc_id,time_slot.date,bt.getText(),type));
                   }
               }
           }
       } catch(Exception e) {} 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if(type=="Doctor") {
            String[] args={Integer.toString(id),name,city,practise};
            doctor.main(args);
            this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        }
        else {
            String[] args={Integer.toString(id),name};
            lab_test.main(args);
            this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String[] args={Integer.toString(id),name};
        main_page.main(args);
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_jButton4ActionPerformed
    
                           
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(time_slot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(time_slot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(time_slot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(time_slot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        doc_id=Integer.parseInt(args[0]);
        id=Integer.parseInt(args[1]);
        name=args[2];
        city=args[3];
        practise=args[4];
        type=args[5];
        
        String url = "jdbc:mysql://localhost:3306/";
        String dbName="signup"; 
        String driver = "com.mysql.jdbc.Driver";
        String usrNm="root";
        String pswd="mysql@123";
        try {
                Class.forName(driver).newInstance();
                conn = DriverManager.getConnection(url+dbName,usrNm,pswd);
        } catch(Exception e) {}


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new time_slot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}