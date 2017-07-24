package com.skcsllp.mutterfly.activities.mainscreen;

import com.skcsllp.mutterfly.base.BasePresenter;
import com.skcsllp.mutterfly.base.IBasePresenter;
import com.skcsllp.mutterfly.base.IBaseView;

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
