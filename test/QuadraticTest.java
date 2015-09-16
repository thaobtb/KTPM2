/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import quadratic.Quadratic;

/**
 *
 * @author HP
 */
public class QuadraticTest {
    
    public QuadraticTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Before Test");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("After Test");
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void NoSolutionTest()
    {
        System.out.println("Test case: no solutions");  
        Quadratic q = new Quadratic(1, -3, 2);
        assertEquals(false, q.check);
    }
    
    @Test
    public void DoublerootTest(){
        System.out.println("Double Root");  
        Quadratic q = new Quadratic(1, -2, 1);
        assertEquals(1,q.result1,0.0);
        assertEquals(1,q.result2,0.0);
    }
   
    @Test
    public void TwoSolutionTest()
    {   
        System.out.println("Two Solutions");       
        Quadratic q = new Quadratic(1, -3, 2);
        double ex1 = 2.0;
        double ex2 = 1.0;
        assertEquals(ex1, q.result1, 1);
        assertEquals(ex1, q.result2, 1);
    }
}
