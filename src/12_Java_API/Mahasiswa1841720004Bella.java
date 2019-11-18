/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bella.database.percobaan4;

/**
 *
 * @author bella
 */import java.util.ArrayList;
public class Mahasiswa1841720004Bella {
    private String mNim;
    private String mNama;
    private String mAlamat;

    public Mahasiswa1841720004Bella(String mNim, String mNama, String mAlamat) {
        this.mNim = mNim;
        this.mNama = mNama;
        this.mAlamat = mAlamat;
    }

    public String getmNimBella() {
        return mNim;
    }

    public String getmNamaBella() {
        return mNama;
    }

    public String getmAlamatBella() {
        return mAlamat;
    }
}

class InputData1841720004Bella{
    ArrayList<Mahasiswa1841720004Bella> ListMahasiswa;

    public InputData1841720004Bella() {
        ListMahasiswa = new ArrayList();
    }
    
    public void isiDataBella(String Nim, String Nama, String Alamat){
        Mahasiswa1841720004Bella mhs = new Mahasiswa1841720004Bella(Nim, Nama, Alamat);
        ListMahasiswa.add(mhs);
    }
    
    public ArrayList<Mahasiswa1841720004Bella> getDataBella(){
        return ListMahasiswa;
    }
}
