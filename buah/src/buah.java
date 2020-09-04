/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class buah {
   String namabuah="";
   int jumlahbuah=0;
   
   public buah (String namabuah,int jumlahbuah){
       this.namabuah=namabuah;
       this.jumlahbuah=jumlahbuah;
   }
     public void info() {
         System.out.println("Nama Buah :" + this.namabuah + ",jumlahbuah :"+this.jumlahbuah  );
     }     
    
}
