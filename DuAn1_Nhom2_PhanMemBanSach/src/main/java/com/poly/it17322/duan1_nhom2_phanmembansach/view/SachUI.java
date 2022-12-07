/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.poly.it17322.duan1_nhom2_phanmembansach.view;

//import com.poly.it17322.duan1_phanmembansach_nhom2.domainmodel.ChiTietSach;
//import com.poly.it17322.duan1_phanmembansach_nhom2.domainmodel.NXB;
//import com.poly.it17322.duan1_phanmembansach_nhom2.domainmodel.Sach;
//import com.poly.it17322.duan1_phanmembansach_nhom2.domainmodel.TacGia;
//import com.poly.it17322.duan1_phanmembansach_nhom2.domainmodel.TheLoai;
//
//import com.poly.it17322.duan1_phanmembansach_nhom2.reponse.QLCTSach;
//
//import com.poly.it17322.duan1_phanmembansach_nhom2.service.ChiTietSachService;
//import com.poly.it17322.duan1_phanmembansach_nhom2.service.NXBService;
//import com.poly.it17322.duan1_phanmembansach_nhom2.service.SachService;
//import com.poly.it17322.duan1_phanmembansach_nhom2.service.TacGiaService;
//import com.poly.it17322.duan1_phanmembansach_nhom2.service.TheloaiService;
//import com.poly.it17322.duan1_phanmembansach_nhom2.service.impl.ChiTietSachServiceImpl;
//import com.poly.it17322.duan1_phanmembansach_nhom2.service.impl.NXBServiceImpl;
//import com.poly.it17322.duan1_phanmembansach_nhom2.service.impl.SachServiceImpl;
//import com.poly.it17322.duan1_phanmembansach_nhom2.service.impl.TacGiaServiceImpl;
//import com.poly.it17322.duan1_phanmembansach_nhom2.service.impl.TheLoaiServiceImpl;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.plaf.RootPaneUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class SachUI extends javax.swing.JPanel {

    /**
     * Creates new form SachUI
//     */
//    private DefaultTableModel defaultTableModel = new DefaultTableModel();
//    private DefaultComboBoxModel combo = new DefaultComboBoxModel();
//    private ChiTietSachService ctsService = new ChiTietSachServiceImpl();
//    private NXBService nxbService = new NXBServiceImpl();
//    private TacGiaService tgService = new TacGiaServiceImpl();
//    private TheloaiService tlService = new TheLoaiServiceImpl();
//    private SachService sachService = new SachServiceImpl();
   

    public SachUI() {
        initComponents();
//        loadData(ctsService.getListQLCTSach());
//        loadCBO_NXB(nxbService.getAll());
//        loadCBO_TacGia(tgService.getAll());
//        loadCBO_TheLoai(tlService.getAll());
//        loadCBO_Sach(sachService.getAll());
    }
