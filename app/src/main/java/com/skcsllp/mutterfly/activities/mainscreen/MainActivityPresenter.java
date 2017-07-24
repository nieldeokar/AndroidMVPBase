package com.skcsllp.mutterfly.activities.mainscreen;

import android.content.Context;
import android.support.annotation.StringRes;
import com.skcsllp.mutterfly.base.BasePresenter;
import com.skcsllp.mutterfly.data.network.RemoteCallback;
import com.skcsllp.mutterfly.data.network.RetroClient;
import com.skcsllp.mutterfly.data.network.model.LoginRequest;
import com.skcsllp.mutterfly.data.network.model.LoginResponse;

/**
 * Created by Niel on 18/07/17.
 */

public class MainActivityPresenter extends BasePresenter<MainActivityContract.IMainView>
    implements MainActivityContract.MainPresenter {

  public MainActivityPresenter(Context context) {
    super(context);
  }


  @Override public void onSubmitButtonClicked() {
    mPreferenceManager.setCurrentUserName("Ganesh");
  }

  @Override public void onRetriveButtonClicked() {
    mView.setUserName(mPreferenceManager.getCurrentUserName());
  }

  @Override public void getDataFromAPI() {

    RetroClient.getRetroClient()
        .doMutterflyLoginApiCall(new LoginRequest.MutterflyLoginRequest("rs@rs.rs", "rs"))
        .enqueue(new RemoteCallback<LoginResponse>() {
          @Override public void onSuccess(LoginResponse response) {

            if (!isViewAttached()) {
              return;
            }

            mPreferenceManager.setAccessToken(response.getAccessToken());

            mView.setUserName(response.getUserName());
          }

          @Override public void onFailed(Throwable throwable) {

            if (!isViewAttached()) {
              return;
            }
          }
        });
  }
}
