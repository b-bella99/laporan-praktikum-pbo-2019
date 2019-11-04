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
public abstract class Zombie1841720004Bella implements IDestroyable1841720004Bella{
    protected int mHealth;
    protected int mLevel;
    
    public abstract void healBella();
    
    public abstract void destroyedBella();
    
    public String getZombieInfoBella(){
        String info = "\nHealth = " + mHealth + "\nLevel = " + mLevel;
        return info;
    }
}