//
//    public void loadData(List<QLCTSach> list) {
//        defaultTableModel = (DefaultTableModel) tblCTS.getModel();
//        defaultTableModel.setRowCount(0);
//        for (QLCTSach s : list) {
//            defaultTableModel.addRow(new Object[]{
//                s.getSach(),
//                s.getTacGia(),
//                s.getNxb(),
//                s.getGiaBan(),
//                s.getSoLuongTon(),
//                s.getTheLoai(),
//                s.getMoTa()
//            });
//        }
//    }
//     public void loadCBO_NXB(List<NXB> list){
//        combo = (DefaultComboBoxModel) cboNXB.getModel();
//        combo.removeAllElements();
//
//        for (NXB nxb : list) {
//            combo.addElement(nxb.getTenNXB());
//        }
//     }
//
//      public void loadCBO_TheLoai(List<TheLoai> list){
//        combo = (DefaultComboBoxModel) cboTheLoai.getModel();
//        combo.removeAllElements();
//
//        for (TheLoai tl : list) {
//            combo.addElement(tl.getTenTL());
//        }
//     }
//      
//       public void loadCBO_TacGia(List<TacGia> list){
//        combo = (DefaultComboBoxModel) cboTacGia.getModel();
//        combo.removeAllElements();
//
//        for (TacGia tg : list) {
//            combo.addElement(tg.getTenTG());
//        }
//     }
//       
//         public void loadCBO_Sach(List<Sach> list){
//        combo = (DefaultComboBoxModel) cboSach.getModel();
//        combo.removeAllElements();
//
//        for (Sach s : list) {
//            combo.addElement(s.getTenSach());
//        }
//     }
//
//        public ChiTietSach getData(){
//            
//        int row = tblCTS.getSelectedRow();
//        ChiTietSach cts = ctsService.getListCTSach().get(row);
//
//        NXB nxb = nxbService.getAll().get(cboNXB.getSelectedIndex());
//        cts.setNxb(nxb);
//
//        TacGia tg = tgService.getAll().get(cboTacGia.getSelectedIndex());
//        cts.setTacGia(tg);
//
//        TheLoai tl = tlService.getAll().get(cboTheLoai.getSelectedIndex());
//        cts.setTheLoai(tl);
//        
//        Sach s = sachService.getAll().get(cboSach.getSelectedIndex());
//        cts.setSach(s);
//        
//        cts.setDonGia(Float.parseFloat(txtGia.getText()));
//        cts.setSoLuongTon(Integer.parseInt(txtSoLuong.getText()));
//        cts.setMoTa(txaMoTa.getText());
//
//        return cts;
//    }
//        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtTim = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtGia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaMoTa = new javax.swing.JTextArea();
        txtSoLuong = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCTS = new javax.swing.JTable();
        tbnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        cboNXB = new javax.swing.JComboBox<>();
        cboTacGia = new javax.swing.JComboBox<>();
        cboTheLoai = new javax.swing.JComboBox<>();
        cboSach = new javax.swing.JComboBox<>();
        btnSach = new javax.swing.JButton();
        btnNXB = new javax.swing.JButton();
        btnTacGia = new javax.swing.JButton();
        btnTheLoai = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 255, 153));
        setPreferredSize(new java.awt.Dimension(700, 800));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm kiếm"));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 70));

        jLabel2.setText("Tìm kiếm");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addComponent(txtTim)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        jLabel3.setText("Sách");

        jLabel4.setText("Giá");

        jLabel5.setText("Nhà xuất bản");

        jLabel6.setText("Tác giả");

        jLabel7.setText("Thể loại");

        jLabel9.setText("Mô tả");

        jLabel10.setText("Số lượng");

        txaMoTa.setColumns(20);
        txaMoTa.setRows(5);
        jScrollPane1.setViewportView(txaMoTa);

        jPanel2.setPreferredSize(new java.awt.Dimension(700, 400));

        tblCTS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Sách", "Tác giả", "Nhà xuất bản", "Giá", "Số lượng", "Thể loại", "Mô tả"
            }
        ));
        tblCTS.setPreferredSize(new java.awt.Dimension(700, 400));
        tblCTS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCTSMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCTS);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        tbnThem.setBackground(new java.awt.Color(51, 51, 255));
        tbnThem.setText("Thêm");
        tbnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnThemActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(51, 51, 255));
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(51, 51, 255));
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        cboNXB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboTacGia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboTheLoai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboSach.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnSach.setText("+");
        btnSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSachActionPerformed(evt);
            }
        });

        btnNXB.setText("+");
        btnNXB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNXBActionPerformed(evt);
            }
        });

        btnTacGia.setText("+");
        btnTacGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTacGiaActionPerformed(evt);
            }
        });

        btnTheLoai.setText("+");
        btnTheLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTheLoaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 893, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cboTacGia, javax.swing.GroupLayout.Alignment.LEADING, 0, 102, Short.MAX_VALUE)
                            .addComponent(cboNXB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboTheLoai, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboSach, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnTacGia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNXB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSach, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTheLoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(185, 185, 185)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtSoLuong, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                            .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 881, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(tbnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(375, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(cboSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSach)
                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cboNXB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNXB))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6)
                            .addComponent(cboTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTacGia))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTheLoai)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnThemActionPerformed
        // TODO add your handling code here:
