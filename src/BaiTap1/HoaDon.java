/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class HoaDon {
    HoaDonHeader HDH;
    ArrayList<CTHD> DSCTHD = new ArrayList<>();

    public HoaDon(Builder builder) {
        this.HDH = builder.HDH;
        this.DSCTHD = builder.DSCTHD;
    }

    public static class Builder{
        HoaDonHeader HDH;
        ArrayList<CTHD> DSCTHD = new ArrayList<>();

        public Builder() {
        }
        
        public Builder addHoaDonHeader(HoaDonHeader HDH){
            this.HDH = HDH;
            return this;
        }
        
        public Builder addCTHD(CTHD cthd){
            this.DSCTHD.add(cthd);
            return this;
        }
        
        public HoaDon build(){
            return new HoaDon(this);
        }
    }

    @Override
    public String toString() {
        String s = HDH.toString();
        for(int i=0; i<DSCTHD.size(); i++){
            s += "\n"+DSCTHD.get(i).toString();
        }
        return s;
    }
    
    
}
