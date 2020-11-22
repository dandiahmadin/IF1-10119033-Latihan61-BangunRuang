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
 * Deskripsi Program : Program ini berisi class Kerucut yang merupakan subclass dari class abstract 
 * BangunRuang (superclass)
 */
public class Kerucut extends BangunRuang {
    private double t; // tinggi

    public Kerucut(double r, double t){
        super(r);
        this.t = t;
    }

    public double getT() {
        return t;
    }

    @Override
    public double hitungVolume() {
        return (Math.PI * Math.pow(super.getR(), 2) * t) / 3;
    }

    @Override
    public void tampilVolume() {
        System.out.println("Bangun Ruang Kerucut");
        super.tampilVolume(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
