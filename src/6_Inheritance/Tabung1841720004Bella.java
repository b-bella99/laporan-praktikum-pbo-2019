/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bella.inheritance.percobaan3;

/**
 *
 * @author bella
 */
public class Tabung1841720004Bella extends Bangun1841720004Bella{
    protected int mT;

    public void setmSuperPhiBella(double mPhi) {
        super.mPhi = mPhi;
    }

    public void setmSuperRBella(int mR) {
        super.mR = mR;
    }

    public void setmTBella(int mT) {
        this.mT = mT;
    }
    
    public void volumeBella(){
        System.out.println("Volume tabung adalah: " + (super.mPhi * super.mR * super.mR * this.mT));
    }
}
