/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.poly.it17322.duan1_nhom2_phanmembansach.service;

import com.poly.it17322.duan1_nhom2_phanmembansach.domainmodel.HoaDon;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author Administrator
 */
public interface HoaDonService {

    List<HoaDon> getList();

    HoaDon getOne(UUID id);

    List<HoaDon> locTT(Integer tt);

    HoaDon getHDByMa(String ma);

    List<HoaDon> timKiem(String ten);

    Boolean them(HoaDon hoaDon);

    Boolean sua(HoaDon hoaDon);

    Boolean xoa(HoaDon hoaDon);
}
