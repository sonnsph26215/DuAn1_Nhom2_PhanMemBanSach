/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.poly.it17322.duan1_nhom2_phanmembansach.view;

//import com.poly.it17322.duan1_phanmembansach_nhom2.domainmodel.ChiTietSach;
import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import com.google.zxing.Result;

//import com.poly.it17322.duan1_phanmembansach_nhom2.reponse.HoaDonChiTietReponse;
//import com.poly.it17322.duan1_phanmembansach_nhom2.reponse.HoaDonReponse;
//import com.poly.it17322.duan1_phanmembansach_nhom2.reponse.ViewSachReponse;
//import com.poly.it17322.duan1_phanmembansach_nhom2.service.ViewHoaDonService;
//import com.poly.it17322.duan1_phanmembansach_nhom2.service.ViewSachService;
//import com.poly.it17322.duan1_phanmembansach_nhom2.domainmodel.HoaDon;
//import com.poly.it17322.duan1_phanmembansach_nhom2.domainmodel.HoaDonChiTiet;
//import com.poly.it17322.duan1_phanmembansach_nhom2.service.ChiTietSachService;
//import com.poly.it17322.duan1_phanmembansach_nhom2.service.HDCTService;
//import com.poly.it17322.duan1_phanmembansach_nhom2.service.HoaDonService;
//import com.poly.it17322.duan1_phanmembansach_nhom2.service.ViewHDCTService;
//import com.poly.it17322.duan1_phanmembansach_nhom2.service.impl.ChiTietSachServiceImpl;
//import com.poly.it17322.duan1_phanmembansach_nhom2.service.impl.HDCTServiceImpl;
//import com.poly.it17322.duan1_phanmembansach_nhom2.service.impl.HoaDonServiceImpl;
//import com.poly.it17322.duan1_phanmembansach_nhom2.service.impl.ViewHDCTServiceImpl;
//import com.poly.it17322.duan1_phanmembansach_nhom2.service.impl.ViewHDServiceImpl;
//import com.poly.it17322.duan1_phanmembansach_nhom2.service.impl.ViewSachServiceImpl;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.CMYKColor;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
//import com.poly.it17322.duan1_phanmembansach_nhom2.domainmodel.KhachHang;
//import com.poly.it17322.duan1_phanmembansach_nhom2.service.KhachHangService;
//import com.poly.it17322.duan1_phanmembansach_nhom2.service.impl.KhachHangServiceImpl;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;


/**
 *
 * @author Administrator
 */
public class BanHangUI extends javax.swing.JPanel  {

//    private ViewSachService viewSachService = new ViewSachServiceImpl();
//    private ViewHDCTService viewHoaDonCTService = new ViewHDCTServiceImpl();
//    private HDCTService hoaDonCTService = new HDCTServiceImpl();
//    private ViewHoaDonService viewHoaDonService = new ViewHDServiceImpl();
//    private HoaDonService hoaDonService = new HoaDonServiceImpl();
//    private ChiTietSachService chiTietSachService = new ChiTietSachServiceImpl();
//    private KhachHangService khachHangService = new KhachHangServiceImpl();
//    private DefaultTableModel model = new DefaultTableModel();
//    private DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel();
    private static final long serialVersionUID = 6441489157408381878L;
//    private Executor executor = Executors.newSingleThreadExecutor(this);
    private Webcam webcam = null;
    private WebcamPanel panel = null;
    private JTextArea textarea = null;
    private Thread t1;
    
    public BanHangUI() {
        initComponents();
//        loadDataSP(viewSachService.getListSach());
//        loadDataHD(viewHoaDonService.getListHDReponse());
//        loadCBOKH(khachHangService.getList());
       scannerImel();
        
    }
    
    public void scannerImel() {
        Webcam webcam = Webcam.getDefault();
        webcam.setViewSize(WebcamResolution.QVGA.getSize());

        WebcamPanel panel = new WebcamPanel(webcam);
        panel.setPreferredSize(WebcamResolution.VGA.getSize());
        panel.setFPSDisplayed(true);

        Cam.add(panel, new AbsoluteConstraints(0, 0, 280, 181));

        t1 = new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                    }
                    BufferedImage image = null;
                    Result result = null;
                    if (webcam.isOpen()) {
                        if ((image = webcam.getImage()) == null) {
                            continue;
                        }
                    }

