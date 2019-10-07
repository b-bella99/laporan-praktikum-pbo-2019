/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bella.inheritance.tugas;

/**
 *
 * @author bella
 */
public class MainTugas1841720004Bella {
    public static void main(String[] args) {
        Mac1841720004Bella mac = new Mac1841720004Bella("MacBook Retina14", 3, 8, " Intel Core i5", "Li-Ion", "KGear Security Bracket");
        mac.tampilMacBella();
        
        Windows1841720004Bella win = new Windows1841720004Bella("Windows 10", 3, 4, "Intel Core i7", "Li-Ion", "Windows Media Player");
        win.tampilWindowsBella();
        
        Pc1841720004Bella pc = new Pc1841720004Bella("Toshiba", 2, 8, "Intel Core i5", 15);
        pc.tampilPcBella();
    }
}
