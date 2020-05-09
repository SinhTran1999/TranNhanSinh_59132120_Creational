/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/**
 *
 * @author ADMIN
 */
public class MainBai1 {

    public static void main(String[] args) throws ParseException {
        HoaDonHeader HDH = new HoaDonHeader("HD01",new SimpleDateFormat("dd/mm/yyyy").parse("10/05/2020"),"Trần Nhân Sinh");
        CTHD CTHD1 = new CTHD("Đèn bàn Led điện quan",2,85000,0.5);
        CTHD CTHD2 = new CTHD("Đèn bàn học sinh Philips",3,100000,0.8);
        CTHD CTHD3 = new CTHD("Đèn bàn học Philips ",4,150000,0.8);
        CTHD CTHD4 = new CTHD("Đèn bàn LED Tiross TS1804",10,140000,1.4);
        
        HoaDon HD = new HoaDon.Builder()
                .addHoaDonHeader(HDH)
                .addCTHD(CTHD1)
                .addCTHD(CTHD2)
                .addCTHD(CTHD3)
                .addCTHD(CTHD4)
                .build();
       System.out.println(HD.toString());
    }
    
}
