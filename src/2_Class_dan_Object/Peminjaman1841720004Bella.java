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
public class Peminjaman1841720004Bella {
    public int id;
    public String nama;
    public String namaGame;
    public int hargaBayar;
    public int lamaSewa;
    
    public void tmplDetailPmnjmnBella(){
        System.out.println("Id          : " + id);
        System.out.println("Nama        : " + nama);
        System.out.println("Nama game   : " + namaGame);
        System.out.println("lama sewa   : " + lamaSewa);
    }
    
    public int hargaBayarBella(int harga){
        return hargaBayar = harga * lamaSewa;
    }
}