                    try {
                        LuminanceSource source = new BufferedImageLuminanceSource(image);
                        BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
                        Reader reader = new MultiFormatReader();
                        result = reader.decode(bitmap);
                    } catch (Exception e) {
                    }
                    if (result != null) {
                        JOptionPane.showMessageDialog(null, result.getText());
//                        if (indexHD != -1) {
//                            if (bhs.addSpSanner(result.getText(), lstHoaDon.get(indexHD).getId())) {
//                                JOptionPane.showMessageDialog(null, "Thêm sản phẩm thành công");
//                                fillTableGH();
//                                fillTableSP();
//                            } else {
//                                JOptionPane.showMessageDialog(null, "Sản phẩm không tồn tại");
//                            }
//                        }
                    }
                }
            }
        };
        t1.start();
    }

//    public void loadDataSP(List<ViewSachReponse> list) {
//        model = (DefaultTableModel) tblSach.getModel();
//        model.setRowCount(0);
//        int stt = 1;
//        for (ViewSachReponse sanPhamVM : list) {
//            model.addRow(new Object[]{
//                stt++,
//                sanPhamVM.getMaSach(),
//                sanPhamVM.getTenSach(),
//                sanPhamVM.getSoLuongTon(),
//                sanPhamVM.getDonGia(),
//                sanPhamVM.getMoTa()
//
//            });
//        }
//    }
//
//    public void loadDataHD(List<HoaDonReponse> list) {
//        model = (DefaultTableModel) tblHoaDon.getModel();
//        model.setRowCount(0);
//        int stt = 1;
//        for (HoaDonReponse hoaDonVM : list) {
//            model.addRow(new Object[]{
//                stt++,
//                hoaDonVM.getMaHD(),
//                hoaDonVM.getNgayTao(),
//                "Đoàn Văn Công",
//                hoaDonVM.getTinhTrang() == 0 ? "Chưa thanh toán" : "Đã thanh toán"
//            });
//        }
//    }
//
//    public void loadDataHDCT(List<HoaDonChiTietReponse> list) {
//        model = (DefaultTableModel) tblCTHD.getModel();
//        model.setRowCount(0);
//        int stt = 1;
//        for (HoaDonChiTietReponse hdctvm : list) {
//            model.addRow(new Object[]{
//                stt++,
//                hdctvm.getMaSach(),
//                hdctvm.getTenSach(),
//                hdctvm.getSoLuong(),
//                hdctvm.getDonGia(),
//                hdctvm.thanhTien()
//            });
//        }
//    }
//
//    public Double tongTien() {
//        double sum = 0.0;
//        for (int i = 0; i < tblCTHD.getRowCount(); i++) {
//            sum += Float.parseFloat(tblCTHD.getValueAt(i, 5).toString());
//        }
//        return sum;
//    }
//
//    public String genMa() {
//
//        for (int i = 0; i < hoaDonService.getListHD().size() + 1; i++) {
//            String ma = "HD" + i;
//            if (hoaDonService.getHDByMa(ma) == null) {
//                return ma;
//            }
//        }
//        return null;
//    }
//
//    public void loadCBOKH(List<KhachHang> list) {
//        defaultComboBoxModel = (DefaultComboBoxModel) cboKhacHang.getModel();
//        defaultComboBoxModel.removeAllElements();
//        for (KhachHang kh : list) {
//            defaultComboBoxModel.addElement(kh.getTen());
//        }
//    }
//
////    ButtonGroup groupLoc = new ButtonGroup();
////
////    public void groupLoc() {
////        groupLoc.add(rdAll);
////        groupLoc.add(rdChuaTT);
////        groupLoc.add(rdDaTT);
////
////    }
//    public Boolean checkTT() {
//        int row = tblHoaDon.getSelectedRow();
//        if (row == -1) {
//            JOptionPane.showMessageDialog(this, "Chưa chọn hóa đơn");
//            return false;
//        }
//        HoaDon hoaDon = hoaDonService.getListHD().get(row);
//        if (hoaDon.getTinhTrang() == 0) {
//            JOptionPane.showMessageDialog(this, "Hóa đơn đã thanh toán");
//            return false;
//        }
//        return true;
//    }
//
//    public Boolean checkForm() {
//        if (txtMaHD.getText().isEmpty()) {
//            JOptionPane.showMessageDialog(this, "Chọn hóa đơn chưa ?");
//            return false;
//        }
//        if (txtTienNhan.getText().isEmpty()) {
//            JOptionPane.showMessageDialog(this, "Chưa nhập tiền kìa!");
//            return false;
//        }
//
//        if (Float.parseFloat(txtTongTien.getText()) <= 0) {
//            JOptionPane.showMessageDialog(this, "Hóa đơn chưa có sản phẩm!");
//            return false;
//        }
//
//        try {
//            Float.parseFloat(txtTongTien.getText());
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "Nhập lại!");
//            txtTienNhan.setText("");
//            return false;
//        }
//        if (Float.parseFloat(txtTienThua.getText()) < 0) {
//            Float tienThieu = (Float.parseFloat(txtTongTien.getText()) - Integer.parseInt(txtTienNhan.getText()));
//            JOptionPane.showMessageDialog(this, "Thất bại, tiền không đủ: " + tienThieu);
//            return false;
//        } else {
//            float tienThua = Float.parseFloat(txtTienThua.getText());
//            JOptionPane.showMessageDialog(this, "tien thua: " + (tienThua));
//        }
//        return true;
//    }
//
//
//    public void clearFrom() {
//        txtMaHD.setText("");
//        txtNgayTao.setText("");
//        txtTongTien.setText("");
//        txtTienNhan.setText("");
//        txtTienThua.setText("");
////        txtTenKH.setText("");
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCTHD = new javax.swing.JTable();
        btnXoaAll = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSach = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtTim = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMaHD = new javax.swing.JTextField();
        txtTongTien = new javax.swing.JTextField();
        txtTienNhan = new javax.swing.JTextField();
        txtNgayTao = new javax.swing.JTextField();
        btnThanhToan = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtTenNV = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cboKhacHang = new javax.swing.JComboBox<>();
        btnKhachHang = new javax.swing.JButton();
        txtTienThua = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblHoaDon = new javax.swing.JTable();
        btnTaoHoaDon = new javax.swing.JButton();
        Cam = new javax.swing.JPanel();

        setBackground(new java.awt.Color(153, 255, 153));
        setPreferredSize(new java.awt.Dimension(700, 800));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Giỏ hàng"));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 250));

        tblCTHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã sách", "Tên sách", "Số lượng", "Đơn giá", "Thành tiền"
            }
        ));
        tblCTHD.setPreferredSize(new java.awt.Dimension(400, 250));
        tblCTHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCTHDMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCTHD);

        btnXoaAll.setBackground(new java.awt.Color(51, 51, 255));
        btnXoaAll.setText("Xóa tất cả");
        btnXoaAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnXoaAll, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnXoaAll)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin sản phẩm"));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 250));

        tblSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã sách", "Tên sách", "Số lượng", "Đơn giá", "Mô tả"
            }
        ));
        tblSach.setPreferredSize(new java.awt.Dimension(400, 250));
        tblSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSachMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSach);

        jLabel1.setText("Tìm kiếm");

        txtTim.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtTimCaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTim)
                .addGap(384, 384, 384))
            .addComponent(jScrollPane2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin hóa đơn"));
        jPanel3.setPreferredSize(new java.awt.Dimension(250, 800));

        jLabel2.setText("Mã HĐ");

        jLabel3.setText("Ngày tạo");

        jLabel5.setText("Tiền khách đưa");

        jLabel6.setText("Thành tiền");

        jLabel7.setText("Tiền thừa");

        txtTienNhan.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtTienNhanCaretUpdate(evt);
            }
        });

        btnThanhToan.setBackground(new java.awt.Color(51, 51, 255));
        btnThanhToan.setText("Thanh toán");
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        jLabel8.setText("Tên nhân viên");

        txtTenNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenNVActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Khách hàng"));

        jLabel4.setText("Khách hàng");

        btnKhachHang.setText("Thêm khách hàng");
        btnKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhachHangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cboKhacHang, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnKhachHang)
                .addGap(30, 30, 30))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboKhacHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKhachHang))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        txtTienThua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTienThuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTienNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(txtTienThua, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTienNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTienThua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btnThanhToan)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Hóa đơn"));
        jPanel4.setPreferredSize(new java.awt.Dimension(400, 250));

        tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã HĐ", "Ngày tạo", "Nhân Viên", "Tình trạng"
            }
        ));
        tblHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHoaDonMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblHoaDon);
        if (tblHoaDon.getColumnModel().getColumnCount() > 0) {
            tblHoaDon.getColumnModel().getColumn(1).setResizable(false);
            tblHoaDon.getColumnModel().getColumn(3).setResizable(false);
        }

        btnTaoHoaDon.setBackground(new java.awt.Color(51, 51, 255));
        btnTaoHoaDon.setText("Tạo hóa đơn");
        btnTaoHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoHoaDonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTaoHoaDon)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTaoHoaDon)
                .addGap(6, 6, 6))
        );

        Cam.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Webcam", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        Cam.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(Cam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(335, 335, 335))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed

