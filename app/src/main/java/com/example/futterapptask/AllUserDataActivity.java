package com.example.futterapptask;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.futterapptask.Adapter.AdapterSearchUser;
import com.example.futterapptask.Adapter.AdapterUserData;
import com.example.futterapptask.Models.MorePayload;
import com.example.futterapptask.Models.SearchPayload;
import com.example.futterapptask.Models.SearchResult;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class AllUserDataActivity extends Activity {


    Retrofit retrofit;
    RetrofitInterface anInterface;
    RecyclerView rv_user_data;
    List<MorePayload> list;
    AdapterUserData adapter;
    AdapterSearchUser adapterSearchUser;
    EditText searchUser;
    List<SearchPayload> sr;
    RecyclerView rv_search_data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_user_data);

        retrofit = RetrofitApi.getClient();
        anInterface = retrofit.create(RetrofitInterface.class);
        rv_user_data = findViewById(R.id.rv_user_data);
        rv_user_data.setLayoutManager(new LinearLayoutManager(this));
        searchUser = findViewById(R.id.serachUser);
        rv_search_data = findViewById(R.id.rv_search_data);
        rv_search_data.setLayoutManager(new LinearLayoutManager(this));


        Call<UserData> call = anInterface.userData("Bearer " + "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOnsiaWQiOiI1ZjczNWY5YzcwNTkxNDBiZmJlNjdmY2MiLCJyb2xlIjoiYWRtaW4ifSwiaWF0IjoxNjI5MTg5NzAxLCJleHAiOjE3MTU1ODk3MDF9.HNT-16iUoxmSi39A1WZuHbM9bHht_0Px4Z7ZGdCb8mU");

        call.enqueue(new Callback<UserData>() {
            @Override
            public void onResponse(Call<UserData> call, Response<UserData> response) {

                list = response.body().getMorePayloads();
                // Toast.makeText(AllUserDataActivity.this, list.size(), Toast.LENGTH_SHORT).show();
                if (response != null) {
                    adapter = new AdapterUserData(list, AllUserDataActivity.this);
                    rv_user_data.setAdapter(adapter);
                } else {
                    Toast.makeText(AllUserDataActivity.this, " Failed", Toast.LENGTH_SHORT).show();
                }
            }
            @Override
            public void onFailure(Call<UserData> call, Throwable t) {
                Toast.makeText(AllUserDataActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void searchResult(View view) {
        rv_user_data.setVisibility(View.GONE);
        rv_search_data.setVisibility(View.VISIBLE);

        String name = searchUser.getText().toString();
        Call<SearchResult> call = anInterface.searchResult(name,
                "Bearer " + "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOnsiaWQiOiI1ZjczNWY5YzcwNTkxNDBiZmJlNjdmY2MiLCJyb2xlIjoiYWRtaW4ifSwiaWF0IjoxNjI5MTg5NzAxLCJleHAiOjE3MTU1ODk3MDF9.HNT-16iUoxmSi39A1WZuHbM9bHht_0Px4Z7ZGdCb8mU");


        call.enqueue(new Callback<SearchResult>() {
            @Override
            public void onResponse(Call<SearchResult> call, Response<SearchResult> response) {
                //for clearing recycler data
                sr = response.body().getSr_payload();
                adapterSearchUser = new AdapterSearchUser(sr, AllUserDataActivity.this);
                rv_search_data.setAdapter(adapterSearchUser);
            }

            @Override
            public void onFailure(Call<SearchResult> call, Throwable t) {
                Toast.makeText(AllUserDataActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
