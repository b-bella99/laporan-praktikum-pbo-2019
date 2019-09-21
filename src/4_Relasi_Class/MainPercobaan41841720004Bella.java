/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bella.relasiclass.percobaan4;

/**
 *
 * @author bella
 */
public class MainPercobaan41841720004Bella {
    public static void main(String[] args) {
        Penumpang1841720004Bella p = new Penumpang1841720004Bella("12345", "Mr. Krab");
        Gerbong1841720004Bella gerbong = new Gerbong1841720004Bella("A", 10);
        gerbong.setPenumpangBella(p, 1);
        System.out.println(gerbong.infoBella());
    }
}
