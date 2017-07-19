package com.skcsllp.mutterfly.data;

import com.skcsllp.mutterfly.data.network.IApiHelper;
import com.skcsllp.mutterfly.data.db.IDbHelper;
import com.skcsllp.mutterfly.data.pref.IPreferenceHelper;

/**
 * Created by Niel on 19/07/17.
 */

public interface DataManager extends IDbHelper, IPreferenceHelper, IApiHelper {

  enum LoggedInMode {

    LOGGED_IN_MODE_LOGGED_OUT(0),
    LOGGED_IN_MODE_GOOGLE(1),
    LOGGED_IN_MODE_FB(2),
    LOGGED_IN_MODE_MF(3);

    private final int mType;

    LoggedInMode(int type) {
      mType = type;
    }

    public int getType() {
      return mType;
    }
  }
}
