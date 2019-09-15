/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koperasigettersetter;

/**
 *
 * @author bella
 */
public class KoperasiDemo1841720004Bella {
    public static void main(String[] args) {
        Anggota1841720004Bella anggota1 = new Anggota1841720004Bella();
        
        anggota1.setMnamaBella("Iwan Setiawan");
        anggota1.setMalamatBella("Jalan Sukarno Hatta no18");
        anggota1.setorBella(100000);
        System.out.println("Simpanan " + anggota1.getMnamaBella() + " : Rp " + anggota1.getMsimpananBella());
        
        anggota1.pinjamBella(5000);
        System.out.println("Simpanan " + anggota1.getMnamaBella() + " : Rp " + anggota1.getMsimpananBella());
    }
}
