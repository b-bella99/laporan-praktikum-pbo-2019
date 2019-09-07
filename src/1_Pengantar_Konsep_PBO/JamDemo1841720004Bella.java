/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jam;

/**
 *
 * @author bella
 */
public class JamDemo1841720004Bella {
    public static void main(String[] args) {
        Jam1841720004Bella jm1 = new Jam1841720004Bella();
        Jam1841720004Bella jm2 = new Jam1841720004Bella();
        JamTangan1841720004Bella jm3 = new JamTangan1841720004Bella();
        
        jm1.setMerekBella("Daniel Wellington");
        jm1.setWaktuBella(23.25);
        jm1.setDiameterBella(32);
        jm1.setHargaBella(3500000);
        jm1.statusBella();
        
        jm2.setMerekBella("Casio G-Shock");
        jm2.setWaktuBella(23.31);
        jm2.setDiameterBella(45);
        jm2.setHargaBella(1016000);
        jm2.statusBella();
        
        jm3.setMerekBella("Victorinox Swiss Army");
        jm3.setWaktuBella(23.34);
        jm3.setDiameterBella(44);
        jm3.setHargaBella(11238000);
        jm3.setJariBella(22.00);
        jm3.statusJamBella();
    }
}
