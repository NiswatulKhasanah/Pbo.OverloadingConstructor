/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResensiBuku;

/**
 *
 * @author niswa
 */
public class MainBuku {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Buku buku1 = new Buku("The BFG, Raksasa Besar yang Baik","Roald Dahl","Gramedia Pustaka Utama","216 halaman",2013);
        Buku buku2 = new Buku("Mata Yang Enak Dipandang","Ahmad Tohari","Gramedia Pustaka Utama (GPU)","200 halaman",2010);
        buku1.infoBuku();
        buku2.infoBuku();
    }
    
}
