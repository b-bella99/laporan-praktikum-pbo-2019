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
public class Staff1841720004Bella extends Karyawan1841720004Bella{
    public int lembur, potongan;

    public Staff1841720004Bella() {
    }

    public Staff1841720004Bella(int lembur, int potongan, String nama, String alamat, String jk, int umur, int gaji) {
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
