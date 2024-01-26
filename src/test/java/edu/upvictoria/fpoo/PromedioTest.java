package edu.upvictoria.fpoo;

import junit.framework.TestCase;
import org.junit.Test;

public class PromedioTest extends TestCase {

        @Test
        public void testPromediar_enteros_Max10() {
            float calif1=10;
            float calif2=9;
            float calif3=7;
            float calif4=5;
            float sum =calif1+calif2+calif3+calif4;
            Promedio p = new Promedio();
            assertEquals(7.75F,p.Promediar(sum));
        }
        @Test
        public void testPromediar_enteros_Max100() {
            float calif1=100;
            float calif2=94;
            float calif3=75;
            float calif4=58;
            float sum =calif1+calif2+calif3+calif4;
            Promedio p = new Promedio();
            assertEquals(81.75F,p.Promediar(sum));
        }
        @Test
        public void testPromediar_decimal_Max10() {
            float calif1=6.8F;
            float calif2=9.4F;
            float calif3=7.5F;
            float calif4=5.8F;
            float sum =calif1+calif2+calif3+calif4;
            Promedio p = new Promedio();
            assertEquals(7.375F,p.Promediar(sum));
        }
        @Test
        public void testPromediar_decimal_Max100() {
            float calif1=66.5F;
            float calif2=94.5F;
            float calif3=78.6F;
            float calif4=80.2F;
            float sum =calif1+calif2+calif3+calif4;
            Promedio p = new Promedio();
            assertEquals(79.95F,p.Promediar(sum));
        }
    @Test
    public void testPromediar_decimalYentero_Max100() {
        float calif1=95.5F;
        float calif2=100;
        float calif3=78;
        float calif4=80.8F;
        float sum =calif1+calif2+calif3+calif4;
        Promedio p = new Promedio();
        assertEquals(88.575F,p.Promediar(sum));
    }
    @Test
    public void testPromediar_decimalYentero_Max10() {
        float calif1=9.5F;
        float calif2=10;
        float calif3=7.8F;
        float calif4=8;
        float sum =calif1+calif2+calif3+calif4;
        Promedio p = new Promedio();
        assertEquals(8.825F,p.Promediar(sum));
    }
}