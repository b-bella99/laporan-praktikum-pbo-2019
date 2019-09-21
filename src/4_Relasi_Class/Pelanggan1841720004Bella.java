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
public class Pelanggan1841720004Bella {
    private String mNama;
    private Mobil1841720004Bella mMobil;
    private Sopir1841720004Bella mSopir;
    private int hari;

    public Pelanggan1841720004Bella() {
    }

    public String getmNamaBella() {
        return mNama;
    }

    public void setmNamaBella(String mNama) {
        this.mNama = mNama;
    }

    public Mobil1841720004Bella getmMobilBella() {
        return mMobil;
    }

    public void setmMobilBella(Mobil1841720004Bella mMobil) {
        this.mMobil = mMobil;
    }

    public Sopir1841720004Bella getmSopirBella() {
        return mSopir;
    }

    public void setmSopirBella(Sopir1841720004Bella mSopir) {
        this.mSopir = mSopir;
    }

    public int getHariBella() {
        return hari;
    }

    public void setHariBella(int hari) {
        this.hari = hari;
    }
    
    public int hitungBiayaTotalBella(){
        return mMobil.hitungBiayaMobilBella(hari) + 
                mSopir.hitungBiayaSopirBella(hari);
    }
}
