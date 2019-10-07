/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bella.inheritance.percobaan5;

/**
 *
 * @author bella
 */
public class Manajer1841720004Bella extends Karyawan1841720004Bella{
    public int tunjangan;

    public Manajer1841720004Bella() {
    }
    
    public void tampilDataManagerBella(){
        super.tampilDataKaryawanBella();
        System.out.println("Tunjangan       = " + tunjangan);
        System.out.println("Total gaji      = " + (super.gaji + tunjangan));
    }
}
