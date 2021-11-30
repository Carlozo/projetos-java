/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematica;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author carli
 */
public class NumerosTest {
    private Numeros n;
    
    public NumerosTest() {
    }
    
    @BeforeEach
    public void setUp() {
        n = new Numeros();
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testNumeroPar() {
        assertTrue(n.numeroPar(9));
    }

    @Test
    public void testAreaQuadrado() {
        assertEquals(100, n.areaQuadrado(10));
    }

    @Test
    public void testNumeroDivisivel() {
        assertTrue(n.numeroDivisivel(4, 2));
    }
    
}
