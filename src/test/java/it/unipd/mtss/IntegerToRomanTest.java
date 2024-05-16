////////////////////////////////////////////////////////////////////
// Riccardo Milan 2068231
// Riccardo Valerio 2075517
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void testConvertOnetoRoman(){
        assertEquals("I", IntegerToRoman.convert(1));
    }
    @Test
    public void testConvertThreetoRoman(){
        assertEquals("III", IntegerToRoman.convert(3));
    }
    @Test(expected = NumberFormatException.class)
    public void testConvertStringtoRoman(){
        IntegerToRoman.convert(Integer.parseInt("a"));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testConvertNumberMinorOnetoRoman(){
        IntegerToRoman.convert(0);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testConvertNumber4Roman(){
        IntegerToRoman.convert(4);
    }
}