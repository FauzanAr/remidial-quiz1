/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ojan
 */
public class Ketupat {
    public LayangLayang Layang;
    
    public Ketupat (LayangLayang Layang){
        this.Layang = Layang;
    }
    
    public double getLuasKetupat(){
        return Layang.getLuasLayang();
    }
    
    public int getKelilingKetupat(){
        return Layang.getKelilingLayang();
    }
    
    public String toString(){
        return Layang.toString();
    }
}
