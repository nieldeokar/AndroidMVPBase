/*
 *  Copyright (C) 2015 GuDong <gudong.name@gmail.com>
 *
 *  This file is part of GdTranslate
 *
 *  GdTranslate is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  GdTranslate is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with GdTranslate.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package com.skcsllp.mutterfly.base;

import android.support.annotation.StringRes;

/**
 * Created by Niel on 18/07/17.
 */
public interface IBaseView {

  void showLoading();

  void hideLoading();

  void onError(@StringRes int resId);

  void onError(String message);

  void showMessage(String message);

  void showMessage(@StringRes int resId);

  boolean isNetworkConnected();

  void hideKeyboard();

}

