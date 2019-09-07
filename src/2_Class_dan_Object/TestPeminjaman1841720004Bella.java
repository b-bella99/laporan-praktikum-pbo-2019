/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persewaangame;

/**
 *
 * @author bella
 */
public class TestPeminjaman1841720004Bella {
    public static void main(String[] args) {
        Peminjaman1841720004Bella pm1 = new Peminjaman1841720004Bella();
        
        pm1.id = 0001;
        pm1.nama = "Surya";
        pm1.namaGame = "Grand Theft Auto V";
        pm1.lamaSewa = 3;
        pm1.tmplDetailPmnjmnBella();
        
        System.out.println("Harga yang harus dibayar: " + pm1.hargaBayarBella(25000));
    }
}
