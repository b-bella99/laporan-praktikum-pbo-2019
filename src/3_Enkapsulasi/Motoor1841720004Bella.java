/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motorencapsulation;

/**
 *
 * @author bella
 */
public class Motorr1841720004Bella {
    private int mkecepatan = 0;
    private boolean mkontakOn = false;
    
    public void nyalakanMesinBella(){
        mkontakOn = true;
    }
    
    public void matikanMesinBella(){
        mkontakOn = false;
        mkecepatan = 0;
    }
    
    public void tambahKecepatanBella(){
        if(mkontakOn == true){
            mkecepatan += 5;
            
            if(mkecepatan >= 100){
                mkecepatan = 100;
                System.out.println("Kecepatan sudah maksimal");
            }
        }
        else{
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
        }
    }
    
    public void kurangiKecepatanBella(){
        if(mkontakOn == true){
            mkecepatan -= 5;
        }
        else{
            System.out.println("Kecepatan tidak bisa berkkurang karena Mesin Off! \n");
        }
    }
       
    public void printStatusBella(){
        if(mkontakOn == true){
            System.out.println("Kontak On");
        }
        else{
            System.out.println("Kontak Off");
        }
        System.out.println("kecepatan: " + kecepatan + "\n");
    }
}
