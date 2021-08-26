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
public class VideoGameRentalTest {
    //public Object GTA;
    
    public VideoGameRentalTest() {
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
     * Test of getDaysRented method, of class VideoGameRental.
     */
    @Test
    public void testGetDaysRented() {
        
        System.out.println("getDaysRented");
        Object juego = "Ps3Game";
        VideoGameRental instance = new VideoGameRental(juego,10,true);
        int expResult = 10;
        int result = instance.getDaysRented();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getVideoGame method, of class VideoGameRental.
     */
    @Test
    public void testGetVideoGame() {
        //Bota null porque no se asigna a ninguna categoria de videoJuego
        System.out.println("getVideoGame");
        Object juego = new Ps3Game("GTA");
        VideoGameRental instance = new VideoGameRental(juego,10,true);
        Object expResult = juego;
        Object result = instance.getVideoGame();
        assertSame(expResult, result);
        
    }

    /**
     * Test of getCharge method, of class VideoGameRental.
     */
    @Test
    public void testGetCharge() {
        System.out.println("getCharge");
        Object juego = new Ps3Game("GTA");
        VideoGameRental instance = new VideoGameRental(juego,10,false);
        double expResult = 7.50;
        double result = instance.getCharge();
        assertEquals(expResult,result,7.50);
        
    }

    /**
     * Test of getFrequentRenterPoints method, of class VideoGameRental.
     */
    @Test
    public void testGetFrequentRenterPoints() {
        System.out.println("getFrequentRenterPoints");
        Object juego = new Ps3Game("GTA");
        VideoGameRental instance = new VideoGameRental(juego,10,true);
        int expResult = 8;
        int result = instance.getFrequentRenterPoints();
        assertEquals(expResult, result);
        
    }
    
}
