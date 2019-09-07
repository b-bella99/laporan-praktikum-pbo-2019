/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jam;

/**
 *
 * @author bella
 */
public class Jam1841720004Bella {
    private String mmerk;
    private double mwaktu;
    private int mdiameter;
    private int mharga;
    
    public void setMerekBella(String value){
        mmerk = value;
    }
    
    public void setWaktuBella(double value){
        mwaktu = value;
    }
    
    public void setDiameterBella(int value){
        mdiameter = value;
    }
    
    public void setHargaBella(int value){
        mharga = value;
    }
    
    public void statusBella(){
        System.out.println("Mereke: " + mmerk);
        System.out.println("Waktu: " + mwaktu);
        System.out.println("Dimensi: " + mdiameter + " mm");
        System.out.println("Harga: " + mharga);
    }
}
