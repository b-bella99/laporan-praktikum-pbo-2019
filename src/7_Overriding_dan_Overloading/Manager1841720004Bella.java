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
public class Manager1841720004Bella extends Karyawan1841720004Bella{
    private double mTunjangan;
    private String mBagian;
    private Staff1841720004Bella mSt[];

    public double getmTunjanganBella() {
        return mTunjangan;
    }

    public void setmTunjanganBella(double mTunjangan) {
        this.mTunjangan = mTunjangan;
    }

    public String getmBagianBella() {
        return mBagian;
    }

    public void setmBagianBella(String mBagian) {
        this.mBagian = mBagian;
    }

    public Staff1841720004Bella[] getmStBella() {
        return mSt;
    }

    public void setStBella(Staff1841720004Bella[] mSt) {
        this.mSt = mSt;
    }
    
    public void viewStaffBella(){
        int i;
        System.out.println("--------------------");
        for (i = 0; i < mSt.length; i++) {
            mSt[i].lihatInfoBella();
        }
        System.out.println("--------------------");
    }
    
    public void lihatInfoBella(){
        System.out.println("Manager         : " + this.getmBagianBella());
        System.out.println("NIP             : " + this.getmNipBella());
        System.out.println("Nama            : " + this.getmNamaBella());
        System.out.println("Golongan        : " + this.getmGolonganBella());
        System.out.printf("Tunjangan        : %.0f\n", this.getmTunjanganBella());
        System.out.printf("Gaji             : %.0f\n", this.getmGajiBella());
        System.out.println("Bagian          : " + this.getmBagianBella());
        this.viewStaffBella();
    }
    
    public double getmGajiBella(){
        return super.getmGajiBella() + mTunjangan;
    }
}
