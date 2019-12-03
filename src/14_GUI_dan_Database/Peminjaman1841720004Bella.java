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

public class Peminjaman1841720004Bella {
    private int mIdPeminjaman;
    private Anggota1841720004Bella mAnggota = new Anggota1841720004Bella();
    private Buku1841720004Bella mBuku = new Buku1841720004Bella();
    private String mTanggalPinjam;
    private String mTanggalKembali;

    public Peminjaman1841720004Bella(Anggota1841720004Bella mAnggota, Buku1841720004Bella mBuku, String mTanggalPinjam, String mTanggalKembali) {
        this.mAnggota = mAnggota;
        this.mBuku = mBuku;
        this.mTanggalPinjam = mTanggalPinjam;
        this.mTanggalKembali = mTanggalKembali;
    }

    public Peminjaman1841720004Bella() {
    }

    public int getmIdPeminjamanBella() {
        return mIdPeminjaman;
    }

    public void setmIdPeminjamanBella(int mIdPeminjaman) {
        this.mIdPeminjaman = mIdPeminjaman;
    }

    public Anggota1841720004Bella getmAnggotaBella() {
        return mAnggota;
    }

    public void setmAnggotaBella(Anggota1841720004Bella mAnggota) {
        this.mAnggota = mAnggota;
    }

    public Buku1841720004Bella getmBukuBella() {
        return mBuku;
    }

    public void setmBukuBella(Buku1841720004Bella mBuku) {
        this.mBuku = mBuku;
    }

    public String getmTanggalPinjamBella() {
        return mTanggalPinjam;
    }

    public void setmTanggalPinjamBella(String mTanggalPinjam) {
        this.mTanggalPinjam = mTanggalPinjam;
    }

    public String getmTanggalKembaliBella() {
        return mTanggalKembali;
    }

    public void setmTanggalKembaliBella(String mTanggalKembali) {
        this.mTanggalKembali = mTanggalKembali;
    }
    
