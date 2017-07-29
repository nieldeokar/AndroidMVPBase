package com.niel.mvpdemo;

import android.app.Application;
import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;

/**
 * Created by Niel on 14/07/17.
 */

public class AppController extends Application {

  @Override public void onCreate() {
    super.onCreate();

    if (!BuildConfig.DEBUG) {
      Fabric.with(this, new Crashlytics());
    //  logUser();
    }
  }

/*
  private void logUser() {

    new Handler().post(new Runnable() {
      @Override public void run() {
        UserModel mUser = DataBaseHelperNew.getInstance(getAppContext()).getUserModel();

        if(mUser!=null && mUser.mUserId != 0){
          Crashlytics.setUserIdentifier(String.valueOf(mUser.mUserId));
          Crashlytics.setUserEmail(String.valueOf(mUser.mEmail));
          Crashlytics.setUserName(String.valueOf(mUser.mFname + " "+ mUser.mLname));
        }
      }
    });

  }*/
}
