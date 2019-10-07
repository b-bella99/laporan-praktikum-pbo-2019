/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bella.inheritance.percobaan2;

/**
 *
 * @author bella
 */
public class ClassB1841720004Bellaa1 extends ClassA1841720004Bellaa1{
    private int mZ;

    public void setmZBella(int mZ) {
        this.mZ = mZ;
    }
    
    public void getNilaiZBella(){
        System.out.println("Nilai Z: " + mZ);
    }
    
    public void getJumlahBella(){
        System.out.println("Jumlah: " + (super.getmXBella() + super.getmYBella() + mZ));
    }
}
