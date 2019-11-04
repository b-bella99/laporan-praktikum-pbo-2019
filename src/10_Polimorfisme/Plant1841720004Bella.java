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
public class Plant1841720004Bella {
    public void doDestroyBella(IDestroyable1841720004Bella d){
        if(d instanceof WalkingZombie1841720004Bella){
            WalkingZombie1841720004Bella wz = (WalkingZombie1841720004Bella) d;
            wz.destroyedBella();
        }else if(d instanceof JumpingZombie1841720004Bella){
            JumpingZombie1841720004Bella jz = (JumpingZombie1841720004Bella) d;
            jz.destroyedBella();
        }else if(d instanceof Barrier1841720004Bella){
            Barrier1841720004Bella b = (Barrier1841720004Bella) d;
            b.destroyedBella();
        }
    }
}
