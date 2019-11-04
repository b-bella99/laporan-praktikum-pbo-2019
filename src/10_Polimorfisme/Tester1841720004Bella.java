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
public class Tester1841720004Bella {
    public static void main(String[] args) {
        WalkingZombie1841720004Bella wz = new WalkingZombie1841720004Bella(100, 1);
        JumpingZombie1841720004Bella jz = new JumpingZombie1841720004Bella(100, 2);
        Barrier1841720004Bella b = new Barrier1841720004Bella(100);
        Plant1841720004Bella p = new Plant1841720004Bella();
        
        System.out.println("" + wz.getZombieInfoBella());
        System.out.println("" + jz.getZombieInfoBella());
        System.out.println("" + b.getBarrierInfoBella());
        System.out.println("----------------------------");
        
        for(int i = 0; i < 4; i ++){
            p.doDestroyBella(wz);
            p.doDestroyBella(jz);
            p.doDestroyBella(b);
        }
        
        System.out.println("" + wz.getZombieInfoBella());
        System.out.println("" + jz.getZombieInfoBella());
        System.out.println("" + b.getBarrierInfoBella());
    }
}
