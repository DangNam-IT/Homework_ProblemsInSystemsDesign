/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap6;

/**
 *
 * @author Dang Phuong Nam
 */
public class ThanhToanTheTinDung implements IThanhToan{
    @Override
    public void ThanhToan(double soTien){
        System.out.println("Số tiền thanh toán bằng thẻ tín dụng là" + soTien);
    }
}
