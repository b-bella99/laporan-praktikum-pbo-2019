/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koperasi;

/**
 *
 * @author bella
 */
public class AnggotaKoperasi1841720004Bella2 {
    private String mktp;
    private String mnama;
    private int mlmtPinjaman;
    private int mjmlPinjaman;

    //konstruktor tak berparameter
    public AnggotaKoperasi1841720004Bella2() {
    }

    AnggotaKoperasi1841720004Bella2(String ktp, String nama, int lmtPinjaman) {
        this.mktp = ktp;
        this.mnama = nama;
        this.mlmtPinjaman = lmtPinjaman;
    }

    public String getMktpBella() {
        return mktp;
    }

    public void setMktp(String mktp) {
        this.mktp = mktp;
    }

    public void setMnama(String mnama) {
        this.mnama = mnama;
    }

    public void setMlmtPinjaman(int mlmtPinjaman) {
        this.mlmtPinjaman = mlmtPinjaman;
    }

    public void setMjmlPinjaman(int mjmlPinjaman) {
        this.mjmlPinjaman = mjmlPinjaman;
    }

    
    public String getMnamaBella() {
        return mnama;
    }
    
    public int getMlmtPinjamanBella() {
        return mlmtPinjaman;
    }

    public void setMlmtPinjamanBella(int mlmtPinjaman) {
        this.mlmtPinjaman = mlmtPinjaman;
    }

    public int getMjmlPinjamanBella() {
        return mjmlPinjaman;
    }

    public void setMjmlPinjamanBella(int mjmlPinjaman) {
        this.mjmlPinjaman = mjmlPinjaman;
    }
    
    public void pinjamBella(int pinjam){
        if(pinjam > mlmtPinjaman){
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        }
        else{
            mjmlPinjaman = pinjam;
        }
    }
    
    public void angsurBella(int angsur){
        int persen = mjmlPinjaman * 10 / 100;
        
        if(angsur > persen){
            mjmlPinjaman -= angsur;
        }
        else{
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman"); 
        }
    }
}
