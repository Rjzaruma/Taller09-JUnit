/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalSys;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Joao
 */
public class MovieTest {
    
    public MovieTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPriceCode method, of class Movie.
     */
    @Test
    public void testGetPriceCode() {
        System.out.println("getPriceCode");
        Movie instance = new Movie("Batman",10);
        int expResult = 10;
        int result = instance.getPriceCode();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPriceCode method, of class Movie.
     */
    @Test
    public void testSetPriceCode() {
        System.out.println("setPriceCode");
        int arg = 25;
        Movie instance = new Movie("Avengers",10);
        instance.setPriceCode(arg);
        assertEquals(arg, instance.getPriceCode());
        
    }
    
}
