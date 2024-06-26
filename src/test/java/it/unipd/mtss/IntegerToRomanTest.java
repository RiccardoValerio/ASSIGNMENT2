////////////////////////////////////////////////////////////////////
// Riccardo Milan 2068231
// Riccardo Valerio 2075517
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void Convert_1_I(){
        assertEquals("I", IntegerToRoman.convert(1));
    }
    
    @Test
    public void Convert_3_III(){
        assertEquals("III", IntegerToRoman.convert(3));
    }

    @Test
    public void Convert_10_X(){
        assertEquals("X", IntegerToRoman.convert(10));
    }

    @Test
    public void Convert_20_XX(){
        assertEquals("XX", IntegerToRoman.convert(20));
    }

    @Test
    public void Convert_50_L(){
        assertEquals("L", IntegerToRoman.convert(50));
    }

    @Test
    public void Convert_100_C(){
        assertEquals("C", IntegerToRoman.convert(100));
    }

    @Test
    public void Convert_200_CC(){
        assertEquals("CC", IntegerToRoman.convert(200));
    }

    @Test
    public void Convert_500_D(){
        assertEquals("D", IntegerToRoman.convert(500));
    }

    @Test
    public void Convert_1000_M(){
        assertEquals("M", IntegerToRoman.convert(1000));
    }

    @Test(expected = NumberFormatException.class)
    public void Convert_char_NumberFormatException(){
        IntegerToRoman.convert(Integer.parseInt("a"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void Convert_0_IllegalArgumentException(){
        IntegerToRoman.convert(0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void Convert_1001_IllegalArgumentException(){
        IntegerToRoman.convert(1001);
    }
}