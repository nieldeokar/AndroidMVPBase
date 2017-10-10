package com.niel.mvpdemo.activities.mainscreen;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.niel.mvpdemo.R;
import com.niel.mvpdemo.base.BaseActivity;
import com.niel.mvpdemo.models.Demo;
import com.niel.mvpdemo.adapters.DemoAdapter;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity<MainActivityPresenter> implements
    MainActivityContract.IMainView {

    @BindView(R.id.recyclerView) RecyclerView mRecyclerView;

    @BindView(R.id.textView2) TextView mText;

    @Override protected void onCreate(Bundle savedInstanceState) {
        mPresenter = new MainActivityPresenter(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        List<Demo> demos = new ArrayList<>();

        demos.add(new Demo("Ganesh","https://cdn-images-1.medium.com/max/1200/1*hcfIq_37pabmAOnw3rhvGA.png",android.R.drawable.alert_dark_frame));
        demos.add(new Demo("Suresh","https://cdn-images-1.medium.com/max/1200/1*o803-UzA5tud0K4EERP9FQ.png",android.R.drawable.alert_dark_frame));

        DemoAdapter mAdapter = new DemoAdapter(this,demos);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mRecyclerView.setAdapter(mAdapter);


    }

    @Override public void setUserName(String mUserName) {
        mText.setText(mUserName);
    }
}
