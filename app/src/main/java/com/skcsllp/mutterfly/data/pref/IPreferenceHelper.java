package com.skcsllp.mutterfly.data.pref;

import com.skcsllp.mutterfly.data.DataManager;

/**
 * Created by Niel on 19/07/17.
 */

public interface IPreferenceHelper {

  int getCurrentUserLoggedInMode();

  void setCurrentUserLoggedInMode(DataManager.LoggedInMode mode);

  Long getCurrentUserId();

  void setCurrentUserId(Long userId);

  String getCurrentUserName();

  void setCurrentUserName(String userName);

  String getCurrentUserEmail();

  void setCurrentUserEmail(String email);

  String getCurrentUserProfilePicUrl();

  void setCurrentUserProfilePicUrl(String profilePicUrl);

  String getAccessToken();

  void setAccessToken(String accessToken);
}
