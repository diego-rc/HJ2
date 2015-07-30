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

/**
 *
 * @author luiyi
 */
public class MiCalcuTest {
    private Object data;
    
    public MiCalcuTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    @Test
	
	public int testgetResultado()
	{
        int resultado = data.peek();
        int expResult = 0;
        assertEquals(expResult, resultado);
		fail("El resultado es incorrecto");
    }
	
	public void testcalcularVector() 
	{
		MiCalcu test = new MiCalcu();
		boolean resultado = test.calcularVector();
		boolean expResult = false;
		 assertEquals(expResult, resultado);
		 fail("El resultado es incorrecto");
	}
}
