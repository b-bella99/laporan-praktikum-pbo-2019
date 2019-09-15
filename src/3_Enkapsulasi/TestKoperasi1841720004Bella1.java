/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koperasi;

/**
 *
 * @author bella
 */
public class TestKoperasi1841720004Bella1 {
    public static void main(String[] args){
        AnggotaKoperasi1841720004Bella1 donny = new AnggotaKoperasi1841720004Bella1("111333444", "Donny", 5000000);
        
        System.out.println("Nama Anggota    : " + donny.getMnamaBella());
        System.out.println("Limit Pinjaman  : " + donny.getMlmtPinjamanBella());
        
        System.out.println("\nMeminjam uang 10.000.000...");
        donny.pinjamBella(10000000);
        
        System.out.println("\nMeminjam uang 4.000.000...");
        donny.pinjamBella(4000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getMjmlPinjamanBella());
        
        System.out.println("\nMembayar angsuran 3.000");
        donny.angsurBella(3000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getMjmlPinjamanBella());
        
        System.out.println("\nMembayar angsuran 3.000.000");
        donny.angsurBella(3000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getMjmlPinjamanBella());
    }
}
