/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bella.relasiclass.tugas;
import java.util.Scanner;
/**
 *
 * @author bella
 */
public class MainTugas1841720004Bella {
    public static void menuBella(){
        System.out.println("\n===================================================");
        System.out.println("\t\tPendaftaran Pasien");
        System.out.println("===================================================");
        System.out.println("1. Isi Rumah Sakit");
        System.out.println("2. Isi Dokter");
        System.out.println("3. Isi Data Diri");
        System.out.println("4. Lihat Pendaftaran");
        System.out.println("5. Keluar");
    }
    
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        RumahSakit1841720004Bella rs = null;
        Dokter1841720004Bella dk = null;
        Ruangan1841720004Bella ru = null;
        Pasien1841720004Bella ps = new Pasien1841720004Bella();
        
        int plhn = 0;
        do{
            menuBella();
            System.out.print("Masukkan pilihan Anda: ");
            plhn = in.nextInt();
            
            switch(plhn){
                case 1:
                    System.out.print("Nama RS: ");
                    String nm = st.nextLine();
                    System.out.print("Alamat Rs: ");
                    String amlt = st.nextLine();
                    rs = new RumahSakit1841720004Bella(nm, amlt);
                    break;
                    
                case 2:
                    System.out.print("ID Dokter: ");
                    String id = st.nextLine();
                    System.out.print("Nama Dokter: ");
                    nm = st.nextLine();
                    dk = new Dokter1841720004Bella(id, nm);
                    break;
                    
                case 3:
                    System.out.print("Nama Pasien: ");
                    nm = st.nextLine();
                    System.out.print("Jenis Kelamin: ");
                    String jk = st.nextLine();
                    System.out.print("Keluhan: ");
                    String klhn = st.nextLine();
                    System.out.print("Kode Ruangan: ");
                    String r = st.nextLine();
                    System.out.print("Nama Ruangan: ");
                    String rnm = st.nextLine();
                    ru = new Ruangan1841720004Bella(r, rnm);
                    ps = new Pasien1841720004Bella(nm, jk, klhn, rs, ru, dk);
                    break;
                    
                case 4:
                    System.out.println(ps.infoBella());
                    break;
                    
                default:
                    if(rs.getmNamaBella() == null)
                        System.out.println("Terima Kasih");
                    else
                        System.out.println("Terima Kasih telah daftar di " + rs.getmNamaBella());
                        System.out.println("Semoga Lekas Sembuh!!!");
                    break;
            }
        }while(plhn < 5);
    }
}
