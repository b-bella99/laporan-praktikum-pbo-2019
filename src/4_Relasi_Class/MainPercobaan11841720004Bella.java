/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bella.relasiclass.percobaan1;

/**
 *
 * @author bella
 */
public class MainPercobaan11841720004Bella {
    public static void main(String[] args) {
        Processor1841720004Bella p = new Processor1841720004Bella("Intel i5", 3);
        Laptop1841720004Bella L = new Laptop1841720004Bella("Thinkpad", p);
        
        L.infoBella();
        
        Processor1841720004Bella p1 = new Processor1841720004Bella();
        p1.setmMerkBella("Intel i5");
        p1.setmCacheBella(4);
        Laptop1841720004Bella L1 = new Laptop1841720004Bella();
        L1.setmMerkBella("Thinkpad");
        L1.setmProcBella(p1);
        L1.infoBella();
    }
}
