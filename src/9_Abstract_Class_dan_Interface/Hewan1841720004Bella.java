/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bella.absinterf.abstractclass;

/**
 *
 * @author bella
 */
public abstract class Hewan1841720004Bella {
    private int mUmur;
    
    protected Hewan1841720004Bella(){
        this.mUmur = 0;
    }
    
    public void bertambahUmurBella(){
        this.mUmur += 1;
    }
    
    public abstract void bergerakBella();
}
