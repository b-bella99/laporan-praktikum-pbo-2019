/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bella.absinterf.percobaan3;

/**
 *
 * @author bella
 */
public class Rektor1841720004Bella3 {
    public void berSertifikatCumlaudeBella(ICumlaude1841720004Bella mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikan cumlaude.");
        System.out.println("Selamat! silahkan perkenalkan diri Anda..");
        
        mahasiswa.lulusBella();
        mahasiswa.meraihIPKTinggiBella();
        
        System.out.println("--------------------------------------------");
    }
    
    public void beriSertifikatMawapresBella(IBerprestasi1941720004Bella mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES.");
        System.out.println("Selamat! Bagaimana Anda bisa berprestasi?");
        
        mahasiswa.menjuaraiKompetisiBella();
        mahasiswa.membuatPublikasiIlmiahBella();
        
        System.out.println("---------------------------------------------");
    }
}
