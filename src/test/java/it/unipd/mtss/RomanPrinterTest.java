package it.unipd.mtss;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanPrinterTest {

    @Test
    public void printAsciiArt_uno_printed(){
        String one = RomanPrinter.print(1);
        assertEquals(" _____ \n"+
                     "|_   _|\n"+
                     "  | |  \n"+
                     "  | |  \n"+
                     " _| |_ \n"+
                     "|_____|\n" , one);
        }
    
}
