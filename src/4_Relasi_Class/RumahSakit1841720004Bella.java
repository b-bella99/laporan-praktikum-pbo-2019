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
public class RumahSakit1841720004Bella {
    private String mNama;
    private String mAlamat;

    public RumahSakit1841720004Bella(String mNama, String mAlamat) {
        this.mNama = mNama;
        this.mAlamat = mAlamat;
    }

    public String getmNamaBella() {
        return mNama;
    }

    public void setmNamaBella(String mNama) {
        this.mNama = mNama;
    }

    public String getmAlamatBella() {
        return mAlamat;
    }

    public void setmAlamatBella(String mAlamat) {
        this.mAlamat = mAlamat;
    }
    
    public String infoBella(){
        System.out.println("\nDetail Pendaftaran");
        String info = "";
        info += "\nNama Rumah Sakit: " + this.mNama + "\n";
        info += "Alamat Rumah Sakit: " + this.mAlamat + "\n";
        return info;
    }
}
