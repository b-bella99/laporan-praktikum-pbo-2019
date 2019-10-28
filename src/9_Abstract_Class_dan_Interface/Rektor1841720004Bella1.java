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
public class Rektor1841720004Bella1 {
    Sarjana1841720004Bella sar;
    PascaSarjana1841720004Bella3 pas;
    
    public void berSertifikatCumlaudeBella(ICumlaude1841720004Bella mahasiswa, Mahasiswa1841720004Bella nama){
        System.out.println("Saya REKTOR, memberikan sertifikan cumlaude.");
        System.out.println("Selamat! silahkan perkenalkan diri Anda..");
        
        nama.kuliahDiKampusBella();
        mahasiswa.lulusBella();
        mahasiswa.meraihIPKTinggiBella();
        
        System.out.println("--------------------------------------------");
    }
}
