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
public class Sopir1841720004Bella {
    private String mNama;
    private int mBiaya;

    public Sopir1841720004Bella() {
    }

    public String getmNamaBella() {
        return mNama;
    }

    public void setmNamaBella(String mNama) {
        this.mNama = mNama;
    }

    public int getmBiayaBella() {
        return mBiaya;
    }

    public void setmBiayaBella(int mBiaya) {
        this.mBiaya = mBiaya;
    }
    
    public int hitungBiayaSopirBella(int hari){
        return mBiaya * hari;
    }
}
