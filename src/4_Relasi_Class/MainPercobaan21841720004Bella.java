/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bella.relasiclass.percobaan2;

/**
 *
 * @author bella
 */
public class MainPercobaan21841720004Bella {
    public static void main(String[] args) {
        Mobil1841720004Bella m = new Mobil1841720004Bella();
        m.setmNamaBell("Avanza");
        m.setmBiayaBell(350000);
        Sopir1841720004Bella s = new Sopir1841720004Bella();
        s.setmNamaBella("John Doe");
        s.setmBiayaBella(200000);
        Pelanggan1841720004Bella p = new Pelanggan1841720004Bella();
        p.setmNamaBella("Jane Doe");
        p.setmMobilBella(m);
        p.setmSopirBella(s);
        p.setHariBella(2);
        System.out.println("Biaya Total = " + p.hitungBiayaTotalBella());
    }
}
