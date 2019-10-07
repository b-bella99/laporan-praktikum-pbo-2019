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
public class Mac1841720004Bella  extends Laptop1841720004Bella{
    public String security;

    public Mac1841720004Bella() {
    }

    public Mac1841720004Bella(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai, String security) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBaterai);
        this.security = security;
    }
    
    public void tampilMacBella(){
        System.out.println("================Data Mac=================");
        super.tampilLaptopBella();
        System.out.println("Security            = " + security);
    }
}
