package com.skcsllp.mutterfly.data.db;

import com.skcsllp.mutterfly.models.UserModel;
import io.reactivex.Observable;
import java.util.List;

public interface IDbHelper {

    Observable<Long> insertUser(final UserModel user);

    Observable<UserModel> getUserModel();

    Observable<String> getUserId();
}