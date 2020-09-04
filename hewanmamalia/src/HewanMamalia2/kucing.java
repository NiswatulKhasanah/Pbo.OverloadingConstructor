/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HewanMamalia2;

/**
 *
 * @author niswa
 */
public class kucing {
    String jenishewan;
    String hidup;
    
     kucing (String jh, String hp) {
        this.jenishewan = jh;
        this.hidup = hp;
        
        System.out.println("Hewan Mamalia");
    }
       void warnakulit(){
           System.out.println("Kucing Memiliki beraneka macam warna Kulit seperti Putih,Orange,Hitam,Belang,Coklat dll");
       }    
       void tampildata(){
           System.out.println("Kucing merupakan salah satu jenis hewan :" +this.jenishewan);
           System.out.println("Kucing hidup :" +this.hidup);
       }
}
