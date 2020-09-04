/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HewanMamalia2;

import static java.lang.reflect.Array.get;

/**
 *
 * @author niswa
 */
public class hewanmamalia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        kucing kKucing = new kucing("Veberta atau menyusui","Di darat");
        kKucing.warnakulit();
        kKucing.tampildata();
        System.out.println("");
        
        hewan hwn = new hewan();
        hwn.setNamahewan("Kucing ");
        hwn.setJumlahkaki(4);
        hwn.setNafas ("Paru-Paru");
        
         
        System.out.println("Nama hewan :"+hwn.getNamahewan());
        int jumlahkaki = hwn.getJumlahkaki();
        System.out.println("Kucing berkaki :"+hwn.getJumlahkaki());
        String nafas = hwn.getNafas();
        System.out.println("Kucing bernafas menggunakan :"+hwn.getNafas());
    }
    
}
