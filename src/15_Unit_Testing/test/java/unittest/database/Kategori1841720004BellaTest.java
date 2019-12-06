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
public class Kategori1841720004BellaTest extends TestCase{
    Kategori1841720004Bella instance;
    
    public Kategori1841720004BellaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Kategori1841720004Bella("Comics", "Comic is combination words and picture");
        System.out.format("Start Testing : %s \n", this.getName());
    }
    
    @After
    public void tearDown() {
        System.out.format("Finish Test %s\n", this.getName());
    }

    @Test
    public void testSearchBella() {
        System.out.println("search test");
        String keyword = "Comics";
        ArrayList<Kategori1841720004Bella> result = instance.searchBella(keyword);
        ArrayList<Kategori1841720004Bella> expResult = instance.getByNamaAndKeteranganBella(keyword, "");
        assertEquals(expResult.size(), result.size());
    }

    @Test
    public void testSaveBella() {
        System.out.println("save test");
        this.instance.saveBella();
        ArrayList<Kategori1841720004Bella> expResult = instance.getByNamaAndKeteranganBella(instance.getmNamaBella(), instance.getmKeteranganBella());
        assertTrue(expResult.size()>0);
    }
}
