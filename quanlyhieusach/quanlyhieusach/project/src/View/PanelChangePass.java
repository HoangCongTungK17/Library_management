/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.services;
import java.sql.Statement;

public class PanelChangePass extends javax.swing.JPanel {

    /**
     * Creates new form ChangePass
     */
    public PanelChangePass() {
        initComponents();
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
        txtboxPwdOld = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        txtboxPwdNew = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        txtboxRepeat = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        btnChangePass = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1420, 748));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Đổi mật khẩu");

        txtboxPwdOld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtboxPwdOld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtboxPwdOldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Mật khẩu cũ");

        txtboxPwdNew.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Mật khẩu mới");

        txtboxRepeat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Nhập lại mật khẩu");

        btnChangePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/confirm_btn.png"))); // NOI18N
        btnChangePass.setBorderPainted(false);
        btnChangePass.setContentAreaFilled(false);
        btnChangePass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangePassMouseClicked(evt);
            }
        });
        btnChangePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(509, 509, 509)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtboxPwdNew)
                            .addComponent(txtboxPwdOld)
                            .addComponent(txtboxRepeat, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btnChangePass, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(537, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtboxPwdOld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtboxPwdNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtboxRepeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(40, 40, 40)
                .addComponent(btnChangePass, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(262, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtboxPwdOldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtboxPwdOldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtboxPwdOldActionPerformed

    private void btnChangePassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChangePassMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_btnChangePassMouseClicked

    private void btnChangePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePassActionPerformed
        // TODO add your handling code here:
        if(services.account.getUsername().compareTo("guest")==0)
        {
            services.msgbox("Thông báo từ admin","Tài khoản (Khách) chỉ cho phép xem thông tin");
            return;
        }
        String password = String.valueOf(txtboxPwdOld.getPassword());
        String passwordnew = String.valueOf(txtboxPwdNew.getPassword());
        String repeat = String.valueOf(txtboxRepeat.getPassword());
        if(password.compareTo(services.account.getPassword())!=0)
        {
            services.msgbox("Thay đổi mật khẩu", "Mật khẩu cũ không chính xác");
            return ;
        }
        if(repeat.compareTo(passwordnew)!=0)
        {
            services.msgbox("Thay đổi mật khẩu","Vui lòng nhập mật khẩu mới và nhập lại chính xác");
            return;
        }
        services.user.changepassword(password, passwordnew);
        
    }//GEN-LAST:event_btnChangePassActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangePass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtboxPwdNew;
    private javax.swing.JPasswordField txtboxPwdOld;
    private javax.swing.JPasswordField txtboxRepeat;
    // End of variables declaration//GEN-END:variables
}
