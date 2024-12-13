/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import java.util.ArrayList;
import Models.*;
import Controller.*;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class PanelShelfBook extends javax.swing.JPanel {
    private ArrayList<Model_Sach> list_book = new ArrayList<Model_Sach>();
    private int start = 0;
    private JLabel[] list_label ;
    private String id[] = {"","","","",""};
    /**
     * Creates new form PanelShelfBook
     */
    public PanelShelfBook() {
        initComponents();
        
    }
    public PanelShelfBook(ArrayList<Model_Sach> list)
    {
        initComponents();
        this.list_book = list;
        this.list_label = new JLabel[]{book1, book2, book3, book4, book5};
        setBook(start);
    }
    private void setBook(int start)
    {
        int count = 0;
        int index = start;
        while(count<5)
        {
            if(index == this.list_book.size())
            {
                index = 0;
            }
            services.setImgLabel(this.list_label[count], services.getUrlImageBook(list_book.get(index).getImage()), 150,200);
            this.id[count] = list_book.get(index).getID();
            count+=1;
            index ++;
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

        btnRight = new javax.swing.JButton();
        btnLeft = new javax.swing.JButton();
        book1 = new javax.swing.JLabel();
        book2 = new javax.swing.JLabel();
        book3 = new javax.swing.JLabel();
        book4 = new javax.swing.JLabel();
        book5 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1237, 225));
        setPreferredSize(new java.awt.Dimension(1237, 225));

        btnRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/arrow-left.jpg"))); // NOI18N
        btnRight.setBorder(null);
        btnRight.setBorderPainted(false);
        btnRight.setContentAreaFilled(false);
        btnRight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRightMousePressed(evt);
            }
        });

        btnLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/arrow-right.png"))); // NOI18N
        btnLeft.setBorder(null);
        btnLeft.setBorderPainted(false);
        btnLeft.setContentAreaFilled(false);
        btnLeft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLeftMousePressed(evt);
            }
        });

        book1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        book1.setMaximumSize(new java.awt.Dimension(2000, 2000));
        book1.setMinimumSize(new java.awt.Dimension(150, 200));
        book1.setPreferredSize(new java.awt.Dimension(150, 200));
        book1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                book1MousePressed(evt);
            }
        });

        book2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        book2.setMaximumSize(new java.awt.Dimension(2000, 2000));
        book2.setMinimumSize(new java.awt.Dimension(150, 200));
        book2.setPreferredSize(new java.awt.Dimension(150, 200));
        book2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                book2MousePressed(evt);
            }
        });

        book3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        book3.setMaximumSize(new java.awt.Dimension(2000, 2000));
        book3.setMinimumSize(new java.awt.Dimension(150, 200));
        book3.setPreferredSize(new java.awt.Dimension(150, 200));
        book3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                book3MousePressed(evt);
            }
        });

        book4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        book4.setMaximumSize(new java.awt.Dimension(2000, 2000));
        book4.setMinimumSize(new java.awt.Dimension(150, 200));
        book4.setPreferredSize(new java.awt.Dimension(150, 200));
        book4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                book4MousePressed(evt);
            }
        });

        book5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        book5.setMaximumSize(new java.awt.Dimension(2000, 2000));
        book5.setMinimumSize(new java.awt.Dimension(150, 200));
        book5.setPreferredSize(new java.awt.Dimension(150, 200));
        book5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                book5MousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(book1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(book2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(book3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(book4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(book5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(btnRight, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRight, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(112, 112, 112))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(book5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(book4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(book3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(book2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(book1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRightMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRightMousePressed
        // TODO add your handling code here:
        if(this.start >= this.list_book.size() - 5) return;
        this.start +=1;
        setBook(start);
    }//GEN-LAST:event_btnRightMousePressed

    private void btnLeftMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLeftMousePressed
        // TODO add your handling code here:
        if(this.start <=0 ) return;
        this.start -=1;
        setBook(start);
    }//GEN-LAST:event_btnLeftMousePressed
    private void goBook(int index)
    {
        Model_Sach tmp = services.getBookByID(this.id[index]);
        if(tmp==null) return;
        JFrame parent = (JFrame)this.getTopLevelAncestor();
        parent.setContentPane(new PanelBook(tmp));
        parent.validate();
        parent.invalidate();
    }
    private void book1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book1MousePressed
        // TODO add your handling code here:
        goBook(0);
    }//GEN-LAST:event_book1MousePressed

    private void book2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book2MousePressed
        // TODO add your handling code here:
        goBook(1);
    }//GEN-LAST:event_book2MousePressed

    private void book3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book3MousePressed
        // TODO add your handling code here:
        goBook(2);
    }//GEN-LAST:event_book3MousePressed

    private void book4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book4MousePressed
        // TODO add your handling code here:
        goBook(3);
    }//GEN-LAST:event_book4MousePressed

    private void book5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book5MousePressed
        // TODO add your handling code here:
        goBook(4);
    }//GEN-LAST:event_book5MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel book1;
    private javax.swing.JLabel book2;
    private javax.swing.JLabel book3;
    private javax.swing.JLabel book4;
    private javax.swing.JLabel book5;
    private javax.swing.JButton btnLeft;
    private javax.swing.JButton btnRight;
    // End of variables declaration//GEN-END:variables
}
