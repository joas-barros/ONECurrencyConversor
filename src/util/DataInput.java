package util;

import java.util.Scanner;

public class DataInput {
    public static int[] selectCurrencies(Scanner menu) {
        int[] selectedCurrencies = new int[2];
        System.out.println("Enter the currency you want to convert from: ");
        System.out.println("1 - USD");
        System.out.println("2 - ARS");
        System.out.println("3 - BRL");
        System.out.println("4 - EUR");
        System.out.println("5 - COP");
        selectedCurrencies[0] = menu.nextInt();

        System.out.println("Enter the currency you want to convert to: ");
        System.out.println("1 - USD");
        System.out.println("2 - ARS");
        System.out.println("3 - BRL");
        System.out.println("4 - EUR");
        System.out.println("5 - COP");
        selectedCurrencies[1] = menu.nextInt();

        return selectedCurrencies;
    }

    public static double validValue(Scanner menu) {
        double value = 0;
        boolean valid = false;
        while (!valid) {
            System.out.println("Enter the value you want to convert: ");
            value = menu.nextDouble();
            if (value > 0) {
                valid = true;
            } else {
                System.out.println("Invalid value. Please enter a positive number.");
            }
        }
        return value;
    }

    public static void showResult(double valueToConvert, double convertedValue, String currencyOrigin, String currencyDestiny, double exchangeRate) {
        System.out.println("Value to convert: " + valueToConvert + " " + currencyOrigin);
        System.out.println("Converted value: " + convertedValue + " " + currencyDestiny);
        System.out.println("Exchange rate: " + exchangeRate);
    }
}
