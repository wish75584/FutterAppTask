package com.example.futterapptask;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.futterapptask.Models.Login;
import com.example.futterapptask.Models.LoginResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends Activity {


    EditText et_mail, et_pass;
    Button btn_login;
    Long status_code;
    String message;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_mail = findViewById(R.id.et_email);
        et_pass = findViewById(R.id.et_pass);
        btn_login = findViewById(R.id.button);


        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mail = et_mail.getText().toString();
                String pass = et_pass.getText().toString();


                //creating object of retrofit
                Retrofit retrofit = RetrofitApi.getClient();
                //creating object of retrofit interface
                RetrofitInterface retrofitInterface = retrofit.create(RetrofitInterface.class);
                //RetrofitInterface loginClient = RetrofitInterface.createService(RetrofitInterface.class);

                Call<LoginResponse> call = retrofitInterface.userLogin(new Login(mail, pass));

                call.enqueue(new Callback<LoginResponse>() {

                    @Override
                    public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                        LoginResponse data = response.body();


                        if (data.getStatus().getStatus_code() == 0) {

                            String id = data.getPayload().getUser().get_id();
                            String createdAt = data.getPayload().getUser().getCreatedAt();
                            String token = data.getPayload().getToken();
                            status_code = data.getStatus().getStatus_code();
                            message = data.getStatus().getMessage();
                            String name = data.getPayload().getUser().getName();
                            String email = data.getPayload().getUser().getEmail();
                            Toast.makeText(MainActivity.this, "id =" + id + "\n\ncreatedAt = " + createdAt + "\n\nstatus_code=" + status_code + "\n\nmessage=" + message + "\n\nname" + name + "\n\nmail" + email + "\n\ntoken ="
                                            + token
                                    , Toast.LENGTH_LONG).show();

                            Log.e("LoginResponse", data.toString() + "LoginResponse");

                        } else {
                            status_code = data.getStatus().getStatus_code();
                            message = data.getStatus().getMessage();
                            //if password or email incorrect
                            // Log.v("error message", "e_status_code = " + e_status_code + "\n e_message" + e_message);
                            Toast.makeText(MainActivity.this, "status code" + status_code + "\nmessage =" + message, Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<LoginResponse> call, Throwable t) {
                        Log.e("t.getMessage()", "t.getMessage()" + t.getMessage());
                        Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }
}   