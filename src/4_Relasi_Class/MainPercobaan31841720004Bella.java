/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bella.relasiclass.percobaan3;

/**
 *
 * @author bella
 */
public class MainPercobaan31841720004Bella {
    public static void main(String[] args) {
        Pegawai1841720004Bella masinis = new Pegawai1841720004Bella("1234", "Spongebob Squarepants");
        Pegawai1841720004Bella asisten = new Pegawai1841720004Bella("4567", "Patrick Star");
        KeretaApi1841720004Bella keretaApi = new KeretaApi1841720004Bella("Gaya Baru", "Bisnis", masinis, asisten);
        System.out.println(keretaApi.infoBella());
    }
}
