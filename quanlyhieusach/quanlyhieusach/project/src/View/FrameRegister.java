/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.services;
import Controller.Message;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.io.File;
import java.sql.Statement;
import java.sql.ResultSet;

public class FrameRegister extends javax.swing.JFrame {
    private String key;
    private int num_try = 0;
    /**
     * Creates new form FrameRegister
     */
    public FrameRegister(String ch) {
        initComponents();
        if(!services.cnn.isConnect)
        {
            services.cnn.connect();
        }
        this.key = ch;
        captcha.setText("");
        captcha.repaint();
        captcha.setIcon(null);
        ImageIcon icon = new ImageIcon("src/captcha/"+ch+".png");
        captcha.setIcon(icon);
        File obj = new File("src/captcha/"+ch+".png");
        obj.delete();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        captcha = new javax.swing.JLabel();
        txtCaptcha = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnRenew = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        txtRetype = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Register");
        setAlwaysOnTop(true);

        captcha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        captcha.setMaximumSize(new java.awt.Dimension(280, 90));
        captcha.setMinimumSize(new java.awt.Dimension(280, 90));
        captcha.setPreferredSize(new java.awt.Dimension(280, 90));

        txtCaptcha.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Nhập kí tự bạn thấy");

        btnRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/button_ok.png"))); // NOI18N
        btnRegister.setBorder(null);
        btnRegister.setBorderPainted(false);
        btnRegister.setContentAreaFilled(false);
        btnRegister.setFocusable(false);
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Username");

        txtUsername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Đăng kí tài khoản");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Password");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Re-type");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Tên người dùng");

        txtName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnRenew.setText("Đổi captcha");
        btnRenew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRenewActionPerformed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtRetype.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(captcha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRenew)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                                .addComponent(btnRegister)
                                .addGap(72, 72, 72))
                            .addComponent(txtCaptcha, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(49, 49, 49)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                                    .addComponent(txtPassword)
                                    .addComponent(txtRetype))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegister))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3)
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(txtRetype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(captcha, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCaptcha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnRenew)))))
                .addGap(48, 48, 48))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void getCaptcha(boolean number)
    {
        this.key = services.getRandomCaptcha(number);
        captcha.setIcon(null);
        ImageIcon icon = new ImageIcon("src/captcha/"+this.key+".png");
        captcha.setIcon(icon);
        File obj = new File("src/captcha/"+this.key+".png");
        obj.delete();
    }
    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        if(txtUsername.getText().compareTo("")==0||String.valueOf(txtPassword.getPassword()).compareTo("")==0||String.valueOf(txtRetype.getPassword()).compareTo("")==0||txtCaptcha.getText().compareTo("")==0)
        {
            services.msgbox("Thông báo", Message.missingInput);
            return;
        }
        if(num_try>=10)
        {
            services.msgbox("Thông báo",Message.tooManyTryAgain);
            return;
        }
        if(txtCaptcha.getText().compareTo(this.key)!=0)
        {
            services.msgbox("Thông báo",Message.incorrectCaptcha);
            btnRenewActionPerformed(evt);
            this.num_try += 1;
            return;
        }
        if(String.valueOf(txtPassword.getPassword()).compareTo(String.valueOf(txtRetype.getPassword()))!=0)
        {
            services.msgbox("Thông báo", Message.differentPass);
            return;
        }
        if(txtUsername.getText().contains(" ")||String.valueOf(txtPassword.getPassword()).contains(" "))
        {
            services.msgbox("Thông báo", Message.containSpace);
            return;
        }
        
        try{
            String sql_check = "SELECT * FROM `login` WHERE username='"+txtUsername.getText().trim()+"' LIMIT 1";
            Statement stmt = services.cnn.con.createStatement();
            ResultSet rs = stmt.executeQuery(sql_check);
            if(rs.next())
            {
                services.msgbox("Thông báo", Message.accountExist);
                return;
            }
            String last_id ;
            rs = stmt.executeQuery("SELECT * FROM `login` ORDER BY `user_id` DESC LIMIT 1");
            if(rs.next())
            {
                int id = Integer.parseInt(rs.getString("user_id"))+1;
                if(id<10)
                {
                    last_id = "00"+id;
                }
                else if(id<100){
                    last_id = "0"+id;
                }
                else last_id = ""+id;
            }
            else
            {
                last_id = "001";
            }
            stmt.execute("INSERT INTO `login`(`username`,`password`,`user_id`) VALUES('"+txtUsername.getText()+"','"+String.valueOf(txtPassword.getPassword())+"','"+last_id+"')"); 
            stmt.execute("INSERT INTO `user`(`user_id`, `Ten`, `Gioi tinh`, `Ngay sinh`, `Dia chi`, `Sdt`, `CMND`, `avatar`, `chucvu`, `so_du`) "
                    + "VALUES ('"+last_id+"','"+txtName.getText()+"','Nam','2003-01-01','','','','avatar.png','Customer','100000')");
            stmt.execute("INSERT INTO `inventory`(`user_id`) VALUES('"+last_id+"')");
            services.msgbox("Thông báo",Message.registerSuccess);
        }
        catch(Exception e)
        {
            services.msgbox("Thông báo", Message.errorRegister);
            services.msg(e);
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnRenewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRenewActionPerformed
        // TODO add your handling code here:
        if(this.num_try >= 5)
            this.getCaptcha(true);
        else this.getCaptcha(false);
    }//GEN-LAST:event_btnRenewActionPerformed

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
            java.util.logging.Logger.getLogger(FrameRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameRegister("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnRenew;
    private javax.swing.JLabel captcha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtCaptcha;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtRetype;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}