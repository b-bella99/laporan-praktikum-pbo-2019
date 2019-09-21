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
public class Gerbong1841720004Bella1 {
    private String mKode;
    private Kursi1841720004Bella[] mArrayKursi;
    private int mNomorBaru;

    public Gerbong1841720004Bella1(String mKode, int jumlah) {
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

    public void setmNomorBaru(int mNomorBaru) {
        this.mNomorBaru = mNomorBaru;
    }

    public Kursi1841720004Bella[] getmArrayKursiBella() {
        return mArrayKursi;
    }

    public void setPenumpangBella(Penumpang1841720004Bella penumpang, int nomor) {
            if(this.mArrayKursi[nomor-1].getmPenumpangBella() == null){
                this.mArrayKursi[nomor - 1].setmPenumpangBella(penumpang);
            }
            else{
                System.out.println("Maaf, kursi yang Anda pilih sudah ada yang menempati,\nSilahkan pilih kursi lain.");
            }
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
