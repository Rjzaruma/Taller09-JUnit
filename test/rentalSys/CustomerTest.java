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
public class CustomerTest {
    
    public CustomerTest() {
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
     * Test of addMovieRental method, of class Customer.
     */
    @Test
    public void testAddMovieRental() {
        //System.out.println("addMovieRental");
        Movie test = new Movie("Batman",10);
        MovieRental arg = new MovieRental(test,25) ;
        Customer instance = new Customer("Ricardo");
        instance.addMovieRental(arg);
        assertTrue(instance.getMovieRentals().size()>0);
    }

    /**
     * Test of addVideoGameRental method, of class Customer.
     */
    @Test
    public void testAddVideoGameRental() {
        //System.out.println("addVideoGameRental");
        VideoGameRental arg = new VideoGameRental(new Ps3Game("GTA"),10,true);
        Customer instance = new Customer("Ricardo");
        instance.addVideoGameRental(arg);
        assertTrue(instance.getVideoGameRental().size()>0);
    }

    /**
     * Test of statement method, of class Customer.
     */
    @Test
    public void testStatement() {
        //System.out.println("statement");
        Customer instance = new Customer("Ricardo");
        String expResult = "Rental Record for Ricardo\n" +
                            "Amount owed is 0.0\n" +
                            "You earned 0 frequent renter points";
        String result = instance.statement();
        
        
        
        assertEquals(expResult,result);
        
    }
    
}
