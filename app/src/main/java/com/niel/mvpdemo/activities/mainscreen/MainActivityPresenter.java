package com.niel.mvpdemo.activities.mainscreen;

import android.content.Context;
import com.niel.mvpdemo.base.BasePresenter;
import com.niel.mvpdemo.data.network.RemoteCallback;
import com.niel.mvpdemo.data.network.RetroClient;
import com.niel.mvpdemo.data.network.model.LoginRequest;
import com.niel.mvpdemo.data.network.model.LoginResponse;

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
        .doLoginApiCall(new LoginRequest.ServerLoginRequest("rs@rs.rs", "rs"))
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
