/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Controller.services;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import Models.*;
import java.awt.Color;

public class PanelWelcome extends javax.swing.JPanel {
    private String id_sach = services.books.get(0).getID();
    protected DefaultTableModel tableHienCo, tableBanHet;
    public PanelWelcome() {
        initComponents();
        //Lock jTextField
        txtID.setEditable(false);
        txtTacGia.setEditable(false);
        txtTen.setEditable(false);
        txtTheLoai.setEditable(false);
        //Set role
        String role = services.user.getChucvu();
        labelWelcome.setText("Xin chào, "+services.user.getTen()+" ( "+role+" )");
        this.tableHienCo = (DefaultTableModel) tablesachHienCo.getModel();
        this.tableBanHet = (DefaultTableModel) tablesachBanChayNhat.getModel();
        this.loadBook();
        //this.setInfoBook(services.books.get(0).getID());
    }
    
    public void loadBook()
    {
        int limit = 1;
        services.cnn.loadBook();
        for(Model_Sach sach : services.books)
        {
            if(limit == 50)
            {
                limit = 1;
                break;
            }
            if(sach.getSoLuong()==0)
            {
                //services.msg("Add sach het hang "+sach.getTen());
                tableBanHet.addRow(sach.getObject());
                limit++;
            }
        }
       try{
           String sql = "SELECT * FROM `khosach` WHERE 1 ORDER BY `luotmua` DESC LIMIT 50";
           ResultSet rs = services.cnn.con.createStatement().executeQuery(sql);
           while(rs.next())
           {
               Model_Sach tmp = new Model_Sach(rs);
               tableHienCo.addRow(tmp.getObject());
           }
       }
       catch(Exception e)
       {
           
       }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelWelcome = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablesachHienCo = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablesachBanChayNhat = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        imageBook = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTacGia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTheLoai = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtThanhTien = new javax.swing.JLabel();
        txtTinhTrang = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1420, 748));

        labelWelcome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelWelcome.setText("Xin chào, <User Code> (<User Role>)");

        tablesachHienCo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tablesachHienCo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tên", "Tác giả", "Thể loại", "Giá"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablesachHienCo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablesachHienCo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablesachHienCoMouseClicked(evt);
            }
        });
        tablesachHienCo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablesachHienCoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablesachHienCoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tablesachHienCo);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Sách bán chạy");

        tablesachBanChayNhat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tablesachBanChayNhat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tên", "Tác giả", "Thể loại", "Giá"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablesachBanChayNhat.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablesachBanChayNhat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablesachBanChayNhatMouseClicked(evt);
            }
        });
        tablesachBanChayNhat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablesachBanChayNhatKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablesachBanChayNhatKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tablesachBanChayNhat);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Sách bán hết");

        imageBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/demo.jpg"))); // NOI18N
        imageBook.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Thông tin sách");

        txtID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtID.setBorder(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("ID");

        txtTen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTen.setBorder(null);

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

        txtTinhTrang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTinhTrang.setText("Tình trạng  : ");

        btnView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/button_view.png"))); // NOI18N
        btnView.setBorderPainted(false);
        btnView.setContentAreaFilled(false);
        btnView.setFocusable(false);
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                    .addComponent(txtTen, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                                    .addComponent(txtTacGia)
                                    .addComponent(txtTheLoai)))
                            .addComponent(txtThanhTien)
                            .addComponent(txtTinhTrang)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelWelcome)
                        .addGap(0, 945, Short.MAX_VALUE)))
                .addGap(59, 59, 59))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(labelWelcome)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(imageBook)
                                .addContainerGap())
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
                                .addComponent(txtTinhTrang)
                                .addGap(194, 194, 194))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(110, 110, 110))))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void setInfoBook(String id)
    {
        for(Model_Sach sach: services.books)
        {
            if(sach.getID().compareTo(id)==0)
            {
                try{
                    txtID.setText(sach.getID());
                    txtTacGia.setText(services.cnn.getRowInDB("user", "user_id", sach.getIdTacGia()).getString("Ten"));
                    txtTen.setText(sach.getTen());
                    txtTheLoai.setText(services.cnn.getRowInDB("danhmuc", "id", sach.getTheLoai().trim()).getString("ten"));
                    txtThanhTien.setText("Thành tiền : "+sach.getGia()+" đ");
                    services.setImgLabel(imageBook, services.getUrlImageBook(sach.getImage()), 150, 200);
                    
                    if(sach.getSoLuong()>0)
                    {
                        btnView.setEnabled(true);
                        txtTinhTrang.setText("Tình trạng : Còn hàng");
                        txtTinhTrang.setForeground(Color.green);
                        //services.setImgButton(btnView, "http://"+services.server+services.path_comp+"button_buy.png");
                        
                    }
                    else
                    {
                        txtTinhTrang.setText("Tình trạng : Cháy hàng");
                        txtTinhTrang.setForeground(Color.red);
                        //services.setImgButton(btnView, "http://"+services.server+services.path_comp+"button_buy_disable.png");
                    }
                }
                catch(Exception e)
                {
                    services.msgbox("Error","Không thể lấy thông tin sách");
                    services.msg(e);
                }
                break;
            }
        }
    }
    private void tablesachHienCoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablesachHienCoMouseClicked
        // TODO add your handling code here:
        tablesachBanChayNhat.clearSelection();
        int column = tablesachHienCo.columnAtPoint(evt.getPoint());
        int row = tablesachHienCo.rowAtPoint(evt.getPoint());
        String id_sach = (String)tablesachHienCo.getValueAt(row, 0);
        this.id_sach = id_sach;
        this.setInfoBook(id_sach);
    }//GEN-LAST:event_tablesachHienCoMouseClicked

    private void tablesachBanChayNhatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablesachBanChayNhatMouseClicked
        // TODO add your handling code here:
        tablesachHienCo.clearSelection();
        int column = tablesachBanChayNhat.columnAtPoint(evt.getPoint());
        int row = tablesachBanChayNhat.rowAtPoint(evt.getPoint());
        String id_sach = (String)tablesachBanChayNhat.getValueAt(row, 0);
        this.id_sach = id_sach;
        this.setInfoBook(id_sach);
    }//GEN-LAST:event_tablesachBanChayNhatMouseClicked

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        if(txtID.getText().compareTo("")==0) return;
        Model_Sach tmp = new Model_Sach();
        for(Model_Sach book: services.books)
        {
            if(book.getID().compareTo(this.id_sach)==0)
            {
                tmp = book;
                break;
            }
        }
        services.disposeParent(this, new PanelBook(tmp));
    }//GEN-LAST:event_btnViewActionPerformed

    private void tablesachHienCoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablesachHienCoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tablesachHienCoKeyPressed

    private void tablesachBanChayNhatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablesachBanChayNhatKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tablesachBanChayNhatKeyPressed

    private void tablesachHienCoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablesachHienCoKeyReleased
        // TODO add your handling code here:
        int row = tablesachHienCo.getSelectedRow();
        String id_sach = (String)tablesachHienCo.getValueAt(row, 0);
        this.id_sach = id_sach;
        this.setInfoBook(id_sach);
    }//GEN-LAST:event_tablesachHienCoKeyReleased

    private void tablesachBanChayNhatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablesachBanChayNhatKeyReleased
        // TODO add your handling code here:
        int row = tablesachBanChayNhat.getSelectedRow();
        String id_sach = (String)tablesachBanChayNhat.getValueAt(row, 0);
        this.id_sach = id_sach;
        this.setInfoBook(id_sach);
    }//GEN-LAST:event_tablesachBanChayNhatKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnView;
    private javax.swing.JLabel imageBook;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelWelcome;
    private javax.swing.JTable tablesachBanChayNhat;
    private javax.swing.JTable tablesachHienCo;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtTacGia;
    private javax.swing.JTextField txtTen;
    private javax.swing.JLabel txtThanhTien;
    private javax.swing.JTextField txtTheLoai;
    private javax.swing.JLabel txtTinhTrang;
    // End of variables declaration//GEN-END:variables
}
