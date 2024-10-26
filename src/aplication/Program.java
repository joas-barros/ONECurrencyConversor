package aplication;


import com.google.gson.Gson;

import model.ResultadoConversao;
import util.DataInput;
import util.FileGenerator;
import util.GetCurrencyCode;

import java.io.IOException;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner menu = new Scanner(System.in);
        HttpClient client = HttpClient.newHttpClient();

        System.out.println("=================================================");
        System.out.println("        Welcome to the Currency Converter");
        System.out.println("=================================================");

        int exit;

        while (true){
            int[] currencies = DataInput.selectCurrencies(menu);
            int currencyOrigin = currencies[0];
            int currencyDestiny = currencies[1];



            String currencyOriginCode = GetCurrencyCode.getCurrencyCode(currencyOrigin);
            String currencyDestinyCode = GetCurrencyCode.getCurrencyCode(currencyDestiny);

            if (currencyOriginCode == null || currencyDestinyCode == null){
                System.out.println("Invalid currency code.");
                continue;
            }

            double valueToConvert = DataInput.validValue(menu);

            String link = "https://v6.exchangerate-api.com/v6/87b4fab70c81f405ef866a6e/latest/" + currencyOriginCode;

            try {
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(link))
                        .build();

                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();

                Gson gson = new Gson();

                Map<?, ?> map = gson.fromJson(json, Map.class);
                Map<?, ?> conversionRate = (Map<?, ?>) map.get("conversion_rates");

                double exchangeRate = (double) conversionRate.get(currencyDestinyCode);

                double ConvertedValue = CurrencyConverter(valueToConvert, exchangeRate);

                DataInput.showResult(valueToConvert, ConvertedValue, currencyOriginCode, currencyDestinyCode, exchangeRate);

                ResultadoConversao resultadoConversao = new ResultadoConversao(valueToConvert, ConvertedValue, currencyOriginCode, currencyDestinyCode, exchangeRate);
                FileGenerator.generateJson(resultadoConversao, "conversion");
            } catch (IOException | InterruptedException e) {
                System.out.println("An error occurred while trying to connect to the server.");
            } catch (Exception e){
                System.out.println("An error occurred while trying to convert the value.");
            }

            System.out.println("Do you want to make another conversion? (1 - Yes / 0 - No)");
            exit = menu.nextInt();

            if (exit == 0){
                break;
            }
        }

        System.out.println("Thank you for using the Currency Converter!");
        menu.close();
    }

    public static double CurrencyConverter(double price, double tax){
        return price * tax;
    }
}
