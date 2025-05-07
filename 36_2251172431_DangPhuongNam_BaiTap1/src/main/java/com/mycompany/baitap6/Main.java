/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.baitap6;
/**
 *
 * @author Dang Phuong Nam
 */
public class Main {
    public static void main(String[] args) {
        ThanhToanTheTinDung td = new ThanhToanTheTinDung();
        ThanhToanTienMat tm = new ThanhToanTienMat();
        
        double soTien = 7777777;
        td.ThanhToan(soTien);
        tm.ThanhToan(soTien);
    }
}
