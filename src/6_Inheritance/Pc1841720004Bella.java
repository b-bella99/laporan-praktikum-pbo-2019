/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bella.inheritance.tugas;

/**
 *
 * @author bella
 */
public class Pc1841720004Bella extends Komputer1841720004Bella{
    public int ukuranMonitor;

    public Pc1841720004Bella() {
    }

    public Pc1841720004Bella(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, int ukuranMonitor) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.ukuranMonitor = ukuranMonitor;
    }
    
    public void tampilPcBella(){
        System.out.println("================Data PC=================");
        super.tampilDataBella();
        System.out.println("Ukuran Monitor      = " + ukuranMonitor);
    }
}
