package com.niel.mvpdemo.activities.mainscreen;

import com.niel.mvpdemo.base.IBasePresenter;
import com.niel.mvpdemo.base.IBaseView;

/**
 * Created by Niel on 18/07/17.
 */

public class MainActivityContract {

  public interface IMainView extends IBaseView {
    void setUserName(String mUserName);
  }


  public interface MainPresenter extends IBasePresenter {

    void onSubmitButtonClicked();

    void onRetriveButtonClicked();

    void getDataFromAPI();
  }
}
