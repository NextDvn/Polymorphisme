/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;

/**
 *
 * @author grand
 */
public class Pembayaran3 {
    public int hitungGaji(Pegawai3 peg){
        int uang=peg.gaji();
        if(peg instanceof Direktur3)
        uang+=((Direktur3)peg).tunjangan();
        if(peg instanceof Staf3)
        uang+=((Staf3)peg).bonus(); 
        return uang;
    }
    public static void main(String[] args) {
        Pembayaran3 pg = new Pembayaran3();
        Staf3 ali = new Staf3();
        Direktur3 tony = new Direktur3();
        System.out.println("Gaji Staf: "+pg.hitungGaji(ali));
        System.out.println("Gaji Direktur: "+pg.hitungGaji(tony));
    }
}