    public Peminjaman1841720004Bella getByIdBella(int id){
        Peminjaman1841720004Bella pem = new Peminjaman1841720004Bella();
        ResultSet rs = DBHelper1841720004Bella.selectQuery("SELECT "
                + " p.idpeminjaman as idpeminjaman, "
                + " p.tanggalpinjam as tanggalpinjam, "
                + " p.tanggalkembali as tanggalkembali, "
                + " a.idanggota as idanggota, "
                + " a.nama as nama, "
                + " a.alamat as alamat, "
                + " a.telepon as telepon, "
                + " b.idbuku as idbuku, "
                + " b.idkategori as idkategori, "
                + " b.judul as judul, "
                + " b.penerbit as penerbit, "
                + " b.penulis as penulis "
                + " FROM peminjaman p "
                + " LEFT JOIN anggota a on p.idanggota = a.idanggota "
                + " LEFT JOIN buku b on p.idbuku = b.idbuku "
                + " WHERE p.idpeminjaman = '" + id + "'");
        try{
            while(rs.next()){
                pem = new Peminjaman1841720004Bella();
                pem.setmIdPeminjamanBella(rs.getInt("idpeminjaman"));
                pem.getmAnggotaBella().setmIdAnggotaBella(rs.getInt("idanggota"));
                pem.getmAnggotaBella().setmNamaBella(rs.getString("nama"));
                pem.getmAnggotaBella().setmAlamatBella(rs.getString("alamat"));
                pem.getmAnggotaBella().setmTeleponBella(rs.getString("telepon"));
                pem.getmBukuBella().setmIdBukuBella(rs.getInt("idbuku"));
                pem.getmBukuBella().setMjudulBella(rs.getString("judul"));
                pem.getmBukuBella().setmPenerbitBella(rs.getString("penerbit"));
                pem.getmBukuBella().setmPenulisBella(rs.getString("penulis"));
                pem.setmTanggalPinjamBella(rs.getString("tanggalpinjam"));
                pem.setmTanggalKembaliBella(rs.getString("tanggalkembali"));
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return pem;
    }
    
    public ArrayList<Peminjaman1841720004Bella> getAllBella(){
        ArrayList<Peminjaman1841720004Bella> ListPinjam = new ArrayList();
        ResultSet rs = DBHelper1841720004Bella.selectQuery("SELECT "
                + " p.idpeminjaman as idpeminjaman, "
                + " p.tanggalpinjam as tanggalpinjam, "
                + " p.tanggalkembali as tanggalkembali, "
                + " a.idanggota as idanggota, "
                + " a.nama as nama, "
                + " a.alamat as alamat, "
                + " a.telepon as telepon, "
                + " b.idbuku as idbuku, "
                + " b.idkategori as idkategori, "
                + " b.judul as judul, "
                + " b.penerbit as penerbit, "
                + " b.penulis as penulis "
                + " FROM peminjaman p "
                + " LEFT JOIN anggota a on p.idanggota = a.idanggota "
                + " LEFT JOIN buku b on p.idbuku = b.idbuku ");
        try{
            while(rs.next()){
                Peminjaman1841720004Bella pem = new Peminjaman1841720004Bella();
                pem.setmIdPeminjamanBella(rs.getInt("idpeminjaman"));
                pem.getmAnggotaBella().setmIdAnggotaBella(rs.getInt("idanggota"));
                pem.getmAnggotaBella().setmNamaBella(rs.getString("nama"));
                pem.getmAnggotaBella().setmAlamatBella(rs.getString("alamat"));
                pem.getmAnggotaBella().setmTeleponBella(rs.getString("telepon"));
                pem.getmBukuBella().setmIdBukuBella(rs.getInt("idbuku"));
                pem.getmBukuBella().setMjudulBella(rs.getString("judul"));
                pem.getmBukuBella().setmPenerbitBella(rs.getString("penerbit"));
                pem.getmBukuBella().setmPenulisBella(rs.getString("penulis"));
                pem.setmTanggalPinjamBella(rs.getString("tanggalpinjam"));
                pem.setmTanggalKembaliBella(rs.getString("tanggalkembali"));
                
                ListPinjam.add(pem);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return ListPinjam;
    }
    
    public void saveBella(){
        if(getByIdBella(mIdPeminjaman).getmIdPeminjamanBella() == 0){
            String sql = "INSERT INTO peminjaman (idanggota, idbuku, tanggalpinjam, tanggalkembali) "
                    + "VALUES ("
                    + " '" + this.getmAnggotaBella().getmIdAnggotaBella() + "', "
                    + " '" + this.getmBukuBella().getmIdBukuBella() + "',"
                    + " '" + this.mTanggalPinjam+ "', "
                    + " '" +this.mTanggalKembali + "' "
                    + " )";
            this.mIdPeminjaman = DBHelper1841720004Bella.insertQueryGetId(sql);
        }else{
            String sql = "UPDATE peminjaman SET "
                    + " idanggota = '" + this.getmAnggotaBella().getmIdAnggotaBella() + "', "
                    + " idbuku = '" + this.getmBukuBella().getmIdBukuBella() + "', "
                    + " tanggalpinjam = '" + this.mTanggalPinjam+ "', "
                    + " tanggalkembali= '" +this.mTanggalKembali + "' ";
            DBHelper1841720004Bella.executeQuery(sql);
        }
    }
    
    public void cariAnggotaBella(int id){
        ResultSet rs = DBHelper1841720004Bella.selectQuery("SELECT * FROM anggota WHERE idanggota = '" + id + "'");
        try{
            while(rs.next()){
                getmAnggotaBella().setmIdAnggotaBella(rs.getInt("idanggota"));
                getmAnggotaBella().setmNamaBella(rs.getString("nama"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void cariBukuBella(int id){
        ResultSet rs = DBHelper1841720004Bella.selectQuery("SELECT * FROM buku WHERE idbuku = '" + id + "'");
        try{
            while(rs.next()){
                getmBukuBella().setmIdBukuBella(rs.getInt("idbuku"));
                getmBukuBella().setMjudulBella(rs.getString("judul"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void deleteBella(){
        String sql = "DELETE FROM peminjaman WHERE idpeminjaman = '" + this.mIdPeminjaman + "'";
        DBHelper1841720004Bella.executeQuery(sql);
    }
}
