package Chapter16;

import java.io.*;

/**
 * Created by YangHC on 2018-01-08.
 */
public class Problem8 {
    private static final String units[] = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private static final String firstTens[] = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String Tens[] = {"Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    private static final String block[] = {"", "Thousand", "Million", "Billion"};

    public static void main(String[] args) throws IOException {
        Problem8 p8 = new Problem8();
        System.out.println("1000 : " + p8.makeStringWholeNumber(1000));
        System.out.println("2023 : " + p8.makeStringWholeNumber(2023));
        System.out.println("0 : " + p8.makeStringWholeNumber(0));
        System.out.println("987723 : " + p8.makeStringWholeNumber(987723));
        System.out.println("987 : " + p8.makeStringWholeNumber(987));
        System.out.println("123 : " + p8.makeStringWholeNumber(123));
        System.out.println("-123 : " + p8.makeStringWholeNumber(-123));
        System.out.println("10 : " + p8.makeStringWholeNumber(10));
        System.out.println("1000000 : " + p8.makeStringWholeNumber(1000000));
        System.out.println("123456789 : " + p8.makeStringWholeNumber(123456789));
        System.out.println("123456789123 : " + p8.makeStringWholeNumber(123456789123l));
    }

    public String makeStringWholeNumber(long number) {
        String numberStr = "";
        if (number == 0) {
            return "Zero";
        } else if (number < 0) {
            numberStr += "Negative";
            number *= -1;
        }
        int devidedNumbers[] = getDevidedNumbers(number);
        for (int i = getCountOfDevidedNumber(number) - 1; i >= 0; i--) {
            if (devidedNumbers[i] != 0) {
                numberStr += " " + makeStringDevidedNumber(devidedNumbers[i]);
                numberStr += " " + block[i];
            }
        }

        return numberStr;
    }

    public String makeStringDevidedNumber(int devidedNumber) {
        if (devidedNumber == 0) {
            return "";
        }
        String result = "";

        if (devidedNumber >= 100) {
            int hundredsInt = devidedNumber / 100;
            String hundredsStr = units[hundredsInt - 1] + " Hundred";

            result += hundredsStr;
        }

        devidedNumber %= 100;

        if (devidedNumber > 0) {
            if (devidedNumber < 20) {
                if (devidedNumber < 10) {
                    result += " " + units[devidedNumber - 1];
                } else {
                    result += " " + firstTens[devidedNumber - 10];
                }
            } else {
                int tensInt = devidedNumber / 10;
                String tensStr = Tens[tensInt - 2];

                result += " " + tensStr;
                int unitsInt = devidedNumber % 10;
                if (devidedNumber % 10 > 0) {
                    String unitsStr = units[unitsInt - 1];
                    result += " " + unitsStr;
                }
            }
        }

        return result;
    }

    public int[] getDevidedNumbers(long number) {
        int devideCount = getCountOfDevidedNumber(number);
        int numberArr[] = new int[devideCount];

        for (int i = 0; i < devideCount; i++) {
            numberArr[i] = (int) (number % 1000);
            number /= 1000;
        }
        return numberArr;
    }

    public int getCountOfDevidedNumber(long number) {
        int devideCount = 1;
        while (number / 1000 > 0) {
            number /= 1000;
            devideCount++;
        }
        return devideCount;
    }
}
