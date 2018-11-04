/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ojan
 */
public class PersegiPanjang extends BangunDatar {
    
    public PersegiPanjang(int sisi1, int sisi2) {
        super(sisi1, sisi2);
    }
    
    public int getLuasPersegiPanjang(){
        return sisi1*sisi2;
    }
    
    public int getKelilingPersegiPanjang(){
        return (2*sisi1)+(2*sisi2);
    }
    
    public String toString(){
        String print = super.toString();
        return print += "Persegi Panjang\nLuas : "+getLuasPersegiPanjang()+"\nKeliling : "+getKelilingPersegiPanjang();
    }
}
