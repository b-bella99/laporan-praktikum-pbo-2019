/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bella.overridingload.latihan;

/**
 *
 * @author bella
 */
public class PerkalianKu1841720004Bella {
    void perkalianBella(int a, int b){
        System.out.println(a * b);
    }
    
    void perkalianBella(int a, int b, int c){
        System.out.println(a * b * c);
    }
    
    public static void main(String[] args) {
        PerkalianKu1841720004Bella objek = new PerkalianKu1841720004Bella();
        
        objek.perkalianBella(25, 43);
        objek.perkalianBella(34, 23, 56);
    }
}
