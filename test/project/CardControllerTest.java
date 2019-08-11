/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author grewal
 */
public class CardControllerTest {
    
    public CardControllerTest() {
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
     * Test of playCards method, of class CardController.
     */
    @Test
    public void testPlayCardsGood() {
        System.out.println("playCardsGood");
        CardController instance = new CardController();
        instance.playCards();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testPlayCardsBoundary() {
        System.out.println("playCardsBoundary");
        CardController instance = new CardController();
        instance.playCards();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testPlayCardsBad() {
        System.out.println("playCardsBad");
        CardController instance = new CardController();
        instance.playCards();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of shuffle method, of class CardController.
     */
    @Test
    public void testShuffleGood() {
        System.out.println("shuffleGood");
        CardController instance = new CardController();
        instance.shuffle();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testShuffleBoundary() {
        System.out.println("shuffleBoundary");
        CardController instance = new CardController();
        instance.shuffle();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testShuffleBad() {
        System.out.println("shuffleBad");
        CardController instance = new CardController();
        instance.shuffle();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
