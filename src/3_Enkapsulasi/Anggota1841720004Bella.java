/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koperasigettersetter;

/**
 *
 * @author bella
 */
public class Anggota1841720004Bella {
    private String mnama;
    private String malamat;
    private float msimpanan;

    public void setMnamaBella(String mnama) {
        this.mnama = mnama;
    }

    public void setMalamatBella(String malamat) {
        this.malamat = malamat;
    }

    public String getMnamaBella() {
        return mnama;
    }

    public String getMalamatBella() {
        return malamat;
    }

    public float getMsimpananBella() {
        return msimpanan;
    }
    public void setorBella(float uang){
        msimpanan += uang;
    }
    public void pinjamBella(float uang){
        msimpanan -= uang;
    }
}
