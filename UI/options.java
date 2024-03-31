/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author alien
 */
public class options extends javax.swing.JFrame {

    /**
     * Creates new form options
     * 
     */
    
   
    public options() {
        initComponents();
        // Use latitude and longitude to perform any necessary operations in this frame
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        currentweatherbtn = new javax.swing.JButton();
        fivedaysforecastbtn = new javax.swing.JButton();
        airpollutionbtn = new javax.swing.JButton();
        sunsetandsunrisebtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setFocusable(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        currentweatherbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        currentweatherbtn.setText("Check Current Weather ");
        currentweatherbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentweatherbtnActionPerformed(evt);
            }
        });
        jPanel1.add(currentweatherbtn);
        currentweatherbtn.setBounds(62, 118, 267, 77);

        fivedaysforecastbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        fivedaysforecastbtn.setText("view 5 days Forecast ");
        fivedaysforecastbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fivedaysforecastbtnActionPerformed(evt);
            }
        });
        jPanel1.add(fivedaysforecastbtn);
        fivedaysforecastbtn.setBounds(62, 307, 267, 77);

        airpollutionbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        airpollutionbtn.setText("Air Pollution");
        airpollutionbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airpollutionbtnActionPerformed(evt);
            }
        });
        jPanel1.add(airpollutionbtn);
        airpollutionbtn.setBounds(423, 118, 294, 77);

        sunsetandsunrisebtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sunsetandsunrisebtn.setText("View Sunset and SunRise Time ");
        sunsetandsunrisebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sunsetandsunrisebtnActionPerformed(evt);
            }
        });
        jPanel1.add(sunsetandsunrisebtn);
        sunsetandsunrisebtn.setBounds(423, 307, 294, 77);

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jButton1.setText("Notifications ");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(51, 204, 255), new java.awt.Color(153, 204, 255), new java.awt.Color(153, 204, 255)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(680, 20, 90, 30);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Back");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 204), new java.awt.Color(0, 204, 204)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(40, 440, 50, 24);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/little rain.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void currentweatherbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentweatherbtnActionPerformed
        CurrentWeather currentWeatherForm;
        try {
            currentWeatherForm = new CurrentWeather();
            currentWeatherForm.setVisible(true);
            currentWeatherForm.setLocationRelativeTo(null);
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_currentweatherbtnActionPerformed

    private void airpollutionbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airpollutionbtnActionPerformed
        try {
            // TODO add your handling code here:
            Airpollution airpollutionForm = new Airpollution();
            
            // Set the visibility of the Airpollution form to true
            airpollutionForm.setVisible(true);
            
            // Center the Airpollution form on the screen
            airpollutionForm.setLocationRelativeTo(null);
        } catch (IOException ex) {
            Logger.getLogger(options.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_airpollutionbtnActionPerformed

    private void fivedaysforecastbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fivedaysforecastbtnActionPerformed
        // TODO add your handling code here:
        fivedaysforecast forecastForm = new fivedaysforecast();
    
    // Set the visibility of the fivedaysforecast form to true
    forecastForm.setVisible(true);
    
    // Center the fivedaysforecast form on the screen
    forecastForm.setLocationRelativeTo(null);
    }//GEN-LAST:event_fivedaysforecastbtnActionPerformed

    private void sunsetandsunrisebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sunsetandsunrisebtnActionPerformed
        // TODO add your handling code here:
        suntimings timingsForm = new suntimings();
    
    // Set the visibility of the suntimings form to true
    timingsForm.setVisible(true);
    
    // Center the suntimings form on the screen
    timingsForm.setLocationRelativeTo(null);
    }//GEN-LAST:event_sunsetandsunrisebtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        weathernotification weatherNotificationForm = new weathernotification("Weather Notification Text", "Air Quality Notification Text");
    weatherNotificationForm.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    
    // Reopen the previous form (UIstart form)
    UIstart uiStartForm = new UIstart();
    uiStartForm.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new options().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton airpollutionbtn;
    private javax.swing.JButton currentweatherbtn;
    private javax.swing.JButton fivedaysforecastbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton sunsetandsunrisebtn;
    // End of variables declaration//GEN-END:variables
}