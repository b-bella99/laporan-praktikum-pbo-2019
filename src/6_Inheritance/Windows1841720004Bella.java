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
public class Windows1841720004Bella  extends Laptop1841720004Bella{
    public String fitur;

    public Windows1841720004Bella() {
    }

    public Windows1841720004Bella(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai, String fitur) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBaterai);
        this.fitur = fitur;
    }
    
    public void tampilWindowsBella(){
        System.out.println("================Data Windows=================");
        super.tampilLaptopBella();
        System.out.println("Fitur               = " + fitur);
    }
}
