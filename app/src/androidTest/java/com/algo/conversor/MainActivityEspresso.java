package com.algo.conversor;

import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.espresso.Espresso;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * The type Main activity espresso.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityEspresso {
    /**
     * The Main activity activity test rule.
     * @author Maaxca
     */
    @Rule
    public ActivityScenarioRule<MainActivity> mainActivityActivityTestRule=new ActivityScenarioRule<>(MainActivity.class);

    /**
     * Estas son las pruebas de Espresso que hacen test de forma grafica
     */
    @Test
    public void pruebaMillasKms1(){
        Espresso.onView(withId(R.id.entrada)).perform(clearText());
        Espresso.onView(withId(R.id.entrada)).perform(typeText("1"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.MillasKms)).perform(click());
        Espresso.onView(withId(R.id.salida)).check(matches(withText("1.60934")));
    }

    /**
     * Prueba millas kms 2.
     */
    @Test
    public void pruebaMillasKms2(){
        Espresso.onView(withId(R.id.entrada)).perform(clearText());
        Espresso.onView(withId(R.id.entrada)).perform(typeText("100"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.MillasKms)).perform(click());
        Espresso.onView(withId(R.id.salida)).check(matches(withText("160.934")));
    }

    /**
     * Prueba millas kms 3.
     */
    @Test
    public void pruebaMillasKms3(){
        Espresso.onView(withId(R.id.entrada)).perform(clearText());
        Espresso.onView(withId(R.id.entrada)).perform(typeText("20"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.MillasKms)).perform(click());
        Espresso.onView(withId(R.id.salida)).check(matches(withText("32.1868")));
    }

    /**
     * Prueba millas kms 4.
     */
    @Test
    public void pruebaMillasKms4(){
        Espresso.onView(withId(R.id.entrada)).perform(clearText());
        Espresso.onView(withId(R.id.entrada)).perform(typeText("-100"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.MillasKms)).perform(click());
        Espresso.onView(withId(R.id.salida)).check(matches(withText("-160.934")));
    }

    /**
     * Prueba millas kms 5.
     */
    @Test
    public void pruebaMillasKms5(){
        Espresso.onView(withId(R.id.entrada)).perform(clearText());
        Espresso.onView(withId(R.id.entrada)).perform(typeText("8"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.MillasKms)).perform(click());
        Espresso.onView(withId(R.id.salida)).check(matches(withText("12.87472")));
    }

    /**
     * Prueba millas kms 6.
     */
    @Test
    public void pruebaMillasKms6(){
        Espresso.onView(withId(R.id.entrada)).perform(clearText());
        Espresso.onView(withId(R.id.entrada)).perform(typeText("hola"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.MillasKms)).perform(click());
        Espresso.onView(withId(R.id.salida)).check(matches(withText("Error")));
    }

    /**
     * Prueba kms millas 1.
     */
    @Test
    public void pruebaKmsMillas1(){
        Espresso.onView(withId(R.id.entrada)).perform(clearText());
        Espresso.onView(withId(R.id.entrada)).perform(typeText("1.60934"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.KmsMillas)).perform(click());
        Espresso.onView(withId(R.id.salida)).check(matches(withText("1.0")));
    }

    /**
     * Prueba kms millas 2.
     */
    @Test
    public void pruebaKmsMillas2(){
        Espresso.onView(withId(R.id.entrada)).perform(clearText());
        Espresso.onView(withId(R.id.entrada)).perform(typeText("160.934"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.KmsMillas)).perform(click());
        Espresso.onView(withId(R.id.salida)).check(matches(withText("100.0")));
    }

    /**
     * Prueba kms millas 3.
     */
    @Test
    public void pruebaKmsMillas3(){
        Espresso.onView(withId(R.id.entrada)).perform(clearText());
        Espresso.onView(withId(R.id.entrada)).perform(typeText("32.1868"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.KmsMillas)).perform(click());
        Espresso.onView(withId(R.id.salida)).check(matches(withText("20.0")));
    }

    /**
     * Prueba kms millas 4.
     */
    @Test
    public void pruebaKmsMillas4(){
        Espresso.onView(withId(R.id.entrada)).perform(clearText());
        Espresso.onView(withId(R.id.entrada)).perform(typeText("-160.934"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.KmsMillas)).perform(click());
        Espresso.onView(withId(R.id.salida)).check(matches(withText("-100.0")));
    }

    /**
     * Prueba kms millas 5.
     */
    @Test
    public void pruebaKmsMillas5(){
        Espresso.onView(withId(R.id.entrada)).perform(clearText());
        Espresso.onView(withId(R.id.entrada)).perform(typeText("12.8748"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.KmsMillas)).perform(click());
        Espresso.onView(withId(R.id.salida)).check(matches(withText("8.0")));
    }

    /**
     * Prueba kms millas 6.
     */
    @Test
    public void pruebaKmsMillas6(){
        Espresso.onView(withId(R.id.entrada)).perform(clearText());
        Espresso.onView(withId(R.id.entrada)).perform(typeText("si"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.KmsMillas)).perform(click());
        Espresso.onView(withId(R.id.salida)).check(matches(withText("Error")));
    }

    /**
     * Prueba c farenheit 1.
     */
    @Test
    public void pruebaCFarenheit1(){
        Espresso.onView(withId(R.id.entrada)).perform(clearText());
        Espresso.onView(withId(R.id.entrada)).perform(typeText("0"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.CFarenheit)).perform(click());
        Espresso.onView(withId(R.id.salida)).check(matches(withText("32.0")));
    }

    /**
     * Prueba c farenheit 2.
     */
    @Test
    public void pruebaCFarenheit2(){
        Espresso.onView(withId(R.id.entrada)).perform(clearText());
        Espresso.onView(withId(R.id.entrada)).perform(typeText("100"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.CFarenheit)).perform(click());
        Espresso.onView(withId(R.id.salida)).check(matches(withText("212.0")));
    }

    /**
     * Prueba c farenheit 3.
     */
    @Test
    public void pruebaCFarenheit3(){
        Espresso.onView(withId(R.id.entrada)).perform(clearText());
        Espresso.onView(withId(R.id.entrada)).perform(typeText("20"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.CFarenheit)).perform(click());
        Espresso.onView(withId(R.id.salida)).check(matches(withText("68.0")));
    }

    /**
     * Prueba c farenheit 4.
     */
    @Test
    public void pruebaCFarenheit4(){
        Espresso.onView(withId(R.id.entrada)).perform(clearText());
        Espresso.onView(withId(R.id.entrada)).perform(typeText("-100"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.CFarenheit)).perform(click());
        Espresso.onView(withId(R.id.salida)).check(matches(withText("-148.0")));
    }

    /**
     * Prueba c farenheit 5.
     */
    @Test
    public void pruebaCFarenheit5(){
        Espresso.onView(withId(R.id.entrada)).perform(clearText());
        Espresso.onView(withId(R.id.entrada)).perform(typeText("8"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.CFarenheit)).perform(click());
        Espresso.onView(withId(R.id.salida)).check(matches(withText("46.4")));
    }

    /**
     * Prueba c farenheit 6.
     */
    @Test
    public void pruebaCFarenheit6(){
        Espresso.onView(withId(R.id.entrada)).perform(clearText());
        Espresso.onView(withId(R.id.entrada)).perform(typeText("hola"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.CFarenheit)).perform(click());
        Espresso.onView(withId(R.id.salida)).check(matches(withText("Error")));
    }

    /**
     * Prueba farenheit c 1.
     */
    @Test
    public void pruebaFarenheitC1(){
        Espresso.onView(withId(R.id.entrada)).perform(clearText());
        Espresso.onView(withId(R.id.entrada)).perform(typeText("32"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.FarenheitC)).perform(click());
        Espresso.onView(withId(R.id.salida)).check(matches(withText("0.0")));
    }

    /**
     * Prueba farenheit c 2.
     */
    @Test
    public void pruebaFarenheitC2(){
        Espresso.onView(withId(R.id.entrada)).perform(clearText());
        Espresso.onView(withId(R.id.entrada)).perform(typeText("212"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.FarenheitC)).perform(click());
        Espresso.onView(withId(R.id.salida)).check(matches(withText("100.0")));
    }

    /**
     * Prueba farenheit c 3.
     */
    @Test
    public void pruebaFarenheitC3(){
        Espresso.onView(withId(R.id.entrada)).perform(clearText());
        Espresso.onView(withId(R.id.entrada)).perform(typeText("68"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.FarenheitC)).perform(click());
        Espresso.onView(withId(R.id.salida)).check(matches(withText("20.0")));
    }

    /**
     * Prueba farenheit c 4.
     */
    @Test
    public void pruebaFarenheitC4(){
        Espresso.onView(withId(R.id.entrada)).perform(clearText());
        Espresso.onView(withId(R.id.entrada)).perform(typeText("-148"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.FarenheitC)).perform(click());
        Espresso.onView(withId(R.id.salida)).check(matches(withText("-100.0")));
    }

    /**
     * Prueba farenheit c 5.
     */
    @Test
    public void pruebaFarenheitC5(){
        Espresso.onView(withId(R.id.entrada)).perform(clearText());
        Espresso.onView(withId(R.id.entrada)).perform(typeText("46.4"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.FarenheitC)).perform(click());
        Espresso.onView(withId(R.id.salida)).check(matches(withText("8.0")));
    }

    /**
     * Prueba farenheit c 6.
     */
    @Test
    public void pruebaFarenheitC6(){
        Espresso.onView(withId(R.id.entrada)).perform(clearText());
        Espresso.onView(withId(R.id.entrada)).perform(typeText("si"),closeSoftKeyboard());
        Espresso.onView(withId(R.id.FarenheitC)).perform(click());
        Espresso.onView(withId(R.id.salida)).check(matches(withText("Error")));
    }
}
