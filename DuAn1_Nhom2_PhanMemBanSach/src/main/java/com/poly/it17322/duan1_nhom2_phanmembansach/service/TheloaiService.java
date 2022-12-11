/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.poly.it17322.duan1_nhom2_phanmembansach.service;

import com.poly.it17322.duan1_nhom2_phanmembansach.domainmodel.TheLoai;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface TheloaiService {
     List<TheLoai>getAll();
    
     TheLoai getOne(String ma);
    
     Boolean add(TheLoai tl);
    
     Boolean update(TheLoai tl);
     
     Boolean delete(TheLoai tl);
}