//        if (checkTT()) {
//            if (checkForm()) {
//                HoaDon hoaDon = hoaDonService.getHDByMa(txtMaHD.getText());
//                hoaDon.setTinhTrang(1);
//                hoaDon.setTongTien(hoaDon.getTongTien());
//                hoaDon.setNgayThanhToan(Date.valueOf(LocalDate.now()));
//                hoaDonService.sua(hoaDon);
//
//                JOptionPane.showMessageDialog(this, "Thanh toán thành công");
//                clearFrom();
//                loadDataHD(viewHoaDonService.getListHDReponse());
//                loadDataHDCT(viewHoaDonCTService.getListHDCTReponse(txtMaHD.getText()));
//                loadDataSP(viewSachService.getListSach());
//            }
//        }

    }//GEN-LAST:event_btnThanhToanActionPerformed

    private void btnTaoHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoHoaDonActionPerformed
//        HoaDon hoaDon = new HoaDon();
//        hoaDon.setMa(genMa());
//        hoaDon.setNgayTao(Date.valueOf(LocalDate.now()));
//        hoaDon.setTinhTrang(Integer.parseInt(0 + ""));
//        hoaDonService.them(hoaDon);
//        loadDataHD(viewHoaDonService.getListHDReponse());
//        JOptionPane.showMessageDialog(this, "Tạo hóa đơn thành công");
    }//GEN-LAST:event_btnTaoHoaDonActionPerformed

    private void txtTimCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtTimCaretUpdate
