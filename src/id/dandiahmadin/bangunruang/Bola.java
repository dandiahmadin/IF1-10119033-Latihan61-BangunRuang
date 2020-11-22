/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.dandiahmadin.bangunruang;

/**
 *
 * @author
 * NAMA     : Dandi Ahmadin
 * KELAS    : IF-1
 * NIM      : 10119033
 * Deskripsi Program : Program ini berisi class Bola yang merupakan subclass dari class abstract 
 * BangunRuang (superclass)
 */
public class Bola extends BangunRuang {
    public Bola(double r) {
        super(r);
    }

    @Override
    public double hitungVolume() {
        return (4 * Math.PI *Math.pow(super.getR(), 3)) / 3;
    }

    @Override
    public void tampilVolume() {
        System.out.println("Bangun Ruang Bola");
        super.tampilVolume(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
