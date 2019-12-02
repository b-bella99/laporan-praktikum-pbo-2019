/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bella.guidbs.backend;

/**
 *
 * @author bella
 */
import java.util.ArrayList;
import java.sql.*;
public class Anggota1841720004Bella {
    private int mIdAnggota;
    private String mNama;
    private String mAlamat;
    private String mTelepon;

    public Anggota1841720004Bella() {
    }

    public Anggota1841720004Bella(String mNama, String mAlamat, String mTelepon) {
        this.mNama = mNama;
        this.mAlamat = mAlamat;
        this.mTelepon = mTelepon;
    }

    public int getmIdAnggotaBella() {
        return mIdAnggota;
    }

    public void setmIdAnggotaBella(int mIdAnggota) {
        this.mIdAnggota = mIdAnggota;
    }

    public String getmNamaBella() {
        return mNama;
    }

    public void setmNamaBella(String mNama) {
        this.mNama = mNama;
    }

    public String getmAlamatBella() {
        return mAlamat;
    }

    public void setmAlamatBella(String mAlamat) {
        this.mAlamat = mAlamat;
    }

    public String getmTeleponBella() {
        return mTelepon;
    }

    public void setmTeleponBella(String mTelepon) {
        this.mTelepon = mTelepon;
    }
    
    public Anggota1841720004Bella getByIdBella(int id){
        Anggota1841720004Bella ang = new Anggota1841720004Bella();
        ResultSet rs = DBHelper1841720004Bella.selectQuery("SELECT * FROM anggota "
                                                            + "WHERE idanggota = '" + id + "'");
        
        try{
            while(rs.next()){
                ang = new Anggota1841720004Bella();
                ang.setmIdAnggotaBella(rs.getInt("idanggota"));
                ang.setmNamaBella(rs.getString("nama"));
                ang.setmAlamatBella(rs.getString("alamat"));
                ang.setmTeleponBella(rs.getString("telepon"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return ang;
    }
    
    public ArrayList<Anggota1841720004Bella> getAllBella(){
        ArrayList<Anggota1841720004Bella> listAnggota = new ArrayList();
        
        ResultSet rs = DBHelper1841720004Bella.selectQuery("SELECT * FROM anggota");
        
        try{
            while(rs.next()){
                Anggota1841720004Bella ang = new Anggota1841720004Bella();
                ang.setmIdAnggotaBella(rs.getInt("idanggota"));
                ang.setmNamaBella(rs.getString("nama"));
                ang.setmAlamatBella(rs.getString("alamat"));
                ang.setmTeleponBella(rs.getString("telepon"));
                
                listAnggota.add(ang);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return listAnggota;
    }
    
    public ArrayList<Anggota1841720004Bella> searchBella(String keyword){
        ArrayList<Anggota1841720004Bella> listAnggota = new ArrayList();
        
        String sql = "SELECT * FROM anggota WHERE "
                + " nama LIKE '%" + keyword + "%' "
                + " OR alamat LIKE '%" + keyword + "%' "
                + " OR telepon LIKE '%" + keyword + "%'";
        
        ResultSet rs = DBHelper1841720004Bella.selectQuery(sql);
        
        try{
            while(rs.next()){
                Anggota1841720004Bella ang = new Anggota1841720004Bella();
                ang.setmIdAnggotaBella(rs.getInt("idanggota"));
                ang.setmNamaBella(rs.getString("nama"));
                ang.setmAlamatBella(rs.getString("alamat"));
                ang.setmTeleponBella(rs.getString("telepon"));
                
                listAnggota.add(ang);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return listAnggota;
    }
    
    public void saveBella(){
        if(getByIdBella(mIdAnggota).getmIdAnggotaBella() == 0){
            String SQL = "INSERT INTO anggota (nama, alamat, telepon) VALUES("
                    + " '" + this.mNama + "', "
                    + " '" + this.mAlamat + "', "
                    + " '" + this.mTelepon + "'"
                    + " )";
            this.mIdAnggota = DBHelper1841720004Bella.insertQueryGetId(SQL);
        }else{
            String SQL = "UPDATE anggota set"
                    + " nama = '" + this.mNama + "', "
                    + " alamat = '" + this.mAlamat + "', "
                    + " telepon = '" + this.mTelepon + "' "
                    + " WHERE idanggota = '" + this.mIdAnggota + "'";
            DBHelper1841720004Bella.executeQuery(SQL);
        }
    }
    
    public void deleteBella(){
        String SQL = "DELETE FROM anggota WHERE idanggota = '" + this.mIdAnggota + "'";
        DBHelper1841720004Bella.executeQuery(SQL);
    }
}
