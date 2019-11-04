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
public class JumpingZombie1841720004Bella extends Zombie1841720004Bella{

    public JumpingZombie1841720004Bella(int mHealth, int mLevel) {
        this.mHealth = mHealth;
        this.mLevel = mLevel;
    }
    
    public void healBella(){
        if(mLevel == 1){
            mHealth += mHealth * 0.3;
        }else if(mLevel == 2){
            mHealth += mHealth * 0.4;
        }else if(mLevel == 3){
            mHealth += mHealth * 0.5;
        }
    }
    
    public void destroyedBella(){
        mHealth -= mHealth * 10 / 100;
    }
    
    public String getZombieInfoBella(){
        String info = "Jumping Zombie Data = " + super.getZombieInfoBella();
        return info;
    }
}
