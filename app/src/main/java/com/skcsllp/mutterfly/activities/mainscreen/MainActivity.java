package com.skcsllp.mutterfly.activities.mainscreen;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import butterknife.BindView;
import com.skcsllp.mutterfly.R;
import com.skcsllp.mutterfly.base.BaseActivity;
import com.skcsllp.mutterfly.models.Demo;
import com.skcsllp.mutterfly.adapters.DemoAdapter;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity<MainActivityPresenter> implements
    MainActivityContract.IMainView {

    @BindView(R.id.recyclerView) RecyclerView mRecyclerView;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Demo> demos = new ArrayList<>();

        demos.add(new Demo("Ganesh","https://cdn-images-1.medium.com/max/1200/1*hcfIq_37pabmAOnw3rhvGA.png",R.drawable.com_facebook_auth_dialog_background));
        demos.add(new Demo("Suresh","https://cdn-images-1.medium.com/max/1200/1*o803-UzA5tud0K4EERP9FQ.png",R.drawable.com_facebook_auth_dialog_cancel_background));

        DemoAdapter mAdapter = new DemoAdapter(this,demos);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mRecyclerView.setAdapter(mAdapter);


        mPresenter = new MainActivityPresenter(this);



    }

    @Override public void hideProgress() {

    }

    @Override public void showProgress() {

    }
}
