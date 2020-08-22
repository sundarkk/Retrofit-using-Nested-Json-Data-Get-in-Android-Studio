package com.example.vicky.sunderprojectdemo;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static final String BaseUrl = "https://neighbourapi20200614055710.azurewebsites.net";
    private static Retrofit retrofit;

    public static Retrofit getRetrofit(){

        if (retrofit == null){

            retrofit = new Retrofit.Builder()
                    .baseUrl(BaseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
