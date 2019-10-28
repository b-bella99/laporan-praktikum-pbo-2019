/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bella.absinterf.interfacelatihan;

/**
 *
 * @author bella
 */
public class Rektor1841720004Bella {
    public void berSertifikatCumlaudeBella(ICumlaude1841720004Bella mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikan cumlaude.");
        System.out.println("Selamat! silahkan perkenalkan diri Anda..");
        
        mahasiswa.lulusBella();
        mahasiswa.meraihIPKTinggiBella();
        
        System.out.println("--------------------------------------------");
    }
}
