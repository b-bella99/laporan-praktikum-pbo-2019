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
public class Kursi1841720004Bella {
    private String mNomor;
    private Penumpang1841720004Bella mPenumpang;

    public Kursi1841720004Bella(String mNomor) {
        this.mNomor = mNomor;
    }

    public String getmNomorBella() {
        return mNomor;
    }

    public void setmNomorBella(String mNomor) {
        this.mNomor = mNomor;
    }

    public Penumpang1841720004Bella getmPenumpangBella() {
        return mPenumpang;
    }

    public void setmPenumpangBella(Penumpang1841720004Bella mPenumpang) {
        this.mPenumpang = mPenumpang;
    }
    
    public String infoBella() {
        String info = "";
        info += "Nomor: " + mNomor + "\n";
        if (this.mPenumpang != null) {
        info += "Penumpang: " + mPenumpang.infoBella() + "\n";
        }
        return info;
    }
}
