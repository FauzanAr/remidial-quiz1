/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ojan
 */
public class BangunDatar {
    protected int sisi1,sisi2;
    
    public BangunDatar(){
        
    }
    
    public BangunDatar(int sisi1){
        this.sisi1 = sisi1;
    }
    
    public BangunDatar(int sisi1,int sisi2){
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
    }
    
    public void setSisi1 (int sisi1){
        this.sisi1 = sisi1;
    }
    public void setSisi2 (int sisi2){
        this.sisi2 = sisi2;
    }
    public int getSisi1 (){
        return sisi1;
    }
    public int getSisi2 (){
        return sisi2;
    }
    
    @Override
    public String toString(){
        return "\nBangun Datar ";
    }
}
