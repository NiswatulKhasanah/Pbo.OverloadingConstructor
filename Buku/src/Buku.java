/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author niswa
 */
public class Buku {
    
    String judul;
    String pengarang;
    String penerbit;
    String tebal;
    int tahunTerbit;
    
   
    public Buku(String judul, String pengarang, String  penerbit, String tebal){
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tebal = tebal;
    }
    public Buku(String judul, String pengarang, String penerbit, String tebal ,int tahunTerbit){
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
        this.tebal = tebal;
    }
    public void infoBuku(){
        System.out.println("Judul : "+judul);
        System.out.println("Pengarang : "+pengarang);
        System.out.println("Penerbit :" +penerbit);
        System.out.println("Tahun Terbit : "+tahunTerbit);
        System.out.println("Tebal :" +tebal + "\n");
    
    }
}
