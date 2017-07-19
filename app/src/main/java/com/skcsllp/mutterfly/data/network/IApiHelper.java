package com.skcsllp.mutterfly.data.network;

import com.skcsllp.mutterfly.data.network.model.LoginRequest;
import com.skcsllp.mutterfly.data.network.model.LoginResponse;
import com.skcsllp.mutterfly.data.network.model.LogoutResponse;
import io.reactivex.Observable;

/**
 * Created by Niel on 19/07/17.
 */

public interface IApiHelper {

  Observable<LoginResponse> doGoogleLoginApiCall(LoginRequest.GoogleLoginRequest request);

  Observable<LoginResponse> doFacebookLoginApiCall(LoginRequest.FacebookLoginRequest request);

  Observable<LoginResponse> doMutterflyLoginApiCall(LoginRequest.MutterflyLoginRequest request);

  Observable<LogoutResponse> doLogoutApiCall();
}
