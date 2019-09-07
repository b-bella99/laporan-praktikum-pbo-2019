/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luaskeliling;

/**
 *
 * @author bella
 */
public class Lingkaran1841720004Bella {
    public static double sphi = 3.14, sr;
    public static double hitungLuasBella(){
        return sphi * sr * sr;
    }
    
    public static double hitungKelilingBella(){
        return 2 * sphi * sr;
    }
    
    public static void main(String[] args) {
        sr = 14;
        System.out.println("Jari-jari lingkaran: " + sr);
        System.out.println("\nKeliling Lingkaran: " + hitungKelilingBella());
        System.out.println("Luas Lingkaran: " + hitungLuasBella());
    }
}
