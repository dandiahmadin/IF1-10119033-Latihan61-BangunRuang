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
 * Deskripsi Program : Program ini berisi menghitung volume bangun ruang dengan pendekatan object oriented
 * dan penerapan konsep pewarisan, abstract
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BangunRuang bola = new Bola(7);
        bola.tampilVolume();
        
        BangunRuang tabung = new Tabung(10, 21);
        tabung.tampilVolume();
        
        BangunRuang kerucut = new Kerucut(14, 9);
        kerucut.tampilVolume();
    }
    
}