//        ChiTietSach cts = new ChiTietSach();
//
//        NXB nxb = nxbService.getAll().get(cboNXB.getSelectedIndex());
//        cts.setNxb(nxb);
//
//        TacGia tg = tgService.getAll().get(cboTacGia.getSelectedIndex());
//        cts.setTacGia(tg);
//
//        TheLoai tl = tlService.getAll().get(cboTheLoai.getSelectedIndex());
//        cts.setTheLoai(tl);
//        
//        Sach s = sachService.getAll().get(cboSach.getSelectedIndex());
//        cts.setSach(s);
//
//        cts.setDonGia(Float.parseFloat(txtGia.getText()));
//        cts.setSoLuongTon(Integer.parseInt(txtSoLuong.getText()));
//        cts.setMoTa(txaMoTa.getText());
//
//        if (ctsService.them(cts)){
//            JOptionPane.showMessageDialog(this, "Thêm thành công");
//            loadData(ctsService.getListQLCTSach());
//        }else {
//            JOptionPane.showMessageDialog(this, "Thêm thất bại");
//        }
    }//GEN-LAST:event_tbnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
//         ChiTietSach cts = getData();
//
//        if (ctsService.sua(cts)){
//            JOptionPane.showMessageDialog(this, "sua thanh cong");
//            loadData(ctsService.getListQLCTSach());
//        }else {
//            JOptionPane.showMessageDialog(this, "sua that bai");
//        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
//         ChiTietSach cts = getData();
//
//        if (ctsService.xoa(cts)){
//            JOptionPane.showMessageDialog(this, "Xóa thành công");
//            loadData(ctsService.getListQLCTSach());
//        }else {
//            JOptionPane.showMessageDialog(this, "Xóa thất bại");
//        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tblCTSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCTSMouseClicked
        // TODO add your handling code here:
//        int row = tblCTS.getSelectedRow();
//        ChiTietSach chiTietSP = ctsService.getListCTSach().get(row);
//        cboSach.setSelectedItem(tblCTS.getValueAt(row, 0));
//        cboNXB.setSelectedItem(tblCTS.getValueAt(row, 2));
//        cboTacGia.setSelectedItem(tblCTS.getValueAt(row, 1));
//        cboTheLoai.setSelectedItem(tblCTS.getValueAt(row, 5));
//        txaMoTa.setText(tblCTS.getValueAt(row, 6).toString());
//        txtSoLuong.setText(tblCTS.getValueAt(row, 4).toString());
//        txtGia.setText(tblCTS.getValueAt(row, 3).toString());
    }//GEN-LAST:event_tblCTSMouseClicked

    private void btnTacGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTacGiaActionPerformed
        // TODO add your handling code here:
//        InsertTacGia n = new InsertTacGia();
//        n.setVisible(true);
//        loadCBO_TacGia(tgService.getAll());
//        this.disable();
    }//GEN-LAST:event_btnTacGiaActionPerformed

    private void btnSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSachActionPerformed
        // TODO add your handling code here:

//        InsertSach n = new InsertSach();
//        n.setVisible(true);
//        loadCBO_Sach(sachService.getAll());
//        this.disable();
    }//GEN-LAST:event_btnSachActionPerformed

    private void btnNXBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNXBActionPerformed
        // TODO add your handling code here:
//        InsertNXB n = new InsertNXB();
//        n.setVisible(true);
//        loadCBO_NXB(nxbService.getAll());
//        this.disable();
    }//GEN-LAST:event_btnNXBActionPerformed

    private void btnTheLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTheLoaiActionPerformed
        // TODO add your handling code here:
//        InsertTheLoai n = new InsertTheLoai();
//        n.setVisible(true);
//        loadCBO_TheLoai(tlService.getAll());
//        this.disable();
    }//GEN-LAST:event_btnTheLoaiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNXB;
    private javax.swing.JButton btnSach;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTacGia;
    private javax.swing.JButton btnTheLoai;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboNXB;
    private javax.swing.JComboBox<String> cboSach;
    private javax.swing.JComboBox<String> cboTacGia;
    private javax.swing.JComboBox<String> cboTheLoai;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblCTS;
    private javax.swing.JButton tbnThem;
    private javax.swing.JTextArea txaMoTa;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTim;
    // End of variables declaration//GEN-END:variables

}
