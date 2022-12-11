/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17322.duan1_nhom2_phanmembansach.service.impl;

import com.poly.it17322.duan1_nhom2_phanmembansach.domainmodel.HoaDon;
import com.poly.it17322.duan1_nhom2_phanmembansach.repository.HoaDonReponsitory;

import com.poly.it17322.duan1_nhom2_phanmembansach.service.HoaDonService;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author Administrator
 */
public class HoaDonServiceImpl implements HoaDonService {

    HoaDonReponsitory hdRepo = new HoaDonReponsitory();

    @Override
    public List<HoaDon> getList() {
        return hdRepo.getList();
    }

    @Override
    public List<HoaDon> locTT(Integer tt) {
        return hdRepo.locTT(tt);
    }

    @Override
    public HoaDon getHDByMa(String ma) {
        return hdRepo.getHDByMa(ma);
    }

    @Override
    public List<HoaDon> timKiem(String ten) {
        return hdRepo.timKiem(ten);
    }

    @Override
    public Boolean them(HoaDon hoaDon) {
        return hdRepo.them(hoaDon);
    }

    @Override
    public Boolean sua(HoaDon hoaDon) {
        return hdRepo.sua(hoaDon);
    }

    @Override
    public Boolean xoa(HoaDon hoaDon) {
        return hdRepo.xoa(hoaDon);
    }

    @Override
    public HoaDon getOne(UUID id) {
        return hdRepo.getOne(id);
    }

}
