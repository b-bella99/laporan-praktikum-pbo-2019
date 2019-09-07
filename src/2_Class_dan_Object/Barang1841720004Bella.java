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
public class Barang1841720004Bella {
    public String namaBarang;
    public String jenisBarang;
    public int stok;
    
    public void tampilBarangBella(){
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Jenis Barang: " + jenisBarang);
        System.out.println("Stok: " + stok);
    }
    
    //method dengan argumen dan ilai balik (return)
    public int tambahStokBella(int brgMasukBella){
        int stokBaruBella = brgMasukBella;
        return stokBaruBella;
    }
}
