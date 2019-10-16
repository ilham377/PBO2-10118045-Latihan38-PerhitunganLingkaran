/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan38perhitunganlingkaran;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author Ilham
 */
public class Lingkaran {
    private int diameter;
    private double jariJari,luas,keliling;

    public void setDiameter(int diameter) {
        this.diameter = diameter;
        setAll();
    }
    
    private double hitungJarijari(){
        return diameter/2;
    }
    
    private double hitungLuas(){
        return Math.PI * (jariJari*jariJari);
    }
    
    private double hitungKeliling(){
        return 2*(Math.PI*jariJari);
    }
    
    private void setAll(){
        jariJari = hitungJarijari();
        luas = hitungLuas();
        keliling = hitungKeliling();        
    }
    public void tampilHasil(){
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator(',');
        
        DecimalFormat df = new DecimalFormat("###0.##", symbols);
        
        System.out.println("\n======Hasil Perhitungan Lingkaran======");
        System.out.println("Jari-jari Lingkaran = " + df.format(jariJari) + " cm");
        System.out.println("Luas Lingkaran = " + df.format(luas) + " cm");
        System.out.println("Keliling Lingkaran = " + df.format(keliling) + " cm");
    }
}