//        String ten = txtTim.getText();
//        List<ViewSachReponse> list = viewSachService.timKiem(ten);
//        loadDataSP(list);
    }//GEN-LAST:event_txtTimCaretUpdate

    private void tblCTHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCTHDMouseClicked

////        int rowGH = tblCTHD.getSelectedRow();
////        if (rowGH == -1) {
////            JOptionPane.showMessageDialog(this, "Chưa chọn sách!");
////            return;
////        }
////        String input = JOptionPane.showInputDialog("Nhập lại số lượng sách!");
////        try {
////            Integer.parseInt(input);
////        } catch (Exception e) {
////            JOptionPane.showMessageDialog(this, "Nhập lại!");
////            return;
////        }
////
////        if (Integer.parseInt(input) < 0) {
////            JOptionPane.showMessageDialog(this, "Nhập lại số lượng!");
////            return;
////        }
////
////        HoaDonChiTiet hdct = hoaDonCTService.getListHDCT().get(rowGH);
////        if (Integer.parseInt(input) == hdct.getSoLuong()) {
////            return;
////        }
////        int soLuongSP = hdct.getSoLuong();
////
////        ChiTietSach ctsp = chiTietSachService.getCTSachbyMa(tblCTHD.getValueAt(rowGH, 1).toString());
////        if (ctsp.getSoLuongTon() == 0) {
////            JOptionPane.showMessageDialog(this, "Đã hết hàng!");
////            return;
////        }
////        ctsp.setSoLuongTon(ctsp.getSoLuongTon() + soLuongSP);
////
////        if (Integer.parseInt(input) == 0) {
////            hoaDonCTService.xoa(hdct);
////            ctsp.setSoLuongTon(ctsp.getSoLuongTon() + Integer.parseInt(input));
////            chiTietSachService.sua(ctsp);
////
////        }
////        if (Integer.parseInt(input) > 0) {
////            hdct.setSoLuong(Integer.parseInt(input));
////            hoaDonCTService.sua(hdct);
////            if (Integer.parseInt(input) < hdct.getSoLuong()) {
////                ctsp.setSoLuongTon(ctsp.getSoLuongTon() + Integer.parseInt(input));
////            } else {
////                ctsp.setSoLuongTon(ctsp.getSoLuongTon() - Integer.parseInt(input));
////            }
////            chiTietSachService.sua(ctsp);
////        }
////        loadDataSP(viewSachService.getListSach());
////        loadDataHDCT(viewHoaDonCTService.getListHDCTReponse(txtMaHD.getText()));
    }//GEN-LAST:event_tblCTHDMouseClicked

    private void tblSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSachMouseClicked
