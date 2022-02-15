package com.algo.conversor;

import junit.framework.TestCase;

/**
 * The type Conversiones test.
 */
public class ConversionesTest extends TestCase {
    private Conversiones conversiones=new Conversiones();

    /**
     * Test celsius a farenheit.
     */
    public void testCFarenheit() {
        assertEquals("32.0",conversiones.CFarenheit("0"));
        assertEquals("212.0",conversiones.CFarenheit("100"));
        assertEquals("68.0",conversiones.CFarenheit("20"));
        assertEquals("-148.0",conversiones.CFarenheit("-100"));
        assertEquals("46.4",conversiones.CFarenheit("8"));
        assertEquals("Error",conversiones.CFarenheit("si"));
    }

    /**
     * Test farenheit a celsius.
     */
    public void testFarenheitC() {
        assertEquals("0.0",conversiones.FarenheitC("32"));
        assertEquals("100.0",conversiones.FarenheitC("212"));
        assertEquals("20.0",conversiones.FarenheitC("68"));
        assertEquals("-100.0",conversiones.FarenheitC("-148"));
        assertEquals("Error",conversiones.FarenheitC("hola"));
    }

    /**
     * Test millas a kms.
     */
    public void testMillasKms() {
        assertEquals("1.60934",conversiones.MillasKms("1"));
        assertEquals("160.934",conversiones.MillasKms("100"));
        assertEquals("32.1868",conversiones.MillasKms("20"));
        assertEquals("-160.934",conversiones.MillasKms("-100"));
        assertEquals("Error",conversiones.MillasKms("si"));
    }

    /**
     * Test kms a millas.
     */
    public void testKmsMillas() {
        assertEquals("1",conversiones.KmsMillas("1.60934"));
        assertEquals("100",conversiones.KmsMillas("160.934"));
        assertEquals("20",conversiones.KmsMillas("32.1868"));
        assertEquals("-100",conversiones.KmsMillas("-160.934"));
        assertEquals("Error",conversiones.KmsMillas("hola"));
    }

    /**
     * Test kb a mb.
     */
    public void testKbMb(){
        assertEquals("0",conversiones.pasarKBaMB("100"));
        assertEquals("1",conversiones.pasarKBaMB("1024"));
        assertEquals("2",conversiones.pasarKBaMB("2048"));
        assertEquals("9",conversiones.pasarKBaMB("9216"));
    }
}