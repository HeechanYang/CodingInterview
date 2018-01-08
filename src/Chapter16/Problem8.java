package Chapter16;

import java.io.*;

/**
 * Created by YangHC on 2018-01-08.
 */
public class Problem8 {
    private static final String units[] = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private static final String firstTens[] = {"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String Tens[] = {"Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    private static final String block[] = {"", "Thousand", "Million", "Billion"};

    public static void main(String[] args) throws IOException {

    }

    public String makeStringDevidedNumber(int devidedNumber) {
        if (devidedNumber == 0) {
            return "";
        }
        String result="";

        if(devidedNumber>=100){
            int hundredsInt = devidedNumber/100;
            String hundreds =  units[hundredsInt-1] + " Hundred";
            if(hundredsInt != 1) {
                hundreds += "s";
            }
            result += hundreds;
        }

        return result;
    }

    public int[] devideNumber(int number) {
        int devideCount = getCountOfDevidedNumber(number);
        int numberArr[] = new int[devideCount];

        for (int i = 0; i < devideCount; i++) {
            numberArr[i] = number % 1000;
            number /= 1000;
        }
        return numberArr;
    }

    public int getCountOfDevidedNumber(int number) {
        int devideCount = 1;
        while (number / 1000 > 0) {
            number /= 1000;
            devideCount++;
        }
        return devideCount;
    }
}
