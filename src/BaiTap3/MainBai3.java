/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author ADMIN
 */
public class MainBai3 {
    public static void main(String[] args){
        ShapeFactory Hinh1 = ShapeFactory.Createinstance();
        ShapeFactory Hinh2 = ShapeFactory.Createinstance();
        ShapeFactory Hinh3 = ShapeFactory.Createinstance();
        
        Shape H1 = Hinh1.createShape(ShapeType.Triangle);
        System.out.println(H1.draw() );
        
        Shape H2 = Hinh2.createShape(ShapeType.Circle);
        System.out.println(H2.draw());
        
        Shape H3 = Hinh2.createShape(ShapeType.Rectangle);
        System.out.println(H3.draw());
    }
}

