package com.example.vicky.sunderprojectdemo;

import retrofit2.Call;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface DataInterface {

    @Headers({"Content-Type: application/json"})

    @POST("/api/Store/GetRestaurants")
    Call<JSONResponseData> getData();
}
