package com.example.futterapptask;


import com.example.futterapptask.Models.Login;
import com.example.futterapptask.Models.LoginResponse;

import java.util.List;

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


    //getting all user data
    @Headers({"Accept: application/json", "Content-Type: application/json"})
    @GET("api/admin/users")
    Call<List<UserData>> userData(@Header("Authorization") String authHeader);


}
