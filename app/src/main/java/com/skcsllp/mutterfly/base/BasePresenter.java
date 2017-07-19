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

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import com.skcsllp.mutterfly.manager.DataBaseHelperNew;
import com.skcsllp.mutterfly.manager.PreferenceManager;
import com.skcsllp.mutterfly.models.UserModel;

/**
 * Created by Niel on 18/07/17.
 */

public class BasePresenter<V extends IBaseView> {

    protected V mView;

    protected Context mContext;

    protected DataBaseHelperNew mDbHelper;

    protected PreferenceManager mPreferenceManager;

    public BasePresenter(Context context) {
        mContext = context;
        mDbHelper = DataBaseHelperNew.getInstance(context);
        mPreferenceManager = new PreferenceManager(context);
    }


    public void onCreate(){}

    public void attachView(V view){
        this.mView = view;
    }

    public void onDestroy(){
        this.mView = null;
    }

    protected Context getContext(){
        return mContext;
    }

    public void startSoundAnim(View view){
        addScaleAnim(view,1000,null);
    }

    public void startFavoriteAnim(View view,AnimationEndListener listener){
        addScaleAnim(view,500,listener);
    }

    private void addScaleAnim(View view, long duration, final AnimationEndListener listener) {
        ObjectAnimator animY = ObjectAnimator.ofFloat(view, "scaleY", 1f,0.5f, 1f, 1.2f,1f);
        ObjectAnimator animX = ObjectAnimator.ofFloat(view, "scaleX", 1f,0.5f, 1f, 1.2f,1f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animX,animY);
        animatorSet.setDuration(duration);
        animatorSet.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
                if(listener != null){
                    listener.onAnimationEnd(animation);
                }
            }
        });
        animatorSet.start();
    }

    public interface AnimationEndListener{
        void onAnimationEnd(Animator animation);
    }

    public String getUserId(){
        return mPreferenceManager.getStringForKey(PreferenceManager.USER_ID,"");
    }

    public UserModel getUserModel(){
        return mDbHelper.getUserModel();
    }

}
