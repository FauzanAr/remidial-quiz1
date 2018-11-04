/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ojan
 */
public class Persegi extends BangunDatar {
    
    public Persegi(int sisi1) {
        super(sisi1);
    }
    
    public int luasPersegi(){
        return sisi1*sisi1;
    }
    
    public int kelilingPersegi(){
        return sisi1*4;
    }
    
    public String toString(){
        String print = super.toString();
        return print += "Persegi :\nLuas Persegi : "+luasPersegi()+"\nKeliling Persegi : "+kelilingPersegi();
    }
}
