/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bella.overridingload.percobaan1;

/**
 *
 * @author bella
 */
public class Utama1841720004Bella {
    public static void main(String[] args) {
        System.out.println("Program Testing Class Manager & Staff");
        Manager1841720004Bella man[] = new Manager1841720004Bella[2];
        Staff1841720004Bella staff1[] = new Staff1841720004Bella[2];
        Staff1841720004Bella staff2[] = new Staff1841720004Bella[3];
        
        //pembuatan manager
        
        man[0] = new Manager1841720004Bella();
        man[0].setmNamaBella("Tedjo");
        man[0].setmNipBella("101");
        man[0].setmGolonganBella("1");
        man[0].setmTunjanganBella(5000000);
        man[0].setmBagianBella("Administrasi");
        
        man[1] = new Manager1841720004Bella();
        man[1].setmNamaBella("Atika");
        man[1].setmNipBella("102");
        man[1].setmGolonganBella("1");
        man[1].setmTunjanganBella(2500000);
        man[1].setmBagianBella("Pemasaran");
        
        staff1[0] = new Staff1841720004Bella();
        staff1[0].setmNamaBella("Usman");
        staff1[0].setmNipBella("0003");
        staff1[0].setmGolonganBella("2");
        staff1[0].setmLemburBella(10);
        staff1[0].setmGajiLemburBella(10000);
        
        staff1[1] = new Staff1841720004Bella();
        staff1[1].setmNamaBella("Anugrah");
        staff1[1].setmNipBella("0005");
        staff1[1].setmGolonganBella("2");
        staff1[1].setmLemburBella(10);
        staff1[1].setmGajiLemburBella(55000);
        man[0].setStBella(staff1);
        
        staff2[0] = new Staff1841720004Bella();
        staff2[0].setmNamaBella("Hendra");
        staff2[0].setmNipBella("0004");
        staff2[0].setmGolonganBella("3");
        staff2[0].setmLemburBella(15);
        staff2[0].setmGajiLemburBella(5500);
        
        staff2[1] = new Staff1841720004Bella();
        staff2[1].setmNamaBella("Arie");
        staff2[1].setmNipBella("0006");
        staff2[1].setmGolonganBella("4");
        staff2[1].setmLemburBella(5);
        staff2[1].setmGajiLemburBella(100000);
        
        staff2[2] = new Staff1841720004Bella();
        staff2[2].setmNamaBella("Mentari");
        staff2[2].setmNipBella("0007");
        staff2[2].setmGolonganBella("3");
        staff2[2].setmLemburBella(6);
        staff2[2].setmGajiLemburBella(20000);
        man[1].setStBella(staff2);
        
        //cetak informasi dari manager + staffnya
        man[0].lihatInfoBella();
        man[1].lihatInfoBella();
    }
}
