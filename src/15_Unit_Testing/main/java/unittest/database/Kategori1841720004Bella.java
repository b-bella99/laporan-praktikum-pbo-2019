/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.database;

/**
 *
 * @author bella
 */
import java.util.ArrayList;
import java.sql.*;
public class Kategori1841720004Bella {
    private int mIdKategori;
    private String mNama;
    private String mKeterangan;

    public Kategori1841720004Bella() {
    }

    public Kategori1841720004Bella(String mNama, String mKeterangan) {
        this.mNama = mNama;
        this.mKeterangan = mKeterangan;
    }

    public int getmIdKategoriBella() {
        return mIdKategori;
    }

    public void setmIdKategoriBella(int mIdKategori) {
        this.mIdKategori = mIdKategori;
    }

    public String getmNamaBella() {
        return mNama;
    }

    public void setmNamaBella(String mNama) {
        this.mNama = mNama;
    }

    public String getmKeteranganBella() {
        return mKeterangan;
    }

    public void setmKeteranganBella(String mKeterangan) {
        this.mKeterangan = mKeterangan;
    }
    
    public Kategori1841720004Bella getByIdBella(int id){
        Kategori1841720004Bella kat = new Kategori1841720004Bella();
        ResultSet rs = DBHelper1841720004Bella.selectQuery("SELECT * FROM kategori "
                                                            + "WHERE idkategori = '" + id + "'");
        
        try{
            while(rs.next()){
                kat = new Kategori1841720004Bella();
                kat.setmIdKategoriBella(rs.getInt("IdKategori"));
                kat.setmNamaBella(rs.getString("nama"));
                kat.setmKeteranganBella(rs.getString("keterangan"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return kat;
    }
    
    public ArrayList<Kategori1841720004Bella> getAllBella(){
        ArrayList<Kategori1841720004Bella> listKategori = new ArrayList();
        
        ResultSet rs = DBHelper1841720004Bella.selectQuery("SELECT * FROM kategori");
        
        try{
            while(rs.next()){
                Kategori1841720004Bella kat = new Kategori1841720004Bella();
                kat.setmIdKategoriBella(rs.getInt("IdKategori"));
                kat.setmNamaBella(rs.getString("nama"));
                kat.setmKeteranganBella(rs.getString("keterangan"));
                
                listKategori.add(kat);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return listKategori;
    }
    
    public ArrayList<Kategori1841720004Bella> searchBella(String keyword){
        ArrayList<Kategori1841720004Bella> listKategori = new ArrayList();
        
        String sql = "SELECT * FROM kategori WHERE "
                + " nama LIKE '%" + keyword + "%' "
                + " OR keterangan LIKE '%" + keyword + "%' ";
        
        ResultSet rs = DBHelper1841720004Bella.selectQuery(sql);
        
        try{
            while(rs.next()){
                Kategori1841720004Bella kat = new Kategori1841720004Bella();
                kat.setmIdKategoriBella(rs.getInt("IdKategori"));
                kat.setmNamaBella(rs.getString("nama"));
                kat.setmKeteranganBella(rs.getString("keterangan"));
                
                listKategori.add(kat);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return listKategori;
    }
    
    public void saveBella(){
        if(getByIdBella(mIdKategori).getmIdKategoriBella() == 0){
            String SQL = "INSERT INTO kategori (nama, keterangan) VALUES("
                    + " '" + this.mNama + "', "
                    + " '" + this.mKeterangan + "' "
                    + " )";
            this.mIdKategori = DBHelper1841720004Bella.insertQueryGetId(SQL);
        }else{
            String SQL = "UPDATE kategori set"
                    + " nama = '" + this.mNama + "', "
                    + " keterangan = '" + this.mKeterangan + "' "
                    + " WHERE idkategori = '" + this.mIdKategori + "'";
            DBHelper1841720004Bella.executeQuery(SQL);
        }
    }
    
    public void deleteBella(){
        String SQL = "DELETE FROM kategori WHERE idkategori = '" + this.mIdKategori + "'";
        DBHelper1841720004Bella.executeQuery(SQL);
    }
    
    @Override
    public String toString(){
        return mNama;
    }
    
    ArrayList<Kategori1841720004Bella> getByNamaAndKeteranganBella(String nama, String keterangan) {
        ArrayList<Kategori1841720004Bella> ListKategori = new ArrayList();
        ResultSet rs;
        if ((nama.trim().length()>0) && (keterangan.trim().length()>0)){
            rs = DBHelper1841720004Bella.selectQuery("SELECT * FROM kategori Where nama = '"+
            nama +"' and keterangan = '"+ keterangan+"'");
        }else if ((nama.trim().length()>0) && (keterangan.trim().length()==0)){
            rs = DBHelper1841720004Bella.selectQuery("SELECT * FROM kategori Where nama = '"+
            nama+"'");
        }else {
            rs = DBHelper1841720004Bella.selectQuery("SELECT * FROM kategori Where keterangan = '"+ keterangan+"'");
        }
        try {
            while (rs.next()) {
                Kategori1841720004Bella kat = new Kategori1841720004Bella();
                kat.setmIdKategoriBella(rs.getInt("idkategori"));
                kat.setmNamaBella(rs.getString("nama"));
                kat.setmKeteranganBella(rs.getString("keterangan"));
                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }
}
