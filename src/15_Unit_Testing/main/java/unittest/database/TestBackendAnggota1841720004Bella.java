/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.database;

/**
 *
 * @author bella
 */


public class TestBackendAnggota1841720004Bella {
    public static void main(String[] args) {
        Anggota1841720004Bella ang1 = new Anggota1841720004Bella("Sasa", "Malang", "09871234567");
        Anggota1841720004Bella ang2 = new Anggota1841720004Bella("Sisil", "Surabaya", "09678097");
        Anggota1841720004Bella ang3 = new Anggota1841720004Bella("Danang", "Jember", "095438900");
        
        //test insert
        ang1.saveBella();
        ang2.saveBella();
        ang3.saveBella();
        
        //test update
        ang2.setmAlamatBella("Madura");
        ang2.saveBella();
        
        //test delete
        ang3.deleteBella();
        
        //test select all
        for(Anggota1841720004Bella a : new Anggota1841720004Bella().getAllBella()){
            System.out.println("Nama: " + a.getmNamaBella() + ", Alamat: " + a.getmAlamatBella() + ", Telepon: " + a.getmTeleponBella());
        }
        
        //test search
        for(Anggota1841720004Bella a : new Anggota1841720004Bella().searchBella("ilmiah")){
            System.out.println("Nama: " + a.getmNamaBella() + ", Alamat: " + a.getmAlamatBella() + ", Telepon: " + a.getmTeleponBella());
        }
    }
}
