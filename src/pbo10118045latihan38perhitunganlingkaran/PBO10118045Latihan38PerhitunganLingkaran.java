/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan38perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama     :   Muhammad Ilham Apriyadi
 * Kelas    :   IF 2
 * NIM      :   10118045
 * Deskripsi Program : program hitung lingkaran
 */
public class PBO10118045Latihan38PerhitunganLingkaran {

    /**
     * @return 
     */
    public static int inputDiameter(){
        int diameter = 0;
        System.out.println("======Perhitungan Lingkaran=====");
        Scanner scanner = new Scanner(System.in);
        boolean diameterHasValue = false;
        do {
            System.out.print("Masukkan nilai diameter lingkaran: ");
            if (scanner.hasNextInt()) {
                diameter = scanner.nextInt();
                diameterHasValue = true;
            }
            else System.out.println("Nilai Diameter Tidak Sesuai\n");
        } while(!diameterHasValue);
        return diameter;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Lingkaran lingkaran = new Lingkaran();
        int diameter = inputDiameter();
        lingkaran.setDiameter(diameter);
        lingkaran.tampilHasil();
    }
    
}
