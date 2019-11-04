/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bella.poli.tugas;

/**
 *
 * @author bella
 */
public class Barrier1841720004Bella implements IDestroyable1841720004Bella{
    private int mStrenght;

    public Barrier1841720004Bella(int mStrenght) {
        this.mStrenght = mStrenght;
    }

    public int getmStrenghtBella() {
        return mStrenght;
    }

    public void setmStrenghtBella(int mStrenght) {
        this.mStrenght = mStrenght;
    }
    
    @Override
    public void destroyedBella() {
        mStrenght = (int) (mStrenght - (mStrenght * 0.1));
    }
    
    public String getBarrierInfoBella(){
        String info = "Barrier Strength = " + mStrenght;
        return info;
    }
}
