package com.algo.conversor;

import junit.framework.TestCase;

public class ConversionesTest2 extends TestCase {
    private Conversiones conversiones=new Conversiones();
    public void testMillasKms() {
        assertEquals("1.609",conversiones.MillasKms("0.0"));
    }
}