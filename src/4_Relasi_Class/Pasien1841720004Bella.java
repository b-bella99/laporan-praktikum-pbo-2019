/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bella.relasiclass.tugas;

/**
 *
 * @author bella
 */
public class Pasien1841720004Bella {
    private String mNama;
    private String mJk;
    private String mSakit;
    private RumahSakit1841720004Bella mRs;
    private Ruangan1841720004Bella mRuang;
    private Dokter1841720004Bella mDokter;

    public Pasien1841720004Bella() {
    }

    public Pasien1841720004Bella(String mNama, String mJk, String mSakit, RumahSakit1841720004Bella mRs, Ruangan1841720004Bella mRuang, Dokter1841720004Bella mDokter) {
        this.mNama = mNama;
        this.mJk = mJk;
        this.mSakit = mSakit;
        this.mRs = mRs;
        this.mRuang = mRuang;
        this.mDokter = mDokter;
    }

    public String getmNamaBella() {
        return mNama;
    }

    public void setmNamaBella(String mNama) {
        this.mNama = mNama;
    }

    public String getmJkBella() {
        return mJk;
    }

    public void setmJkBella(String mJk) {
        this.mJk = mJk;
    }

    public String getmSakitBella() {
        return mSakit;
    }

    public void setmSakitBella(String mSakit) {
        this.mSakit = mSakit;
    }

    public RumahSakit1841720004Bella getmRsBella() {
        return mRs;
    }

    public void setmRsBella(RumahSakit1841720004Bella mRs) {
        this.mRs = mRs;
    }

    public Ruangan1841720004Bella getmRuangBella() {
        return mRuang;
    }

    public void setmRuangBella(Ruangan1841720004Bella mRuang) {
        this.mRuang = mRuang;
    }

    public Dokter1841720004Bella getmDokterBella() {
        return mDokter;
    }

    public void setmDokterBella(Dokter1841720004Bella mDokter) {
        this.mDokter = mDokter;
    }
    
    public String infoBella(){
        String info = "";
        info += "Rumah Sakit: " + this.mRs.infoBella() + "\n";
        info += "Nama Pasien: " + this.mNama + "\n";
        info += "Jenis Kelamin: " + this.mJk + "\n";
        info += "Sakit: " + this.mSakit + "\n";
        info += "Ruangan: " + this.mRuang.infoBella() + "\n";
        info += "Dokter: " + this.mDokter.infoBella() + "\n";
        return info;
    }
}
