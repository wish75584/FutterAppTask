package com.example.futterapptask;

import android.service.autofill.UserData;

import com.example.futterapptask.Models.Login;
import com.example.futterapptask.Models.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

interface RetrofitInterface {
    // @FormUrlEncoded
    @Headers({"Accept: application/json", "Content-Type: application/json"})
    @POST("api/auth/admin")
    //here we are creating login responce with list bcz it contains responce in array
    Call<LoginResponse> userLogin(@Body Login data);



//eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOnsiaWQiOiI1ZjczNWY5YzcwNTkxNDBiZmJlNjdmY2MiLCJyb2xlIjoiYWRtaW4ifSwiaWF0IjoxNjI5MTg5NzAxLCJleHAiOjE3MTU1ODk3MDF9.HNT-16iUoxmSi39A1WZuHbM9bHht_0Px4Z7ZGdCb8mU
    @GET("api/admin/users")
    Call<UserData> userData(@Header("Authorization") String authHeader);
}
