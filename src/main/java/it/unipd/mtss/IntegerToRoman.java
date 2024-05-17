////////////////////////////////////////////////////////////////////
// Riccardo Milan 2068231
// Riccardo Valerio 2075517
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    
    private static String[] i = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    private static String[] x = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    private static String[] c = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    private static String[] m = {"", "M"};
    public static String convert(int number){

        if (number < 1 || number > 1000) {
            throw new IllegalArgumentException(
                "Input must be between 1 and 1000"
            );
        }

        String thousands = m[number / 1000];
        String hundreds = c[(number % 1000) /100];
        String tens = x[(number % 100)/ 10];
        String ones = i[number % 10];
        
        return thousands+hundreds+tens+ones;
    }    
}
