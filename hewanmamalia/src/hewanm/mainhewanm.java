/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hewanm;

/**
 *
 * @author niswa
 */
public class mainhewanm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    hewan hwn = new hewan();

        hwn.setNamahewan("Kucing");
        hwn.setNafas("Paru-Paru");
        hwn.setJenishewan("Veberta atau Menyusui");
        hwn.setHidup("Darat");

            System.out.println("Hewan : "+hwn.getNamahewan());
            System.out.println("Kucing bernafas menggunakan : "+hwn.getNafas());
            String jenishewan = hwn.getJenishewan();
            System.out.println("Kucing termasuk jenis hewan : "+hwn.getJenishewan());
            String hidup = hwn.getHidup();
            System.out.println("Kucing Hidup di : "+hwn.getHidup());
    }
    
}
