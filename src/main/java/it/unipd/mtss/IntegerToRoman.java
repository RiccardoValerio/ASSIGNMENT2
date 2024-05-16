////////////////////////////////////////////////////////////////////
// Riccardo Milan 2068231
// Riccardo Valerio 2075517
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
    
    public static String convert(int number){
        String[] i = {"I", "II", "III"};

        if (number < 1 || number > 3) {
            throw new IllegalArgumentException(
                "Input must be between 1 and 3"
            );
        }

        int pos=number-1;
        String res=i[pos];
        return res;
    }    
}
