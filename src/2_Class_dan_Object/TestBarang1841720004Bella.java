/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perusahaan;

/**
 *
 * @author bella
 */
public class TestBarang1841720004Bella {
    public static void main(String[] args) {
        Barang1841720004Bella brg1 = new Barang1841720004Bella();
        
        brg1.namaBarang = "Pensil";
        brg1.jenisBarang = "ATK";
        brg1.stok = 10;
        brg1.tampilBarangBella();
        //menampilkan dan mengisi argumen untuk menambahkan stok barang
        System.out.println("Stok baru adalah: " + brg1.tambahStokBella(20));
    }
}
