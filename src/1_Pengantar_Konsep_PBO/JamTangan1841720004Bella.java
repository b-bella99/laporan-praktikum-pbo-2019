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
public class JamTangan1841720004Bella extends Jam1841720004Bella{
    private double mjari;
    
    public void setJariBella(double vslue){
        mjari = vslue;
    }
    
    public void statusJamBella(){
        super.statusBella();
        System.out.println("Jari-jari: " + mjari);
    }
}
