////////////////////////////////////////////////////////////////////
// Riccardo Milan 2068231
// Riccardo Valerio 2075517
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.HashMap;
import java.util.Map;

public class RomanPrinter {
    private static final String ONE_ASCII[] ={
        " _____ ",
        "|_   _|",
        "  | |  ",
        "  | |  ",
        " _| |_ ",
        "|_____|" 
    };

    private static final Map<Character, String[]> romanToAscii = 
        new HashMap<>();
    
    static {
        romanToAscii.put('I', ONE_ASCII);
    }

    public static String print(int num){
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        String result = "";
        String[] lines = new String[]{"", "", "", "", "", ""}; 

        for (char ch : romanNumber.toCharArray()) {
            String[] art = romanToAscii.get(ch);
            for (int i = 0; i < lines.length; i++) {
                lines[i] += art[i] ; 
            }
        }

        for (String line : lines) {
            result+= line + "\n";
        }

        return result;
    }
}