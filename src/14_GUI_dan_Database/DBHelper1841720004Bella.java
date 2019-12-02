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
import java.sql.*;
public class DBHelper1841720004Bella {
    private static Connection mKoneksi;
    
    public static void bukaKoneksiBella(){
        if(mKoneksi == null)
        {
            try
            {
                String url = "jdbc:mysql://localhost:3306/dbperpus";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                mKoneksi = DriverManager.getConnection(url, user, password);
            }
            catch (SQLException t)
            {
                System.out.println("Error koneksi!" + t.getMessage());
            }
        }
    }
    
    public static int insertQueryGetId(String query)
    {
    bukaKoneksiBella();
    int num = 0;
    int result = -1;
    try
    {
        Statement stmt = mKoneksi.createStatement();
        num = stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next())
        {
            result = rs.getInt(1);
        }
        rs.close();
        stmt.close();
    }catch (Exception e)
    {
        e.printStackTrace();
        result = -1;
    }
        return result;
    }
        public static boolean executeQuery(String query)
    {
    bukaKoneksiBella();
    boolean result = false;
    try
    {
        Statement stmt = mKoneksi.createStatement();
        stmt.executeUpdate(query);
        result = true;
        stmt.close();
    }
    catch (Exception e)
    {
        e.printStackTrace();
    }
        return result;
    }
    
    public static ResultSet selectQuery(String query){
        bukaKoneksiBella();
        ResultSet rs = null;
        try
        {
            Statement stmt = mKoneksi.createStatement();
            rs = stmt.executeQuery(query);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    return rs;
    }
}
