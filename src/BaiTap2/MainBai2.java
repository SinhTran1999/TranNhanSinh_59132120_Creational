/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author ADMIN
 */
public class MainBai2 {
    public static void main(String[] args){   
        MyStringBuilder str = new MyStringBuilder.Builder()
                                .addString("Trần Nhân Sinh: ")
                                .addString("59132120 ")
                                .addString(", Thêm số thực :")
                                .addFloat((float)10.6)
                                .addString(", Thêm boolean: ")
                                .addBool(Boolean.TRUE)
                                .Builder();
        
        System.out.println("\n" + str.toString());
    }
} 