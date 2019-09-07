/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perusahaan;

/**
 *
 * @author bella
 */
public class TestMahasiswa21841720004Bella {
    public static void main(String[] args) {
        Mahasiswa1841720004Bella mhs1 = new Mahasiswa1841720004Bella();
        Mahasiswa1841720004Bella mhs2 = new Mahasiswa1841720004Bella();
        Mahasiswa1841720004Bella mhs3 = new Mahasiswa1841720004Bella();
        mhs1.nim= 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia";
        mhs1.kelas = "1A";
        mhs1.tmplBiodataBella();
        
        mhs2.nim = 102;
        mhs2.nama = "Surya";
        mhs2.alamat = "Jl. Anggrek";
        mhs2.kelas = "1A";
        mhs2.tmplBiodataBella();
        
        mhs3.nim = 103;
        mhs3.nama = "Candra";
        mhs3.alamat = "Jl. Viola";
        mhs3.kelas = "1A";
        mhs3.tmplBiodataBella();
    }
}
