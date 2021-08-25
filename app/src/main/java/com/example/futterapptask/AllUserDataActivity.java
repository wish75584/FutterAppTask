package com.example.futterapptask;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class AllUserDataActivity extends AppCompatActivity {


    Retrofit retrofit;
    RetrofitInterface anInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_user_data);

        retrofit = RetrofitApi.getClient();
        anInterface = retrofit.create(RetrofitInterface.class);

        Call<List<UserData>> call = anInterface.userData("Bearer" + "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOnsiaWQiOiI1ZjczNWY5YzcwNTkxNDBiZmJlNjdmY2MiLCJyb2xlIjoiYWRtaW4ifSwiaWF0IjoxNjI5MTg5NzAxLCJleHAiOjE3MTU1ODk3MDF9.HNT-16iUoxmSi39A1WZuHbM9bHht_0Px4Z7ZGdCb8mU");


        call.enqueue(new Callback<List<UserData>>() {
            @Override
            public void onResponse(Call<List<UserData>> call, Response<List<UserData>> response) {
                Toast.makeText(AllUserDataActivity.this, ""+response, Toast.LENGTH_SHORT).show();
                Log.e("response","Response"+response);
                if (response != null) {
                    List<UserData> data = response.body();

                    Toast.makeText(AllUserDataActivity.this, " "+data, Toast.LENGTH_SHORT).show();
//                    int i = 0;
//                    while (i <= data.size()) {
//                        i++;
//                        for (UserData dataList : data) {
//                            for (Payload payload : dataList.getPayload()) {
//                                Toast.makeText(AllUserDataActivity.this, "FirstName = " + payload.getFirstName(), Toast.LENGTH_SHORT).show();
//                            }
//                        }
//                    }
                } else {
                    Toast.makeText(AllUserDataActivity.this, "no data", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<UserData>> call, Throwable t) {
                Toast.makeText(AllUserDataActivity.this, "" + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}