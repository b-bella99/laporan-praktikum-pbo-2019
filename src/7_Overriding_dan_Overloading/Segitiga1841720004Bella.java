/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bella.overridingload.tugas;

/**
 *
 * @author bella
 */
public class Segitiga1841720004Bella {
    private int mSudut;
    
    public int totalSudutBella(int sudutA){
        return mSudut = 180 - sudutA;
    }
    
    public int totalSudutBella(int sudutA, int sudutB){
        return mSudut = 180 - (sudutA - sudutB);
    }
    
    public int kellingBella(int sisiA, int sisiB, int sisiC){
        int keliling = sisiA + sisiB + sisiC;
        return keliling;
    }
    
    public double kellingBella(int sisiA, int sisiB){
        double c = Math.sqrt(sisiA * sisiA) + Math.sqrt(sisiB * sisiB);
        return c;
    }
    
    public static void main(String[] args) {
        Segitiga1841720004Bella s = new Segitiga1841720004Bella();
        
        System.out.println("Total sudut 1: " + s.totalSudutBella(45));
        System.out.println("Total sudut 2: " + s.totalSudutBella(45, 30));
        System.out.println("Keliling segitiga: " + s.kellingBella(5, 12, 13));
        System.out.println("Panjang sisi c: " + s.kellingBella(12, 13));
    }
}