//        if (txtMaHD.getText().equals("")) {
//            JOptionPane.showMessageDialog(this, "chon hoa don truoc");
//            return;
//        } else {
//            HoaDon hoaDon = hoaDonService.getHDByMa(txtMaHD.getText());
//            if (checkTT()) {
//                int rowSP = tblSach.getSelectedRow();
//                ChiTietSach ctsp = chiTietSachService.getListCTSach().get(rowSP);
//                if (ctsp.getSoLuongTon() == 0) {
//                    JOptionPane.showMessageDialog(this, "het hang");
//                    return;
//                } else {
//                    String input = JOptionPane.showInputDialog("nhap SL SP: ");
//                    try {
//                        Integer.parseInt(input);
//                    } catch (Exception e) {
//                        JOptionPane.showMessageDialog(this, "nhap lai so luong");
//                        return;
//                    }
//                    if (Integer.parseInt(input) > ctsp.getSoLuongTon()) {
//                        JOptionPane.showMessageDialog(this, "ko du, so luong san pham con lai: " + ctsp.getSoLuongTon());
//                        return;
//                    }
//                    if (Integer.parseInt(input) <= 0) {
//                        JOptionPane.showMessageDialog(this, "so luong nhap vao phai > 0");
//                        return;
//                    } else {
//                        if (hoaDonCTService.getHDCT(hoaDon.getId(), ctsp.getId()) == null) {
//                            HoaDonChiTiet hdct = new HoaDonChiTiet();
//                            hdct.setHoaDon(hoaDonService.getHDByMa(txtMaHD.getText()));
//                            hdct.setChiTietSach(chiTietSachService.getListCTSach().get(rowSP));
//
//                            hdct.setSoLuong(Integer.parseInt(input));
//                            hdct.setDonGia(Float.parseFloat(tblSach.getValueAt(rowSP, 4).toString()));
//
//                            hoaDonCTService.them(hdct);
//                        } else {
//                            HoaDonChiTiet hdct = hoaDonCTService.getHDCT(hoaDon.getId(), ctsp.getId());
//                            hdct.setSoLuong(hdct.getSoLuong() + Integer.parseInt(input));
//                            hoaDonCTService.sua(hdct);
//                        }
//
//                        loadDataHDCT(viewHoaDonCTService.getListHDCTReponse(txtMaHD.getText()));
//
//                        ctsp.setSoLuongTon(ctsp.getSoLuongTon() - Integer.parseInt(input));
//                        chiTietSachService.sua(ctsp);
//                    }
//                }
//            }
//        }
//
//        loadDataSP(viewSachService.getListSach());
//
//        txtTongTien.setText(tongTien().toString());
    }//GEN-LAST:event_tblSachMouseClicked

    private void txtTienNhanCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtTienNhanCaretUpdate
