package edu.upvictoria.fpoo.Problema6;

import edu.upvictoria.fpoo.Problema5.AreaTerr;
import junit.framework.TestCase;
import org.junit.Test;

public class AreaConoTest extends TestCase {
    @Test
    public void testCalcularACono_RH_Enteros() {
        double R = 6;
        double H = 14;
        AreaCono ca = new AreaCono();
        assertEquals(132D,ca.calcularACono(R,H));
    }
    @Test
    public void testCalcularACono_RH_Decimales() {
        double R = 4.7;
        double H = 13.5;
        AreaCono ca = new AreaCono();
        assertEquals(94D,ca.calcularACono(R,H));
    }
    @Test
    public void testCalcularACono_RH_DecYEnt() {
        double R = 5.3;
        double H = 20;
        AreaCono ca = new AreaCono();
        assertEquals(146D,ca.calcularACono(R,H));
    }
}