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
public class Laptop1841720004Bella extends Komputer1841720004Bella{
    public String jnsBaterai;

    public Laptop1841720004Bella() {
    }

    public Laptop1841720004Bella(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.jnsBaterai = jnsBaterai;
    }
    
    public void tampilLaptopBella(){
        super.tampilDataBella();
        System.out.println("Jenis Baterai       = " + jnsBaterai);
    }
}
