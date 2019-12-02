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
public class TestBackendBuku1841720004Bella {
    public static void main(String[] args) {
        Kategori1841720004Bella novel = new Kategori1841720004Bella().getByIdBella(6);
        Kategori1841720004Bella referensi = new Kategori1841720004Bella().getByIdBella(7);
        
        Buku1841720004Bella buku1 = new Buku1841720004Bella(novel, "Timun Mas", "Elex Media", "Bang Supit");
        Buku1841720004Bella buku2 = new Buku1841720004Bella(referensi, "Metode Linier", "Springer", "Alex Baldwin");
        Buku1841720004Bella buku3 = new Buku1841720004Bella(novel, "Bintang Terang", "Erlangga", "Mat Sewoot");
        
        // test insert
        buku1.saveBella();
        buku2.saveBella();
        // test update
        buku2.setMjudulBella("Aljabar Linier");
        buku2.saveBella();
        // test delete
        buku3.deleteBella();
        // test select all
        for(Buku1841720004Bella b : new Buku1841720004Bella().getAllBella())
        {
            System.out.println("Kategori: " + b.getmKategoriBella().getmNamaBella()+ ", Judul: " + b.getMjudulBella());
        }
        // test search
        for(Buku1841720004Bella b : new Buku1841720004Bella().searchBella("timun"))
        {
            System.out.println("Kategori: " + b.getmKategoriBella().getmNamaBella()+ ", Judul: " + b.getMjudulBella());
        }
    }
}
