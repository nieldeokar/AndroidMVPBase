package com.niel.mvpdemo.data.db;

import com.niel.mvpdemo.models.UserModel;

public interface IDbHelper {

    Long insertUser(final UserModel user);

    UserModel getUserModel();

    String getUserId();
}