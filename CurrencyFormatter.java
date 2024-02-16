//** Need To FIX india Currency **\\

import java.util.*;
import java.text.*;

public class CurrencyFormatter 
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        double payment = in.nextDouble();
        in.close();

        String us = FormatCurrency(Locale.US, payment);
        String india = FormatCurrency(Currency.getInstance("INR"), payment);
        String china = FormatCurrency(Locale.CHINA, payment);
        String france = FormatCurrency(Locale.FRANCE, payment);


        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);

    }

    private static String FormatCurrency(Currency instance, double payment) {
        return NumberFormat.getCurrencyInstance(Locale.getDefault()).format(payment);
    }

    public static String FormatCurrency(Locale locale , double money)
    {
        return NumberFormat.getCurrencyInstance(locale).format(money);
    }
}
