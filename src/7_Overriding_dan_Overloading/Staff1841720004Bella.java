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
public class Staff1841720004Bella extends Karyawan1841720004Bella{
    private int mLembur;
    private double mGajiLembur;

    public void setmLemburBella(int mLembur) {
        this.mLembur = mLembur;
    }

    public void setmGajiLemburBella(double mGajiLembur) {
        this.mGajiLembur = mGajiLembur;
    }

    public int getmLemburBella() {
        return mLembur;
    }

    public double getmGajiLemburBella() {
        return mGajiLembur;
    }

    public double getmGajiBella(int lembur, double gajiLembur){
        return super.getmGajiBella() + lembur + gajiLembur;
    }

    @Override
    public double getmGajiBella() {
        return super.getmGajiBella() + mLembur * mGajiLembur;
    }
    
    public void lihatInfoBella(){
        System.out.println("NIP         : " + this.getmNipBella());
        System.out.println("Nama        : " + this.getmNamaBella());
        System.out.println("Golongan    : " + this.getmGolonganBella());
        System.out.println("Jml Lembur  : " + this.getmLemburBella());
        System.out.printf("Gaji Lembur  : %.0f\n", this.getmGajiLemburBella());
        System.out.printf("Gaji        : %.0f\n", this.getmGajiBella());
    }
}
