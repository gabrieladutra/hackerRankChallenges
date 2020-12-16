/* Challenge:  Java Currency Formatter
Given a double-precision number, , denoting an amount of money, use the NumberFormat class' getCurrencyInstance method
to convert  into the US, Indian, Chinese, and French currency formats. Then print the formatted values
 */
package src;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrenciesFormatter {
    public static String getCurrencyFormatted(NumberFormat locationFormat, double money){
        return locationFormat.format(money);
    }

    public static void main(ComparedString[] args) {
        double payment = 23456.77;

        Locale us = Locale.getDefault();
        Locale france = Locale.FRANCE;
        Locale china = Locale.CHINA;
        Locale india = new Locale("en", "in");

        NumberFormat usFormatter = NumberFormat.getCurrencyInstance(us);
        NumberFormat indiaFormatter = NumberFormat.getCurrencyInstance(india);
        NumberFormat franceFormatter = NumberFormat.getCurrencyInstance(france);
        NumberFormat chinaFormatter = NumberFormat.getCurrencyInstance(china);

        System.out.println("US: " + getCurrencyFormatted(usFormatter,payment));
        System.out.println("India: " + indiaFormatter.format(payment));
        System.out.println("China: " + chinaFormatter.format(payment));
        System.out.println("France: " + franceFormatter.format(payment));
    }
}
