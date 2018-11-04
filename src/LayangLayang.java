/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ojan
 */
public class LayangLayang extends BangunDatar {
    private int diagonal1,diagonal2;
    
    public LayangLayang(int sisi1, int sisi2) {
        super(sisi1, sisi2);
    }
    
    public double getLuasLayang(){
        diagonal1 = sisi1;
        diagonal2 = sisi2;
        return 0.5*diagonal1*diagonal2;
    }
    
    public int getKelilingLayang(){
        return 2*(sisi1+sisi2);
    }
    
    public String toString(){
        String print = super.toString();
        return print += "Layang-layang/Ketupat\nLuas : "+getLuasLayang()+"\nKeliling : "+getKelilingLayang();
    }
}
