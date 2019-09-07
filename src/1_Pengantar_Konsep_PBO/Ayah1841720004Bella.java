/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kakekcucu;

/**
 *
 * @author bella
 */
public interface Ayah1841720004Bella extends Kakek1841720004Bella{
    String mnamaAyah = "Dwi Candra";
    String malamat = "Malang";
    String mmargaKakek = "Candra";
    
    
    default void statusAyahBella(){
        System.out.println("Nama Ayah: " + mnamaAyah);
        System.out.println("Alamat : " + malamat);
        System.out.println("Marga Kakek: " + mmargaKakek);
    }
}
