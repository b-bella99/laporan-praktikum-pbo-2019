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
public class Penumpang1841720004Bella {
    private String mKtp;
    private String mNama;

    public Penumpang1841720004Bella(String mKtp, String mNama) {
        this.mKtp = mKtp;
        this.mNama = mNama;
    }

    public String getmKtpBella() {
        return mKtp;
    }

    public void setmKtpBella(String mKtp) {
        this.mKtp = mKtp;
    }

    public String getmNamaBella() {
        return mNama;
    }

    public void setmNamaBella(String mNama) {
        this.mNama = mNama;
    }
    
    public String infoBella() {
        String info = "";
        info += "\nKtp: " + mKtp + "\n";
        info += "Nama: " + mNama + "\n";
        return info;
    }
}
