package com.skcsllp.mutterfly.activities.mainscreen;

import android.content.Context;
import android.support.annotation.StringRes;
import com.skcsllp.mutterfly.base.BasePresenter;

/**
 * Created by Niel on 18/07/17.
 */

public class MainActivityPresenter extends BasePresenter<MainActivityContract.IMainView> implements
    MainActivityContract.MainPresenter {

  public MainActivityPresenter(Context context) {
    super(context);
  }

  @Override public void showError(String error) {

  }

  @Override public void showError(@StringRes int error) {

  }
}
