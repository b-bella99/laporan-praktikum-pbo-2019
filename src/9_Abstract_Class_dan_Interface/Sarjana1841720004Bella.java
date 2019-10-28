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
public class Sarjana1841720004Bella extends Mahasiswa1841720004Bella implements ICumlaude1841720004Bella{

    public Sarjana1841720004Bella(String mNama) {
        super(mNama);
    }

    @Override
    public void lulusBella() {
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }

    @Override
    public void meraihIPKTinggiBella() {
        System.out.println("IPK-ku lebih dari 3,51");
    }
    
}
