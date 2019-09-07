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
class Cucu1841720004Bella implements Ayah1841720004Bella, Kakek1841720004Bella{
    private String mnamaCucu;
    private String mmargaAyah;
    
    public void setNamaCucuBella(String nama){
        mnamaCucu = nama;
    }
    
    public void setNamaMargaBella(String marga){
        mmargaAyah = marga;
    }
    
    public void statusCucuBella(){
        System.out.println("Nama cucu: " + mnamaCucu);
        System.out.println("Marga Ayah: " + mmargaAyah);
    }
    
    public static void main(String[] args){
        Cucu1841720004Bella c = new Cucu1841720004Bella();
        
        c.statusBella();
        c.statusAyahBella();
        c.setNamaMargaBella("candra");
        c.setNamaCucuBella("Pranata Candra");
        c.statusCucuBella();
    }
}
