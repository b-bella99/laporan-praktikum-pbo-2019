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
public class Inheritance11841720004Bella {
    public static void main(String[] args) {
        Manajer1841720004Bella M = new Manajer1841720004Bella();
        
        M.nama = "Vivin";
        M.alamat = "jl. Vinolia";
        M.umur = 25;
        M.jk = "Perempuan";
        M.gaji = 3000000;
        M.tunjangan = 1000000;
        M.tampilDataManagerBella();
        
        Staff1841720004Bella S = new Staff1841720004Bella();
        
        S.nama = "Lestari";
        S.alamat = "Malang";
        S.umur = 25;
        S.jk = "Perempuan";
        S.gaji = 2000000;
        S.lembur = 500000;
        S.potongan = 250000;
        S.tampilDataStaffBella();
    }
}
