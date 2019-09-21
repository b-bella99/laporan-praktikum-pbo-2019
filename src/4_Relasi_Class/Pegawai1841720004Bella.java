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
public class Pegawai1841720004Bella {
    private String mNip;
    private String mNama;

    public Pegawai1841720004Bella(String mNip, String mNama) {
        this.mNip = mNip;
        this.mNama = mNama;
    }

    public String getmNipBella() {
        return mNip;
    }

    public void setmNipBella(String mNip) {
        this.mNip = mNip;
    }

    public String getmNamaBella() {
        return mNama;
    }

    public void setmNamaBella(String mNama) {
        this.mNama = mNama;
    }
    
    public String infoBella() { 
        String info = "";
        info += "\nNip: " + this.mNip + "\n";
        info += "Nama: " + this.mNama + "\n";
        return info;
    }
}
