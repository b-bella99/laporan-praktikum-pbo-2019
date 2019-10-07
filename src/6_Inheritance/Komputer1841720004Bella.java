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
public class Komputer1841720004Bella {
    public String merk;
    public int kecProsesor;
    public int sizeMemory;
    public String jnsProsesor;

    public Komputer1841720004Bella() {
    }

    public Komputer1841720004Bella(String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        this.merk = merk;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
        this.jnsProsesor = jnsProsesor;
    }
    
    public void tampilDataBella(){
        System.out.println("Merk                = " + merk);
        System.out.println("Kecepatan prosesor  = " + kecProsesor);
        System.out.println("Size Memori         = " + sizeMemory);
        System.out.println("Jenis Prosesor      = " + jnsProsesor);
    }
}
