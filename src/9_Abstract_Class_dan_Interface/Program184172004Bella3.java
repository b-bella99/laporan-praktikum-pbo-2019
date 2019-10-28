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
public class Program184172004Bella3 {
    public static void main(String[] args) {
        Rektor1841720004Bella pakRektor = new Rektor1841720004Bella();
        
        //Mahasiswa1841720004Bella mahasiswaBiasa = new Mahasiswa1841720004Bella("Charlie");
        Sarjana1841720004Bella sarjanaCumlaude = new Sarjana1841720004Bella("Dini");
        PascaSarjana1841720004Bella masterCumlaude = new PascaSarjana1841720004Bella("Elok");
        
        //pakRektor.berSertifikatCumlaudeBella(sarjanaCumlaude);
        //pakRektor.berSertifikatCumlaudeBella(masterCumlaude);
        
        //pakRektor.beriSertifikatMawapresBella(sarjanaCumlaude);
        pakRektor.beriSertifikatMawapresBella(masterCumlaude);
    }
}
        