////////////////////////////////////////////////////////////////////
// Riccardo Milan 2068231
// Riccardo Valerio 2075517
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    
    public static String convert(int number){
        String[] i = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] x = {"", "X"};
        if (number < 1 || number > 10) {
            throw new IllegalArgumentException(
                "Input must be between 1 and 10"
            );
        }

        String tens = x[(number % 100)/ 10];
        String ones = i[number % 10];
        return tens+ones;
    }    
}
