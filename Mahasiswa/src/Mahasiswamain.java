/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author niswa
 */
public class Mahasiswamain {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Mahasiswa m1;
    Mahasiswa m2;
        m1 = new Mahasiswa();
        m2 = new Mahasiswa();

        m1.setNilai("Rendi Putra Prasojo","laki-Laki","Hukum","Malang");  
        m2.setNilai("Wulan Dwi Jayanti","Perempuan","Ilmu Komputer","Pasuruan");  
        m1.cetak();
        m2.cetak();    
    }
    
}
