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
public class StaffHarian1841720004Bellas extends Staff1841720004Bellas{
    public int jmlJamKerja;

    public StaffHarian1841720004Bellas() {
    }

    public StaffHarian1841720004Bellas(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan, int jmlJamKerja) {
        super(nama, alamat, jk, umur, gaji, lembur, potongan);
        this.jmlJamKerja = jmlJamKerja;
    }
    
    public void tampilStaffHarianBella(){
        System.out.println("==============Data Staff Harian===============");
        super.tampilDataStaffBella();
        System.out.println("Jumlah Jam Kerja= " + jmlJamKerja);
        System.out.println("Gaji Bersih     = " + (gaji + jmlJamKerja + lembur - potongan));
    }
}
