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
        ShapeFactory shapeFac = new ShapeFactory();
        Shape hchunhat = shapeFac.createShape(ShapeType.Rectangle);
        Shape htamgiac = shapeFac.createShape(ShapeType.Triangle);
        Shape htron = shapeFac.createShape(ShapeType.Circle);
        
        hchunhat.setBrush(": Brush: Bút Chì, ");
        hchunhat.setFrame("Frame: Khung gỗ, ");
        hchunhat.setPaper("Paper: Giấy trắng");
        System.out.println(hchunhat.draw() + hchunhat.getBrush() + hchunhat.getFrame() + hchunhat.getPaper());
        
        htamgiac.setBrush(": Brush: Bút Bi, ");
        htamgiac.setFrame("Frame: Khung tranh, ");
        htamgiac.setPaper("Paper: Giấy màu");
        System.out.println(htamgiac.draw() + htamgiac.getBrush() + htamgiac.getFrame() + htamgiac.getPaper());
        
        htron.setBrush(": Brush: Bút lông, ");
        htron.setFrame("Frame: Khung nhựa, ");
        htron.setPaper("Paper: Giấy học sinh");
        System.out.println(htron.draw()+ htron.getBrush() + htron.getFrame() + htron.getPaper());
    }
}

