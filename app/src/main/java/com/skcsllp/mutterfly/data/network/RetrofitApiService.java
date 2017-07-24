package com.skcsllp.mutterfly.data.network;

import com.skcsllp.mutterfly.data.network.model.LoginRequest;
import com.skcsllp.mutterfly.data.network.model.LoginResponse;
import com.skcsllp.mutterfly.data.network.model.LogoutResponse;
import com.skcsllp.mutterfly.models.UserModel;
import retrofit2.http.POST;
import retrofit2.Call;

import retrofit2.http.Body;
import retrofit2.http.POST;

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