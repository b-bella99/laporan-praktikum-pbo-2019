/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author bella
 */
public class EncapDemo1841720004Bella {
    private String mname;
    private int mage;

    public String getMnameBella() {
        return mname;
    }

    public void setMnameBella(String newName) {
        this.mname = newName;
    }

    public int getMageBella() {
        return mage;
    }

    public void setMageBella(int newAge) {
        if(newAge > 30){
            mage = 30;
        }
        else{
            mage = newAge;
        }
    }
    
    
}
