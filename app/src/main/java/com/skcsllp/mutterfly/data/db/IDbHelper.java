package com.skcsllp.mutterfly.data.db;

import com.skcsllp.mutterfly.models.UserModel;
import java.util.List;

public interface IDbHelper {

    Long insertUser(final UserModel user);

    UserModel getUserModel();

    String getUserId();
}