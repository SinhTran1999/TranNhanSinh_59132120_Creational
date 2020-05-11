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
public class Circle extends Shape{

    protected static Circle instance;
    
    public static Circle createInstance()
    {
        if(instance==null)
            instance = new Circle();
        return instance;
    }
   
    protected Circle() {
    }
    
    @Override
    public String draw() {
        return "Vẽ hình tròn";
    }
    
}
