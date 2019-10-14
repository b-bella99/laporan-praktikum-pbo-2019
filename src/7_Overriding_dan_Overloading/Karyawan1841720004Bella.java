/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bella.overridingload.percobaan1;

/**
 *
 * @author bella
 */
public class Karyawan1841720004Bella {
    private String mNama;
    private String mNip;
    private String mGolongan;
    private double mGaji;

    public void setmNamaBella(String mNama) {
        this.mNama = mNama;
    }

    public void setmNipBella(String mNip) {
        this.mNip = mNip;
    }

    public void setmGolonganBella(String mGolongan) {
        this.mGolongan = mGolongan;
        
        switch(mGolongan.charAt(0)){
            case '1' : this.mGaji = 5000000;
            break;
            case '2' : this.mGaji = 3000000;
            break;
            case '3' : this.mGaji = 2000000;
            break;
            case '4' : this.mGaji = 1000000;
            break;
            case '5' : this.mGaji = 750000;
            break;
        }
    }

    public void setmGajiBella(double mGaji) {
        this.mGaji = mGaji;
    }

    public String getmNamaBella() {
        return mNama;
    }

    public String getmNipBella() {
        return mNip;
    }

    public String getmGolonganBella() {
        return mGolongan;
    }

    public double getmGajiBella() {
        return mGaji;
    }
}
