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
public class Mahasiswa1841720004Bella {
    protected String mNama;

    public Mahasiswa1841720004Bella(String mNama) {
        this.mNama = mNama;
    }
    
    public void kuliahDiKampusBella(){
        System.out.println("Aku mahasiswa, namaku " + this.mNama);
        System.out.println("Aku berkuliah di kampus.");
    }
}
