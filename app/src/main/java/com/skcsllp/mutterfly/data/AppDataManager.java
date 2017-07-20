package com.skcsllp.mutterfly.data;

import android.content.Context;
import com.skcsllp.mutterfly.data.db.IDbHelper;
import com.skcsllp.mutterfly.data.network.IApiHelper;
import com.skcsllp.mutterfly.data.network.model.LoginRequest;
import com.skcsllp.mutterfly.data.network.model.LoginResponse;
import com.skcsllp.mutterfly.data.network.model.LogoutResponse;
import com.skcsllp.mutterfly.data.pref.IPreferenceHelper;
import com.skcsllp.mutterfly.models.UserModel;
import io.reactivex.Observable;
import java.util.List;

/**
 * Created by Niel on 19/07/17.
 */

public class AppDataManager implements DataManager {


  private static final String TAG = "AppDataManager";

  private final Context mContext;
  private final IDbHelper mDbHelper;
  private final IPreferenceHelper mPreferencesHelper;
  private final IApiHelper mApiHelper;

  private static AppDataManager mAppDataManager;

  /*private static synchronized AppDataManager getAppDataManager(Context mContext){

    if (mAppDataManager == null) {
      mAppDataManager = new AppDataManager(mContext.getApplicationContext());
    }
    return mAppDataManager;
  }*/

  private AppDataManager( Context context,
      IDbHelper dbHelper,
      IPreferenceHelper preferencesHelper,
      IApiHelper apiHelper) {
    mContext = context;
    mDbHelper = dbHelper;
    mPreferencesHelper = preferencesHelper;
    mApiHelper = apiHelper;
  }


  @Override public int getCurrentUserLoggedInMode() {
    return mPreferencesHelper.getCurrentUserLoggedInMode();
  }

  @Override public void setCurrentUserLoggedInMode(LoggedInMode mode) {
    mPreferencesHelper.setCurrentUserLoggedInMode(mode);
  }

  @Override public Long getCurrentUserId() {
    return null;
  }

  @Override public void setCurrentUserId(Long userId) {

  }

  @Override public String getCurrentUserName() {
    return null;
  }

  @Override public void setCurrentUserName(String userName) {

  }

  @Override public String getCurrentUserEmail() {
    return null;
  }

  @Override public void setCurrentUserEmail(String email) {

  }

  @Override public String getCurrentUserProfilePicUrl() {
    return null;
  }

  @Override public void setCurrentUserProfilePicUrl(String profilePicUrl) {

  }

  @Override public String getAccessToken() {
    return null;
  }

  @Override public void setAccessToken(String accessToken) {

  }

  @Override public Observable<Long> insertUser(UserModel user) {
    return null;
  }

  @Override public Observable<List<UserModel>> getAllUsers() {
    return null;
  }

  @Override public Observable<Boolean> isQuestionEmpty() {
    return null;
  }

  @Override public Observable<Boolean> isOptionEmpty() {
    return null;
  }

  @Override
  public Observable<LoginResponse> doGoogleLoginApiCall(LoginRequest.GoogleLoginRequest request) {
    return null;
  }

  @Override public Observable<LoginResponse> doFacebookLoginApiCall(
      LoginRequest.FacebookLoginRequest request) {
    return null;
  }

  @Override public Observable<LoginResponse> doMutterflyLoginApiCall(
      LoginRequest.MutterflyLoginRequest request) {
    return null;
  }

  @Override public Observable<LogoutResponse> doLogoutApiCall() {
    return null;
  }
}
