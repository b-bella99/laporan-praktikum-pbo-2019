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
public class Ruangan1841720004Bella {
    private String mIdRuang;
    private String mNamaRuang;

    public Ruangan1841720004Bella(String mIdRuang, String mNamaRuang) {
        this.mIdRuang = mIdRuang;
        this.mNamaRuang = mNamaRuang;
    }

    public String getmIdRuangBella() {
        return mIdRuang;
    }

    public void setmIdRuangBella(String mIdRuang) {
        this.mIdRuang = mIdRuang;
    }

    public String getmNamaRuangBella() {
        return mNamaRuang;
    }

    public void setmNamaRuangBella(String mNamaRuang) {
        this.mNamaRuang = mNamaRuang;
    }
    
    public String infoBella(){
        String info = "";
        info += "\nID Ruang: " + this.mIdRuang + "\n";
        info += "Nama Ruang: " + this.mNamaRuang + "\n";
        return info;
    }
}
