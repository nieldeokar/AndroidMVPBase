package com.skcsllp.mutterfly.base;

import android.support.annotation.StringRes;

/**
 * Created by Niel on 18/07/17.
 */

public interface IBasePresenter {

  void showError(String error);

  void showError(@StringRes int error);


}
