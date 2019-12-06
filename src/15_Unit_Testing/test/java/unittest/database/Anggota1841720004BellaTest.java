/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.database;

import java.util.ArrayList;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bella
 */
public class Anggota1841720004BellaTest extends TestCase{
    Anggota1841720004Bella instance;
    
    public Anggota1841720004BellaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Anggota1841720004Bella("Danang", "Surabaya", "085123456789");
        System.out.format("Start Testing : %s \n", this.getName());
    }
    
    @After
    public void tearDown() {
        System.out.format("Finish Test %s\n", this.getName());
    }
    
    @Test
    public void testSearchBella() {
        System.out.println("search test anggota");
        String keyword = "Danang";
        ArrayList<Anggota1841720004Bella> result = instance.searchBella(keyword);
        ArrayList<Anggota1841720004Bella> expResult = instance.getByNamaAndAlamatBella(keyword, "");
        assertEquals(expResult.size(), result.size());
    }

    @Test
    public void testSaveBella() {
        System.out.println("save test anggota");
        this.instance.saveBella();
        ArrayList<Anggota1841720004Bella> expResult = instance.getByNamaAndAlamatBella(instance.getmNamaBella(), instance.getmAlamatBella());
        assertTrue(expResult.size()>0);
    }
}
