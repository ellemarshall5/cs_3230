package com.github.ellemarshall5.cs3230.models;

import kong.unirest.json.JSONObject;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class CurrentRate {

    private String exRate;

    public CurrentRate(String rate) {
        this.exRate = rate;
    }

    @Override
    public String toString() {
        return exRate;
    }

    public static String exchange(String currency, String crypto) throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://min-api.cryptocompare.com/data/price?fsym=" + crypto + "&tsyms=" + currency)
                .build();
        Response response = client.newCall(request).execute();
        JSONObject jsonObject = new JSONObject(response.peekBody(2048).string());
        response.close();
        return jsonObject.get(currency).toString();
    }
}


