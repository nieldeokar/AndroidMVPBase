package com.niel.mvpdemo.data.network;

import com.niel.mvpdemo.data.network.model.LoginRequest;
import com.niel.mvpdemo.data.network.model.LoginResponse;
import com.niel.mvpdemo.data.network.model.LogoutResponse;
import retrofit2.http.POST;
import retrofit2.Call;

import retrofit2.http.Body;

/**
 * Created by Niel on 24/07/17.
 */

public interface RetrofitApiService {

        @POST("/data")
        Call<LoginResponse> doGoogleLoginApiCall(@Body LoginRequest.GoogleLoginRequest request);

        @POST("/data")
        Call<LoginResponse> doFacebookLoginApiCall(@Body LoginRequest.FacebookLoginRequest request);

        @POST("/data")
        Call<LoginResponse> doMutterflyLoginApiCall(@Body LoginRequest.MutterflyLoginRequest request);

        @POST("/doLogout")
        Call<LogoutResponse> doLogoutApiCall();


}