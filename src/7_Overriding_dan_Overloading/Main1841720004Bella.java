/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bella.overridingload.tugas;

/**
 *
 * @author bella
 */
public class Main1841720004Bella {
    public static void main(String[] args) {
        Manusia1841720004Bella man = new Manusia1841720004Bella();
        Dosen1841720004Bella dos = new Dosen1841720004Bella();
        Mahasiswa1841720004Bella mah = new Mahasiswa1841720004Bella();
        
        man.bernafasBella();
        man.makanBella();
        dos.lemburBella();;
        man = dos;
        man.makanBella();
        mah.tidurBella();
        man = mah;
        man.makanBella();
    }
}
