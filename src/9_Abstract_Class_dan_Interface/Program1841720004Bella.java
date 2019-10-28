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
public class Program1841720004Bella {
    public static void main(String[] args) {
        Kucing1841720004Bella kucingKampung = new Kucing1841720004Bella();
        Ikan1841720004Bella lumbalumba = new Ikan1841720004Bella();
        
        Orang1841720004Bella ani = new Orang1841720004Bella("Ani");
        Orang1841720004Bella budi = new Orang1841720004Bella("Budi");
        
        ani.peliharaHewanBella(kucingKampung);
        budi.peliharaHewanBella(lumbalumba);
        
        ani.ajakPeliharaanJalanJalanBella();
        budi.ajakPeliharaanJalanJalanBella();
    }
}
