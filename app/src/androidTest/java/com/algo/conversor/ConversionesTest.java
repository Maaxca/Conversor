package com.algo.conversor;

import junit.framework.TestCase;

public class ConversionesTest extends TestCase {
    private Conversiones conversiones=new Conversiones();

    public void testCFarenheit() {
        assertEquals("32.0",conversiones.CFarenheit("0"));
        assertEquals("212.0",conversiones.CFarenheit("100"));
        assertEquals("68.0",conversiones.CFarenheit("20"));
        assertEquals("-148.0",conversiones.CFarenheit("-100"));
        assertEquals("46.4",conversiones.CFarenheit("8"));
        assertEquals("hola",conversiones.CFarenheit("si"));
    }

    public void testFarenheitC() {
        assertEquals("0.0",conversiones.FarenheitC("32"));
        assertEquals("100.0",conversiones.FarenheitC("212"));
        assertEquals("20.0",conversiones.FarenheitC("68"));
        assertEquals("-100.0",conversiones.FarenheitC("-148"));
        assertEquals("si",conversiones.FarenheitC("hola"));
    }

    public void testMillasKms() {
        assertEquals("1.60934",conversiones.MillasKms("1"));
        assertEquals("160.934",conversiones.MillasKms("100"));
        assertEquals("32.1868",conversiones.MillasKms("20"));
        assertEquals("-160.934",conversiones.MillasKms("-100"));
        assertEquals("hola",conversiones.MillasKms("si"));
    }

    public void testKmsMillas() {
        assertEquals("1.0",conversiones.KmsMillas("1.60934"));
        assertEquals("100.0",conversiones.KmsMillas("160.934"));
        assertEquals("20.0",conversiones.KmsMillas("32.1868"));
        assertEquals("-100.0",conversiones.KmsMillas("-160.934"));
        assertEquals("si",conversiones.KmsMillas("hola"));
    }
}