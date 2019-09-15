/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koperasi;
import java.util.Scanner;
/**
 *
 * @author bella
 */
public class TestKoperasi1841720004Bella2 {
    public void menuBella(){
        System.out.println("\n===================================================");
        System.out.println("Koperasi Bersama ");
        System.out.println("1. Isi data (Ktp, Nama, Limit Peminjaman) ");
        System.out.println("2. Pinjam");
        System.out.println("3. Angsur");
        System.out.println("4. Keluar");
        System.out.println("===================================================");
    }
    
    public static void main(String[] args){
        AnggotaKoperasi1841720004Bella2 agk = new AnggotaKoperasi1841720004Bella2();
        TestKoperasi1841720004Bella2 tk = new TestKoperasi1841720004Bella2();
        Scanner st = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        String nm, ktp;
        int lmt, jml, pnjm, plhn, angsur;
        
        do{
            tk.menuBella();
            System.out.print("\nMasukkan pilihan Anda: ");
            plhn = in.nextInt();
                switch(plhn){
                    case 1:
                        System.out.print("\nNo Ktp: ");
                        ktp = st.nextLine();
                        System.out.print("Nama  : ");
                        nm = st.nextLine();
                        System.out.print("Limit : ");
                        lmt = in.nextInt();
                        agk = new AnggotaKoperasi1841720004Bella2(ktp, nm, lmt);
                        break;

                    case 2:
                        System.out.print("\nBanyak Pinjaman: ");
                        pnjm = in.nextInt();
                        agk.pinjamBella(pnjm);
                        break;

                    case 3:
                        System.out.print("\nBanyak Angsuran: ");
                        angsur = in.nextInt();
                        agk.angsurBella(angsur);
                        System.out.println("\nJumlah pinjaman saat ini: " + agk.getMjmlPinjamanBella());
                        break;

                    default:
                         System.out.println("\nTerima kasih");   
                }
        }while(plhn <4 );
    }
}
