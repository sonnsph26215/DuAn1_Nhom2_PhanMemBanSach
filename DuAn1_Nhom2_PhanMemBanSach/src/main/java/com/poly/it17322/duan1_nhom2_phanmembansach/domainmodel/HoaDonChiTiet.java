package com.poly.it17322.duan1_nhom2_phanmembansach.domainmodel;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "HoaDon_ChiTiet")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class HoaDonChiTiet implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ManyToOne
    @JoinColumn(name = "idHoaDon", referencedColumnName = "id")
    private HoaDon hoaDon;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ManyToOne
    @JoinColumn(name = "idChiTietSach", referencedColumnName = "id")
    private ChiTietSach chiTietSach;

    @Column(name = "tenSach")
    private String tenSach;

    @Column(name = "soLuong")
    private Integer soLuong;

    @Column(name = "donGia")
    private BigDecimal donGia;
    
    @Column(name = "thanhTien")
    private BigDecimal thanhTien;

    @Temporal(TemporalType.DATE)
    @Column(name = "ngayTao")
    private Date ngayTao;

    @Temporal(TemporalType.DATE)
    @Column(name = "ngayCapNhat")
    private Date ngayCapNhat;

    @Column(name = "nguoiTao")
    private String nguoiTao;

    @Column(name = "nguoiCapNhat")
    private String nguoiCapNhat;

}
