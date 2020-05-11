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
public class ShapeFactory {
    private static ShapeFactory instance;
    
    public static ShapeFactory Createinstance(){
        if(instance == null)
            instance = new ShapeFactory();
        return instance;
    }
    
     public Shape createShape(ShapeType Type){
         switch(Type){
            case Rectangle: return new Rectangle();
            case Triangle: return new Triangle();
            case Circle: return new Circle();
        }
        return null;
     }
}
