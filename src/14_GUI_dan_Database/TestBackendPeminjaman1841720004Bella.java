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
public class TestBackendPeminjaman1841720004Bella {
    public static void main(String[] args) {
        Anggota1841720004Bella ang = new Anggota1841720004Bella().getByIdBella(2);
        Anggota1841720004Bella ang2 = new Anggota1841720004Bella().getByIdBella(3);
        
        Buku1841720004Bella buku1 = new Buku1841720004Bella().getByIdBella(13);
        Buku1841720004Bella buku2 = new Buku1841720004Bella().getByIdBella(14);
        
        Peminjaman1841720004Bella pem = new Peminjaman1841720004Bella(ang, buku1, "2019/11/29", "2019/12/2");
        Peminjaman1841720004Bella pem2 = new Peminjaman1841720004Bella(ang2, buku2, "2019/11/30", "2019/12/3");
        Peminjaman1841720004Bella pem3 = new Peminjaman1841720004Bella(ang2, buku1, "2019/11/30", "2019/12/3");
        
        // test insert
        pem.saveBella();
        //pem2.saveBella();
        //pem3.saveBella();
        
        // test update
        pem2.setmTanggalKembaliBella("2019/12/4");
        pem2.saveBella();
        
         // test delete
        pem3.deleteBella();
        
        // test select all
        for(Peminjaman1841720004Bella p : new Peminjaman1841720004Bella().getAllBella())
        {
            System.out.println("Nama Anggota: " + p.getmAnggotaBella().getmNamaBella() + ", Judul Buku: " + p.getmBukuBella().getMjudulBella() + ", Tanggal Pinjaam: " + p.getmTanggalPinjamBella() + ", Tanggal Kembali: " + p.getmTanggalKembaliBella());
        }
    }
}
