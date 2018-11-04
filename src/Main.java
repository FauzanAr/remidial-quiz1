/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ojan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persegi p = new Persegi(4);
        PersegiPanjang pj = new PersegiPanjang (5,4);
        Segitiga sg_ss = new Segitiga (5,3);
        Segitiga sg_sk = new Segitiga (10,5,2);
        Segitiga sg_siku = new Segitiga (20,10,5,1);
        LayangLayang l = new LayangLayang (10,20);
        LayangLayang k = new LayangLayang (30,20);
        Ketupat kt = new Ketupat (k);
        System.out.println(p);
        System.out.println(pj);
        System.out.println(sg_ss);
        System.out.println(sg_sk);
        System.out.println(sg_siku);
        System.out.println(l);
        System.out.println(kt);
    }
    
}
