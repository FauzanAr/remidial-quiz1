/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ojan
 */
public class Segitiga extends BangunDatar {
    private int jenis;
    
    //Ini constructor untuk segitiga siku siku
    public Segitiga(int sisi1, int sisi2, int sisi3,int jenis) {
        super(sisi1, sisi2, sisi3);
        this.jenis = jenis;
    }
    
    //Ini constructor untuk segitiga sama kaki
    public Segitiga(int sisi1, int sisi2, int jenis){
        super (sisi1, sisi2);
        this.jenis = jenis;
    }
    
    //Ini constructor untuk segitiga sama sisi
    public Segitiga (int sisi1, int jenis){
        super(sisi1);
        this.jenis = jenis;
    }
    
    public int getLuasSegitiga(){
        if (jenis == 1){
            return (int)0.5*sisi1*sisi2; //sisi3 tidak di ikutkan karena itu hanya untuk sisi miring dari segitiga siku2
        }else if (jenis == 2){
            int a_setengah = sisi1/2; //untuk mencari setengah dari alas yang nantinya akan di pitagoraskan untuk mencari sisi tinggi segitiga
            int t = (int)Math.sqrt((int)Math.pow(sisi2, 2)-(int)Math.pow(a_setengah, 2)); //Untuk mencari sisi tinggi dari segitiga sama kaki
            return (int)0.5*sisi1*t;
        }else if (jenis == 3){
            int a_setengah = sisi1/2; //untuk mencari setengah alas dari segitiga yang nantinya akan digunakan untuk mencari panjang sisi tinggi dari segitiga
            int t = (int)Math.sqrt((int)Math.pow(sisi1, 2)-(int)Math.pow(a_setengah, 2));// sama seperti code di atasnya
            return (int) 0.5 * sisi1 * t;
        }else
            return 0;
    }
    
    public int getKelilingSegitiga(){
        if (jenis == 1){
            return sisi1+sisi2+sisi3;
        }else if (jenis == 2){
            return sisi1+(sisi2*2);// mengapa hanya sisi 2 yang di kali 2 karena sisi 2 representasi dari sisi sama kaki yang ada di kanan maupun kiri
        }else if (jenis == 3){
            return sisi1*3;
        }else
            return 0;
    }
    
    public String toString(){
        String print = super.toString();
        if (jenis == 1){
            return print += "Segitiga Siku-siku\nLuas : "+getLuasSegitiga()+"\nKeliling : "+getKelilingSegitiga();
        }else if (jenis == 2){
            return print += "Segitiga Sama Kaki\nLuas : "+getLuasSegitiga()+"\nKeliling : "+getKelilingSegitiga();
        }else if (jenis == 3){
            return print += "Segitiga Sama Sisi\nLuas : "+getLuasSegitiga()+"\nKeliling : "+getKelilingSegitiga();
        }else
            return "";
    }
}
