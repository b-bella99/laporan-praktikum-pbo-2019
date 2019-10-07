/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bella.inheritance.percobaan6;

/**
 *
 * @author bella
 */
public class Staff1841720004Bellas extends Karyawan1841720004Bellas{
    public int lembur, potongan;

    public Staff1841720004Bellas() {
    }

    public Staff1841720004Bellas(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan) {
        super(nama, alamat, jk, umur, gaji);
        this.lembur = lembur;
        this.potongan = potongan;
    }
    
    public void tampilDataStaffBella(){
        super.tampilDataKaryawanBella();
        System.out.println("Lembur          = " + lembur);
        System.out.println("Potongan        = " + potongan);
        System.out.println("Total gaji      = " + (gaji + lembur - potongan));
    }
}
