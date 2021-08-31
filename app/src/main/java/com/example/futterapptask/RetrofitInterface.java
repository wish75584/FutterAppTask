package com.example.futterapptask;


import com.example.futterapptask.Models.Login;
import com.example.futterapptask.Models.LoginResponse;
import com.example.futterapptask.Models.SearchResult;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

interface RetrofitInterface {
    // @FormUrlEncoded
    @Headers({"Accept: application/json", "Content-Type: application/json"})
    @POST("api/auth/admin")
    //here we are creating login responce with list bcz it contains responce in array
    Call<LoginResponse> userLogin(@Body Login data);


    @GET("api/admin/users")
    Call<UserData> userData(@Header("Authorization") String authToken);


    //search user by name
    @Headers({"Accept: application/json", "Content-Type: application/json"})
    @GET("api/admin/search/{name}")
    Call<SearchResult> searchResult(@Path("name") String name,
                                    @Header("Authorization") String authToken);
}

