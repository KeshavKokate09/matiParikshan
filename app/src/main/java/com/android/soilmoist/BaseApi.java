package com.android.soilmoist;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class BaseApi {
    protected static Retrofit retrofit;
    static Gson gson = new GsonBuilder()
            .setLenient()
            .create();

    public static Retrofit getInstance(){
        if(retrofit==null){
            retrofit=  new Retrofit.Builder()
                    .baseUrl("https://api.thingspeak.com/channels/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
