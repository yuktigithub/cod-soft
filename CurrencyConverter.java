package com.task3;
//import java.io.IOException;
//import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
//import java.net.URI;
//import java.net.URL;
//import java.net.http.HttpClient;
//import java.net.http.HttpRequest;
//import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {

        HashMap<Integer, String> currencyCode = new HashMap<>();
        currencyCode.put(1,"INR");
        currencyCode.put(2,"USD");
        currencyCode.put(3,"CAD");
        currencyCode.put(4,"EUR");
        currencyCode.put(5,"AUD");
        currencyCode.put(6,"NZD");
        currencyCode.put(7,"HKD");

        HashMap<Integer, Double> currencyExchangeRate = new HashMap<>();

//        currencyExchangeRate.put(1, 83.28);
        // base INR
        currencyExchangeRate.put(2, 0.012);
        currencyExchangeRate.put(3, 0.016);
        currencyExchangeRate.put(4, 0.011);
        currencyExchangeRate.put(5, 0.018);
        currencyExchangeRate.put(6, 0.020);
        currencyExchangeRate.put(7, 0.094);
        


        System.out.println(currencyCode);
        System.out.println("Welcome to the currency convertor !");
        Scanner sc = new Scanner(System.in);
        String from, to;                //
        float amount;
        System.out.println("Currency converting from INR (Indian rupee) to?");
        // System.out.println("Currency converting from?");
        // System.out.println("1: INR (Indian rupee)\t 2: USD (US dollars)\t 3: CAD (Canadian dollar)\t" +
        //         "4: EUR (Euro)\t 5: AUD (Australian dollars)\t 6: NZD (New zealand dollars)\t 7: HKD (Hong Kong dollars)\t");
        // from = currencyCode.get(sc.nextInt());
        // System.out.println("Currency converting to?");
        System.out.println("""
                1: INR (Indian rupee)
                2: USD (US dollars)
                3: CAD (Canadian dollar)
                4: EUR (Euro)
                5: AUD (Australian dollars)
                6: NZD (New zealand dollars)
                7: HKD (Hong Kong dollars)
                """);
        int k = sc.nextInt();       
        to = currencyCode.get(k);
        System.out.println("Enter the amount you want to convert.");
        amount = sc.nextFloat();
         
        //INR TO selected country currency
        double convertedAmount = (amount * currencyExchangeRate.get(k));
        System.out.println("converted Amount = "+ convertedAmount + " " +currencyCode.get(k) );

        System.out.println("Thank you for using the currency convertor!");

    //    String API_KEY = "10e982de8522af3fecf36615";

    //    //BASECODE: 1 USD
    //    String url_str = "https://v6.exchangerate-api.com/v6/10e982de8522af3fecf36615/latest/USD";
    //    var request = HttpRequest.newBuilder().GET().uri(URI.create(url_str)).build();
    //    var client = HttpClient.newBuilder().build();
    //    var response = client.send(request, HttpResponse.BodyHandlers.ofString());
    //    System.out.println(response.statusCode());
    //    var body = response.body();
    //    System.out.println(body.substring(body.indexOf("base_code"), body.length()));
}
}