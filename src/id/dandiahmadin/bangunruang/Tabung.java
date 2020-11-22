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
 * Deskripsi Program : Program ini berisi class Tabung yang merupakan subclass dari class abstract 
 * BangunRuang (superclass)
 */
public class Tabung extends BangunRuang {
    private double h; // ketinggian
    public Tabung(double r, double h) {
        super(r);
        this.h = h;
    }

    public double getH() {
        return h;
    }

    @Override
    public double hitungVolume() {
        return Math.PI * Math.pow(super.getR(), 2) * h;
    }

    @Override
    public void tampilVolume() {
        System.out.println("Bangun Ruang Tabung");
        super.tampilVolume(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
