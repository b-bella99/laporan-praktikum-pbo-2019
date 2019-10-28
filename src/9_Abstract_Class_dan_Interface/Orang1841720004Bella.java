/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bella.absinterf.abstractclass;

/**
 *
 * @author bella
 */
public class Orang1841720004Bella {
    private String mNama;
    private Hewan1841720004Bella mHewanPeliharaan;

    public Orang1841720004Bella(String mNama) {
        this.mNama = mNama;
    }
    
    public void peliharaHewanBella(Hewan1841720004Bella hewanPeliharaan){
        this.mHewanPeliharaan = hewanPeliharaan;
    }
    
    public void ajakPeliharaanJalanJalanBella(){
        System.out.println("Namaku " + this.mNama);
        System.out.println("Hewan perliharaan berjalan dengan cara: ");
        this.mHewanPeliharaan.bergerakBella();
        System.out.println("----------------------------------------");
    }
}
