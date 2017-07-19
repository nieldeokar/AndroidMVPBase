package com.skcsllp.mutterfly.data.db;

import com.skcsllp.mutterfly.models.UserModel;
import io.reactivex.Observable;
import java.util.List;

public interface IDbHelper {

    Observable<Long> insertUser(final UserModel user);

    Observable<List<UserModel>> getAllUsers();

    Observable<Boolean> isQuestionEmpty();

    Observable<Boolean> isOptionEmpty();

}