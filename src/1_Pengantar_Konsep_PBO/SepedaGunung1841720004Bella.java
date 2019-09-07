/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sepedademo;

/**
 *
 * @author bella
 */
public class SepedaGunung1841720004Bella extends Sepeda1841720004Bella{
    private String mtipeSuspensi;
    
    public void setTipeSuspensiBella(String newValue){
        mtipeSuspensi = newValue;
    }
    
    public void cetakStatusBella(){
        super.cetakStatusBella();
        System.out.println("Tipe suspensi: " + mtipeSuspensi);
    }
}
