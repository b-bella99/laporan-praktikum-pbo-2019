/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bella.relasiclass.percobaan2;

/**
 *
 * @author bella
 */
public class Mobil1841720004Bella {
    private String mNama;
    private int mBiaya;

    public Mobil1841720004Bella() {
    }

    public String getmNamaBell() {
        return mNama;
    }

    public void setmNamaBell(String mNama) {
        this.mNama = mNama;
    }

    public int getmBiayaBell() {
        return mBiaya;
    }

    public void setmBiayaBell(int mBiaya) {
        this.mBiaya = mBiaya;
    }
    
    public int hitungBiayaMobilBella(int hari){
        return mBiaya * hari;
    }
}
