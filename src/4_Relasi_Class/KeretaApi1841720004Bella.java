/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bella.relasiclass.percobaan3;

/**
 *
 * @author bella
 */
public class KeretaApi1841720004Bella {
    private String mNama;
    private String mKelas;
    private Pegawai1841720004Bella mMasinis;
    private Pegawai1841720004Bella mAsisten;

    public KeretaApi1841720004Bella(String mNama, String mKelas, Pegawai1841720004Bella mMasinis) {
        this.mNama = mNama;
        this.mKelas = mKelas;
        this.mMasinis = mMasinis;
    }

    public KeretaApi1841720004Bella(String mNama, String mKelas, Pegawai1841720004Bella mMasinis, Pegawai1841720004Bella mAsisten) {
        this.mNama = mNama;
        this.mKelas = mKelas;
        this.mMasinis = mMasinis;
        this.mAsisten = mAsisten;
    }

    public String getmNamaBella() {
        return mNama;
    }

    public void setmNamaBella(String mNama) {
        this.mNama = mNama;
    }

    public String getmKelasBella() {
        return mKelas;
    }

    public void setmKelasBella(String mKelas) {
        this.mKelas = mKelas;
    }

    public Pegawai1841720004Bella getmMasinisBella() {
        return mMasinis;
    }

    public void setmMasinisBella(Pegawai1841720004Bella mMasinis) {
        this.mMasinis = mMasinis;
    }

    public Pegawai1841720004Bella getmAsistenBella() {
        return mAsisten;
    }

    public void setmAsistenBella(Pegawai1841720004Bella mAsisten) {
        this.mAsisten = mAsisten;
    }
    
    public String infoBella() {
        String info = "";
        info += "Nama: " + this.mNama + "\n";
        info += "Kelas: " + this.mKelas + "\n";
        info += "Masinis: " + this.mMasinis.infoBella() + "\n";
        info += "Asisten: " + this.mAsisten.infoBella() + "\n";
        return info;
    }
}
