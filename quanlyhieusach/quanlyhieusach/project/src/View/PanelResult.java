/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Models.*;
import Controller.*;
import java.awt.Color;
import java.util.ArrayList;

public class PanelResult extends javax.swing.JPanel {
    private  ArrayList<Model_Sach> list;
    private int index = 0;
    /**
     * Creates new form PanelResult
     */
    public PanelResult() {
        initComponents();
    }
    public PanelResult(ArrayList<Model_Sach> results)
    {
        initComponents();
        beforeLoad();
        this.list = results;
        labelNumberOfResult.setText("Có "+results.size()+" kết quả thoả mãn");
        loadIndex();
    }
    public void beforeLoad()
    {
        txtID.setEditable(false);
        txtTen.setEditable(false);
        txtTacGia.setEditable(false);
        txtTheLoai.setEditable(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void loadIndex()
    {
        services.setImgLabel(imageBook, services.getUrlImageBook(this.list.get(index).getImage()), 150,200);
        services.setImgLabel(imageItem, services.getUrlImageBook(this.list.get(index).getImage()), 150,200);
        txtID.setText(this.list.get(index).getID());
        txtTen.setText(this.list.get(index).getTen());
        txtThanhTien.setText("Thành tiền : "+this.list.get(index).getGia());
        txtTinhTrang.setText("Tình trạng  : "+(this.list.get(index).getSoLuong()>0?"Còn hàng":"Cháy hàng"));
        if(this.list.get(index).getSoLuong()<=0) txtTinhTrang.setForeground(Color.red);
        else txtTinhTrang.setForeground(Color.GREEN);
        try{
             txtTacGia.setText(services.cnn.getRowInDB("user","user_id", this.list.get(index).getIdTacGia()).getString("Ten"));
             txtTheLoai.setText(services.cnn.getRowInDB("danhmuc", "id", this.list.get(index).getTheLoai()).getString("ten"));
        }
        catch(Exception e)
        {
            services.msg("Exception : PanelResult.java, method loadIndex()");
        }
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        imageItem = new javax.swing.JLabel();
        btnUp = new javax.swing.JButton();
        btnDown = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnReturn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtTacGia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTheLoai = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtThanhTien = new javax.swing.JLabel();
        imageBook = new javax.swing.JLabel();
        txtTinhTrang = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        labelNumberOfResult = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1420, 748));
        setPreferredSize(new java.awt.Dimension(1420, 748));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        imageItem.setText("\n");
        imageItem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        imageItem.setMaximumSize(new java.awt.Dimension(2000, 2000));
        imageItem.setMinimumSize(new java.awt.Dimension(150, 200));
        imageItem.setPreferredSize(new java.awt.Dimension(150, 200));

        btnUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/button_up.png"))); // NOI18N
        btnUp.setBorder(null);
        btnUp.setBorderPainted(false);
        btnUp.setContentAreaFilled(false);
        btnUp.setFocusPainted(false);
        btnUp.setFocusable(false);
        btnUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnUpMousePressed(evt);
            }
        });

        btnDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/button_down.png"))); // NOI18N
        btnDown.setBorder(null);
        btnDown.setBorderPainted(false);
        btnDown.setContentAreaFilled(false);
        btnDown.setFocusPainted(false);
        btnDown.setFocusable(false);
        btnDown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDownMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(btnUp))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(btnDown)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 132, Short.MAX_VALUE)
                .addComponent(imageItem, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnUp)
                .addGap(142, 142, 142)
                .addComponent(imageItem, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                .addComponent(btnDown)
                .addGap(30, 30, 30))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Kết quả tìm kiếm");

        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/button_return.png"))); // NOI18N
        btnReturn.setText("Quay lại ");
        btnReturn.setBorder(null);
        btnReturn.setBorderPainted(false);
        btnReturn.setContentAreaFilled(false);
        btnReturn.setDefaultCapable(false);
        btnReturn.setFocusable(false);
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Tên");

        txtTacGia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTacGia.setBorder(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Tác giả");

        txtTheLoai.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTheLoai.setBorder(null);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Thể loại");

        txtThanhTien.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtThanhTien.setText("Thành tiền : ");

        imageBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/demo.jpg"))); // NOI18N
        imageBook.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtTinhTrang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTinhTrang.setText("Tình trạng  : ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Thông tin sách");

        btnView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/button_view.png"))); // NOI18N
        btnView.setBorderPainted(false);
        btnView.setContentAreaFilled(false);
        btnView.setFocusable(false);
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        txtID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtID.setBorder(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("ID");

        txtTen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTen.setBorder(null);

        labelNumberOfResult.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        labelNumberOfResult.setText("Có 0 kết quả thoả mãn");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnReturn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(358, 358, 358)
                                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(imageBook, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6))
                                        .addGap(33, 33, 33)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtID)
                                            .addComponent(txtTen)
                                            .addComponent(txtTacGia)
                                            .addComponent(txtTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txtThanhTien)
                                    .addComponent(txtTinhTrang)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(labelNumberOfResult)))))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelNumberOfResult)
                .addGap(83, 83, 83)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imageBook, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(txtThanhTien)
                        .addGap(18, 18, 18)
                        .addComponent(txtTinhTrang)))
                .addGap(37, 37, 37)
                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnReturn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        if(txtID.getText().compareTo("")==0) return;
        Model_Sach tmp = services.getBookByID(txtID.getText().trim());
        if(tmp == null)
        {
            services.msgbox("Error",Message.errorGetBook);
            return;
        }
        services.disposeParent(this, new PanelBook(tmp));
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        // TODO add your handling code here:
        services.changePanel(this, new PanelLibrary(), 1420, 748);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnUpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpMousePressed
        // TODO add your handling code here:
        if(this.index==0)
        {
            this.index = this.list.size()-1;
        }
        else
        {
            this.index -=1;
        }
        loadIndex();
    }//GEN-LAST:event_btnUpMousePressed

    private void btnDownMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDownMousePressed
        if(this.index==this.list.size()-1)
        {
            this.index = 0;
        }
        else
        {
            this.index +=1;
        }
        loadIndex();
    }//GEN-LAST:event_btnDownMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDown;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnUp;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel imageBook;
    private javax.swing.JLabel imageItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelNumberOfResult;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtTacGia;
    private javax.swing.JTextField txtTen;
    private javax.swing.JLabel txtThanhTien;
    private javax.swing.JTextField txtTheLoai;
    private javax.swing.JLabel txtTinhTrang;
    // End of variables declaration//GEN-END:variables
}
