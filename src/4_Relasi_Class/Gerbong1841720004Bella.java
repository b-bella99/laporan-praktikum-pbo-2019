/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bella.relasiclass.percobaan4;

/**
 *
 * @author bella
 */
public class Gerbong1841720004Bella {
    private String mKode;
    private Kursi1841720004Bella[] mArrayKursi;

    public Gerbong1841720004Bella(String mKode, int jumlah) {
        this.mKode = mKode;
        this.mArrayKursi = new Kursi1841720004Bella[jumlah];
        this.initKursiBella();
    }
    
    private void initKursiBella() {
        for (int i = 0; i < mArrayKursi.length; i++) {
            this.mArrayKursi[i] = new Kursi1841720004Bella(String.valueOf(i + 1));
        }
    }

    public String getmKodeBella() {
        return mKode;
    }

    public void setmKodeBella(String mKode) {
        this.mKode = mKode;
    }

    public Kursi1841720004Bella[] getmArrayKursiBella() {
        return mArrayKursi;
    }

    public void setPenumpangBella(Penumpang1841720004Bella penumpang, int nomor) {
        this.mArrayKursi[nomor - 1].setmPenumpangBella(penumpang);
    }
    
    public String infoBella() {
        String info = "";
        info += "Kode: " + mKode + "\n";
        for (Kursi1841720004Bella kursi : mArrayKursi) {
            info += kursi.infoBella();
        }
    return info;
    }
}
