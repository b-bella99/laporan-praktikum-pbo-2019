/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bella.guidbs.frontend;

/**
 *
 * @author bella
 */

import bella.guidbs.backend.*;

public class TestBackend1841720004Bella {
    public static void main(String[] args) {
        Kategori1841720004Bella kat1 = new Kategori1841720004Bella("Novel", "Koleksi buku novel");
        Kategori1841720004Bella kat2 = new Kategori1841720004Bella("Referensi", "Buku referensi Ilmiah");
        Kategori1841720004Bella kat3 = new Kategori1841720004Bella("Komik", "Komik anak-anak");
        
        //test insert
        kat1.saveBella();
        kat2.saveBella();
        kat3.saveBella();
        
        //test update
        kat2.setmKeteranganBella("Koleksi buku referensi ilmiah");
        kat2.saveBella();
        
        //test delete
        kat3.deleteBella();
        
        //test select all
        for(Kategori1841720004Bella k : new Kategori1841720004Bella().getAllBella()){
            System.out.println("Nama: " + k.getmNamaBella() + ", Ket: " + k.getmKeteranganBella());
        }
        
        //test search
        for(Kategori1841720004Bella k : new Kategori1841720004Bella().searchBella("ilmiah")){
            System.out.println("Nama: " + k.getmNamaBella() + ", Ket: " + k.getmKeteranganBella());
        }
    }
}
