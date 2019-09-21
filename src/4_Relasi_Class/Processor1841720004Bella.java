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
public class Processor1841720004Bella {
    private String mMerk;
    private double mCache;

    public Processor1841720004Bella() {
    }

    public Processor1841720004Bella(String mMerk, double mCache) {
        this.mMerk = mMerk;
        this.mCache = mCache;
    }

    public String getmMerkBella() {
        return mMerk;
    }

    public void setmMerkBella(String mMerk) {
        this.mMerk = mMerk;
    }

    public double getmCacheBella() {
        return mCache;
    }

    public void setmCacheBella(double mCache) {
        this.mCache = mCache;
    }
    
    public void infoBella(){
        System.out.printf("Merk Processor = %s\n", mMerk);
        System.out.printf("Cache Memory = %.2f\n", mCache);
    }
}