//        if (!txtTienNhan.getText().equals("")) {
//            txtTienThua.setText(String.valueOf((Integer.parseInt(txtTienNhan.getText())) - Float.parseFloat(txtTongTien.getText())));
//        }
    }//GEN-LAST:event_txtTienNhanCaretUpdate

    private void tblHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoaDonMouseClicked
//        int row = tblHoaDon.getSelectedRow();
//        txtMaHD.setText(tblHoaDon.getValueAt(row, 1).toString());
//        txtNgayTao.setText(tblHoaDon.getValueAt(row, 2).toString());
//        txtTenNV.setText(tblHoaDon.getValueAt(row, 3).toString());
//        loadDataHDCT(viewHoaDonCTService.getListHDCTReponse(txtMaHD.getText()));
//        txtTongTien.setText(tongTien().toString());
    }//GEN-LAST:event_tblHoaDonMouseClicked

    private void btnXoaAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaAllActionPerformed
        // TODO add your handling code here:
//        model = (DefaultTableModel) tblCTHD.getModel();
//        model.getDataVector().removeAllElements();
//        model.fireTableDataChanged();
//        model.setRowCount(0);
//        int rowGH = tblCTHD.getSelectedRow();
//        HoaDonChiTiet cthd = hoaDonCTService.getListHDCT().get(rowGH);
//        ChiTietSach ctsp = chiTietSachService.getCTSachbyMa(tblCTHD.getValueAt(rowGH, 1).toString());
//        try {
//            for (int i = 0; i < tblCTHD.getRowCount(); i++) {
//                if (cthd.getSoLuong() < 0) {
//                    ctsp.setSoLuongTon(ctsp.getSoLuongTon() + cthd.getSoLuong());
//                    chiTietSachService.sua(ctsp);
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            JOptionPane.showMessageDialog(this, "Không xóa được giỏ hàng");
//            return;
//        }
//        JOptionPane.showMessageDialog(this, "Đã xóa các sản phẩm chọn khỏi giỏ hàng");
//        loadDataSP(viewSachService.getListSach());
//        loadDataHDCT(viewHoaDonCTService.getListHDCTReponse(txtMaHD.getText()));
    }//GEN-LAST:event_btnXoaAllActionPerformed

    private void txtTenNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenNVActionPerformed

    private void btnKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhachHangActionPerformed
        // TODO add your handling code here:
//        InsertKhachHang n = new InsertKhachHang();
//        n.setVisible(true);
//        this.disable();
    }//GEN-LAST:event_btnKhachHangActionPerformed

    private void txtTienThuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTienThuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTienThuaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel Cam;
    javax.swing.JButton btnKhachHang;
    javax.swing.JButton btnTaoHoaDon;
    javax.swing.JButton btnThanhToan;
    javax.swing.JButton btnXoaAll;
    javax.swing.JComboBox<String> cboKhacHang;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel2;
    javax.swing.JLabel jLabel3;
    javax.swing.JLabel jLabel4;
    javax.swing.JLabel jLabel5;
    javax.swing.JLabel jLabel6;
    javax.swing.JLabel jLabel7;
    javax.swing.JLabel jLabel8;
    javax.swing.JPanel jPanel1;
    javax.swing.JPanel jPanel2;
    javax.swing.JPanel jPanel3;
    javax.swing.JPanel jPanel4;
    javax.swing.JPanel jPanel5;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JScrollPane jScrollPane2;
    javax.swing.JScrollPane jScrollPane4;
    javax.swing.JTable tblCTHD;
    javax.swing.JTable tblHoaDon;
    javax.swing.JTable tblSach;
    javax.swing.JTextField txtMaHD;
    javax.swing.JTextField txtNgayTao;
    javax.swing.JTextField txtTenNV;
    javax.swing.JTextField txtTienNhan;
    javax.swing.JTextField txtTienThua;
    javax.swing.JTextField txtTim;
    javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables

}
