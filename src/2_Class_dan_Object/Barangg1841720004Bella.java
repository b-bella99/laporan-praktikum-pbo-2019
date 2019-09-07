/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan;

/**
 *
 * @author bella
 */
public class Barangg1841720004Bella {
    public static String skode;
    public static String snamaBarang;
    public static int shargaDasar;
    public static float sdiskon;
    
    public static int hitungHargaJualBella(){
        int hargaJual = (int) (shargaDasar - (sdiskon * shargaDasar));
        return hargaJual;
    }
    
    public static void tampilDataBella(){
        System.out.println("Kode barang : " + skode);
        System.out.println("Nama barang : " + snamaBarang);
        System.out.println("Harga dasar : " + shargaDasar);
        System.out.println("Diskon      : " + sdiskon);
        System.out.println("Harga jual  : " + hitungHargaJualBella());
    }
    
    public static void main(String[] args) {
        skode = "B0001";
        snamaBarang = "Beng beng";
        shargaDasar = 40000;
        sdiskon = (float) 0.3;
        tampilDataBella();
    }
}
