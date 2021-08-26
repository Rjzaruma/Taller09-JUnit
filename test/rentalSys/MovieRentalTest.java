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
public class MovieRentalTest {
    
    public MovieRentalTest() {
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
     * Test of getDaysRented method, of class MovieRental.
     */
    @Test
    public void testGetDaysRented() {
        System.out.println("getDaysRented");
        Movie test = new Movie("Batman",10);
        MovieRental instance = new MovieRental(test,25) ;
        int expResult = 25;
        int result = instance.getDaysRented();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMovie method, of class MovieRental.
     */
    @Test
    public void testGetMovie() {
        System.out.println("getMovie");
        Movie test = new Movie("Batman",10);
        MovieRental instance = new MovieRental(test,25) ;
        Movie expResult = test;
        Movie result = instance.getMovie();
        assertEquals(expResult, result);
        
    }
    
}
