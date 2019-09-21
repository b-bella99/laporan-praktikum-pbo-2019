/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bella.relasiclass.percobaan1;

/**
 *
 * @author bella
 */
public class Laptop1841720004Bella {
    private String mMerk;
    private Processor1841720004Bella mProc;

    public Laptop1841720004Bella() {
    }

    public Laptop1841720004Bella(String mMerk, Processor1841720004Bella mProc) {
        this.mMerk = mMerk;
        this.mProc = mProc;
    }

    public String getmMerk() {
        return mMerk;
    }

    public void setmMerkBella(String mMerk) {
        this.mMerk = mMerk;
    }

    public Processor1841720004Bella getmProcBella() {
        return mProc;
    }

    public void setmProcBella(Processor1841720004Bella mProc) {
        this.mProc = mProc;
    }
    
    public void infoBella(){
        System.out.println("Merk Laptop = " + mMerk);
        mProc.infoBella();
    }
}
