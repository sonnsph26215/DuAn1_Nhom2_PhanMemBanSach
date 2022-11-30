
package com.poly.it17322.duan1_nhom2_phanmembansach.view;

import com.poly.it17322.duan1_nhom2_phanmembansach.response.LogInReponse;
import com.poly.it17322.duan1_nhom2_phanmembansach.service.LogInService;
import com.poly.it17322.duan1_nhom2_phanmembansach.service.impl.LogInServiceImpl;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class DangNhap extends javax.swing.JDialog {
    
    private LogInService service = new LogInServiceImpl();


    public DangNhap(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        
        Icon icon = new ImageIcon("log-in (1).png");
        this.txtIcon.setIcon(icon);
        
        Icon iconUser = new ImageIcon("user (2)).png");
        this.txtIcon.setIcon(icon);
        
        Icon iconPassWord = new ImageIcon("security.png");
        this.txtIcon.setIcon(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtIcon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassWord = new javax.swing.JTextField();
        txtErrorUserName = new javax.swing.JLabel();
        txtIconUser = new javax.swing.JLabel();
        txtIconPassWord = new javax.swing.JLabel();
        txtErrorPassWord = new javax.swing.JLabel();
        btnDangNhap = new javax.swing.JButton();
        txtQuenMatKhau = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        txtIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ĐĂNG NHẬP");

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        txtPassWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassWordActionPerformed(evt);
            }
        });

        txtErrorUserName.setForeground(new java.awt.Color(255, 0, 0));

        txtIconUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtIconPassWord.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtErrorPassWord.setForeground(new java.awt.Color(255, 0, 0));

        btnDangNhap.setBackground(new java.awt.Color(0, 153, 153));
        btnDangNhap.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDangNhap.setForeground(new java.awt.Color(255, 255, 255));
        btnDangNhap.setText("ĐĂNG NHẬP");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        txtQuenMatKhau.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtQuenMatKhau.setText("Quên mật khẩu ?");
        txtQuenMatKhau.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                txtQuenMatKhauMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txtQuenMatKhauMouseMoved(evt);
            }
        });
        txtQuenMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtQuenMatKhauMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtIconUser)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtErrorUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtIconPassWord)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtErrorPassWord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPassWord)
                                    .addComponent(btnDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)))
                            .addComponent(txtQuenMatKhau, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(37, 37, 37)
                        .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtIconUser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtErrorUserName)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtIconPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtErrorPassWord)
                .addGap(18, 18, 18)
                .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtQuenMatKhau)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void txtPassWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassWordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassWordActionPerformed

    private void txtQuenMatKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQuenMatKhauMouseClicked

    }//GEN-LAST:event_txtQuenMatKhauMouseClicked

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        String userName = txtUserName.getText().trim();
        String passWord = txtPassWord.getText().trim();
        
        int error = 0;
        
        if(userName.length() == 0) {
            txtErrorUserName.setText("Khong duoc de trong username!!!");
            error++;
        } else {
            txtErrorUserName.setText("");
        }
        
        if(passWord.length() == 0) {
            txtErrorPassWord.setText("Khong duoc de trong password!!!");
            error++;
        } else {
            txtErrorPassWord.setText("");
        }
        
        if(error == 0) {
            
            for (LogInReponse i : service.getAll()) {
                if(userName.equals(i.getMa()) && passWord.equals(i.getMatKhau())) {
                    JOptionPane.showMessageDialog(this, "Dang nhap thanh cong!!!");
                    
                    this.dispose();
                    return;
                }
            }
            
            JOptionPane.showMessageDialog(this, "Tai khoan mat khau sai!!!");
            return;
        }
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void txtQuenMatKhauMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQuenMatKhauMouseDragged

    }//GEN-LAST:event_txtQuenMatKhauMouseDragged

    private void txtQuenMatKhauMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQuenMatKhauMouseMoved
        txtQuenMatKhau.setForeground(Color.red);
    }//GEN-LAST:event_txtQuenMatKhauMouseMoved

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        txtQuenMatKhau.setForeground(Color.black);
    }//GEN-LAST:event_jPanel1MouseMoved

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DangNhap dialog = new DangNhap(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtErrorPassWord;
    private javax.swing.JLabel txtErrorUserName;
    private javax.swing.JLabel txtIcon;
    private javax.swing.JLabel txtIconPassWord;
    private javax.swing.JLabel txtIconUser;
    private javax.swing.JTextField txtPassWord;
    private javax.swing.JLabel txtQuenMatKhau;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
