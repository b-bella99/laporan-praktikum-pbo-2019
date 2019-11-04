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
public class WalkingZombie1841720004Bella extends Zombie1841720004Bella{

    public WalkingZombie1841720004Bella(int mHealth, int mLevel) {
        this.mHealth = mHealth;
        this.mLevel = mLevel;
    }
    
    public void healBella(){
        if(mLevel == 1){
            super.mHealth += super.mHealth * 0.2;
        }else if(mLevel == 2){
            super.mHealth += super.mHealth * 0.3;
        }else if(mLevel == 3){
            super.mHealth += super.mHealth * 0.4;
        }
    }
    
    public void destroyedBella(){
        super.mHealth -= super.mHealth * 20 / 100;
    }
    
    public String getZombieInfoBella(){
        String info = "Walking Zombie Data = " + super.getZombieInfoBella();
        return info;
    }
}
