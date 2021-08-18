package com.example.futterapptask;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Response;

public class MyServiceInterceptor  implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        return null;
    }

//    @Inject public MyServiceInterceptor() {
//    }
//
//    public void setSessionToken(String sessionToken) {
//        this.sessionToken = sessionToken;
//    }
//
//
//
//    @Override
//    public Response intercept(Chain chain) throws IOException {
//        Request request = chain.request();
//
//        Request.Builder requestBuilder = request.newBuilder();
//
//        if (request.header(NO_AUTH_HEADER_KEY) == null) {
//            // needs credentials
//            if (sessionToken == null) {
//                throw new RuntimeException("Session token should be defined for auth apis");
//            } else {
//                requestBuilder.addHeader("Cookie", sessionToken);
//            }
//        }
//
//        return chain.proceed(requestBuilder.build());
//    }
}
