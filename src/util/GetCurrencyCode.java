package util;

public class GetCurrencyCode {
    public static String getCurrencyCode(int currency) {
        String currencyCode = null;
        switch (currency) {
            case 1:
                currencyCode = "USD";
                break;
            case 2:
                currencyCode = "ARS";
                break;
            case 3:
                currencyCode = "BRL";
                break;
            case 4:
                currencyCode = "EUR";
                break;
            case 5:
                currencyCode = "COP";
                break;
            default:
                System.out.println("Invalid currency code.");
        }
        return currencyCode;
    }
}
