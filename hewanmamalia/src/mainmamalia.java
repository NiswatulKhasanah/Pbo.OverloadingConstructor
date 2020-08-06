/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class mainmamalia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
    
    mamalia mama= new mamalia();
    panda papa  = new panda(); 
    
    System.out.println("Panda bernafas dengan :" + papa.nafas);  
    mama.nafas();
    
    System.out.println ("Panda adalah Salah satu Jenis Hewan :" +papa.jenishewan);
    mama.jenishewan();
    
    
    papa.warnakulit();
    
}
}
