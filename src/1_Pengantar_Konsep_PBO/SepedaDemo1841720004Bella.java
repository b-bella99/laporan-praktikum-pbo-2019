/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sepedademo;

/**
 *
 * @author bella
 */
public class SepedaDemo1841720004Bella {
    public static void main(String[] args){
        //Buat dua buah objek sepeda
        Sepeda1841720004Bella spd1 = new Sepeda1841720004Bella();
        Sepeda1841720004Bella spd2 = new Sepeda1841720004Bella();
        
        //Panggil method di dalam ibjek sepeda
        spd1.setMerekBella("Polygone");
        spd1.tambahKecepatanBella(10);
        spd1.gantiGearBella(2);
        spd1.cetakStatusBella();
        
        spd2.setMerekBella("Wiim Cycle");
        spd2.tambahKecepatanBella(10);
        spd2.gantiGearBella(2);
        spd2.tambahKecepatanBella(10);
        spd2.gantiGearBella(3);
        spd2.cetakStatusBella();
    }
}
