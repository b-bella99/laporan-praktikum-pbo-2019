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
public class Dokter1841720004Bella {
    private String mId;
    private String mNamaDok;

    public Dokter1841720004Bella(String mId, String mNamaDok) {
        this.mId = mId;
        this.mNamaDok = mNamaDok;
    }

    public String getmIdBella() {
        return mId;
    }

    public void setmIdBella(String mId) {
        this.mId = mId;
    }

    public String getmNamaDokBella() {
        return mNamaDok;
    }

    public void setmNamaDokBella(String mNamaDok) {
        this.mNamaDok = mNamaDok;
    }
    
    public String infoBella(){
        String info = "";
        info += "\nID Dokter: " + this.mId + "\n";
        info += "Nama Dokter: " + this.mNamaDok + "\n";
        return info;
    }
}
