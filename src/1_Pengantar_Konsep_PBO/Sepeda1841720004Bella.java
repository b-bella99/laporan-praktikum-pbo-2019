/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sepedademo;

/**
 *
 * @author bella
 */
public class Sepeda1841720004Bella {
    private String mmerek;
    private int mkecepatan;
    private int mgear;
    
    public void setMerekBella(String newValue){
        mmerek = newValue;
    }
    
    public void gantiGearBella(int newValue){
        mgear = newValue;
    }
    
    public void tambahKecepatanBella(int increment){
        mkecepatan = mkecepatan + increment;
    }
    
    public void remBella(int decrement){
        mkecepatan = mkecepatan - decrement;
    }
    
    public void cetakStatusBella(){
        System.out.println("Merek: " + mmerek);
        System.out.println("Kecepatan: " + mkecepatan);
        System.out.println("Gear: " + mgear);
    }
}
