/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author bella
 */
public class EncapTest1841720004Bella1 {
    public static void main(String[] args) {
        EncapDemo1841720004Bella1 encap = new EncapDemo1841720004Bella1();
        
        encap.setMnameBella("James");
        encap.setMageBella(5);
        
        System.out.println("Name    : " + encap.getMnameBella());
        System.out.println("Age     : " + encap.getMageBella());
    }
}
