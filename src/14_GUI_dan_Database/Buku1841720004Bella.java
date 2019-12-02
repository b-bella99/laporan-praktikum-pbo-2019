/*
 * To chbukue this license header, choose License Headers in Project Properties.
 * To chbukue this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bella.guidbs.backend;

/**
 *
 * @author bella
 */
import java.util.ArrayList;
import java.sql.*;

public class Buku1841720004Bella {
    private int mIdBuku;
    private Kategori1841720004Bella mKategori = new Kategori1841720004Bella();
    private String mjudul;
    private String mPenerbit;
    private String mPenulis;

    public int getmIdBukuBella() {
        return mIdBuku;
    }

    public void setmIdBukuBella(int mIdBuku) {
        this.mIdBuku = mIdBuku;
    }

    public Kategori1841720004Bella getmKategoriBella() {
        return mKategori;
    }

    public void setmKategoriBella(Kategori1841720004Bella mKategori) {
        this.mKategori = mKategori;
    }

    public String getMjudulBella() {
        return mjudul;
    }

    public void setMjudulBella(String mjudul) {
        this.mjudul = mjudul;
    }

    public String getmPenerbitBella() {
        return mPenerbit;
    }

    public void setmPenerbitBella(String mPenerbit) {
        this.mPenerbit = mPenerbit;
    }

    public String getmPenulisBella() {
        return mPenulis;
    }

    public void setmPenulisBella(String mPenulis) {
        this.mPenulis = mPenulis;
    }

    public Buku1841720004Bella() {
    }

    public Buku1841720004Bella(Kategori1841720004Bella mkategori, String mjudul, String mPenerbit, String mPenulis) {
        this.mKategori = mkategori;
        this.mjudul = mjudul;
        this.mPenerbit = mPenerbit;
        this.mPenulis = mPenulis;
    }
    
    public Buku1841720004Bella getByIdBella(int id){
        Buku1841720004Bella buku = new Buku1841720004Bella();
        ResultSet rs = DBHelper1841720004Bella.selectQuery("SELECT "
                + " b.idbuku as idbuku, "
                + " b.judul as judul, "
                + " b.penerbit as penerbit, "
                + " b.penulis as penulis, "
                + " k.idkategori as idkategori, "
                + " k.nama as nama, "
                + " k.keterangan as keterangan "
                + " FROM buku b "
                + " LEFT JOIN kategori k on b.idkategori = k.idkategori "
                + " WHERE b.idbuku = '" + id + "'");
        try{
            while(rs.next()){
                buku = new Buku1841720004Bella();
                buku.setmIdBukuBella(rs.getInt("idbuku"));
                buku.getmKategoriBella().setmIdKategoriBella(rs.getInt("idkategori"));
                buku.getmKategoriBella().setmNamaBella(rs.getString("nama"));
                buku.getmKategoriBella().setmKeteranganBella(rs.getString("keterangan"));
                buku.setMjudulBella(rs.getString("judul"));
                buku.setmPenerbitBella(rs.getString("penerbit"));
                buku.setmPenulisBella(rs.getString("penulis"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return buku;
    }
    
    public ArrayList<Buku1841720004Bella> getAllBella(){
        ArrayList<Buku1841720004Bella> listBuku = new ArrayList();
        
        ResultSet rs = DBHelper1841720004Bella.selectQuery("SELECT "
                        + " b.idbuku as idbuku, "
                        + " b.judul as judul, "
                        + " b.penerbit as penerbit, "
                        + " b.penulis as penulis, "
                        + " k.idkategori as idkategori, "
                        + " k.nama as nama, "
                        + " k.keterangan as keterangan "
                        + " FROM buku b "
                        + " LEFT JOIN kategori k ON b.idkategori = k.idkategori ");
        try{
            while(rs.next()){
                Buku1841720004Bella buku = new Buku1841720004Bella();
                buku.setmIdBukuBella(rs.getInt("idbuku"));
                buku.getmKategoriBella().setmIdKategoriBella(rs.getInt("idkategori"));
                buku.getmKategoriBella().setmNamaBella(rs.getString("nama"));
                buku.getmKategoriBella().setmKeteranganBella(rs.getString("keterangan"));
                buku.setMjudulBella(rs.getString("judul"));
                buku.setmPenerbitBella(rs.getString("penerbit"));
                buku.setmPenulisBella(rs.getString("penulis"));
                
                listBuku.add(buku);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return listBuku;
    }
    
    public ArrayList<Buku1841720004Bella> searchBella(String keyword){
        ArrayList<Buku1841720004Bella> listBuku = new ArrayList();
        
        ResultSet rs = DBHelper1841720004Bella.selectQuery("SELECT "
                        + " b.idbuku as idbuku, "
                        + " b.judul as judul, "
                        + " b.penerbit as penerbit, "
                        + " b.penulis as penulis, "
                        + " k.idkategori as idkategori, "
                        + " k.nama as nama, "
                        + " k.keterangan as keterangan "
                        + " FROM buku b "
                        + " LEFT JOIN kategori k ON b.idkategori = k.idkategori "
                        + " WHERE b.judul LIKE '%" + keyword + "%' "
                        + " OR b.penerbit LIKE '%" + keyword + "%' "
                        + " OR b.penulis LIKE '%" + keyword + "%'");
        try{
            while(rs.next()){
                Buku1841720004Bella buku = new Buku1841720004Bella();
                buku.setmIdBukuBella(rs.getInt("idbuku"));
                buku.getmKategoriBella().setmIdKategoriBella(rs.getInt("idkategori"));
                buku.getmKategoriBella().setmNamaBella(rs.getString("nama"));
                buku.getmKategoriBella().setmKeteranganBella(rs.getString("keterangan"));
                buku.setMjudulBella(rs.getString("judul"));
                buku.setmPenerbitBella(rs.getString("penerbit"));
                buku.setmPenulisBella(rs.getString("penulis"));
                
                listBuku.add(buku);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return listBuku;
    }
    
    public void saveBella(){
        if(getByIdBella(mIdBuku).getmIdBukuBella() == 0){
            String SQL = "INSERT INTO buku (judul, idkategori, penerbit, penulis) VALUES("
                    + " '" + this.mjudul + "', "
                    + " '" + this.getmKategoriBella().getmIdKategoriBella()+ "', "
                    + " '" + this.mPenerbit + "', "
                    + " '" + this.mPenulis + "' "
                    + " )";
            this.mIdBuku = DBHelper1841720004Bella.insertQueryGetId(SQL);
        }else{
            String SQL = "UPDATE buku SET "
                    + " judul = '" + this.mjudul + "', "
                    + " idkategori = '" + this.getmKategoriBella().getmIdKategoriBella()+ "', "
                    + " penerbit = '" + this.mPenerbit + "', "
                    + " penulis = '" + this.mPenulis + "' "
                    + " WHERE idbuku = '" + this.mIdBuku + "'";
            DBHelper1841720004Bella.executeQuery(SQL);
        }
    }
    
    public void deleteBella(){
        String SQL = "DELETE FROM buku WHERE idbuku = '" + this.mIdBuku + "'";
        DBHelper1841720004Bella.executeQuery(SQL);
    }
}
