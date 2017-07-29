package com.niel.mvpdemo.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import com.bumptech.glide.Glide;
import com.niel.mvpdemo.R;
import com.niel.mvpdemo.base.BaseAdapter;
import com.niel.mvpdemo.base.BaseViewHolder;
import com.niel.mvpdemo.models.Demo;
import java.util.List;

/**
 * Created by Niel on 18/07/17.
 */

public class DemoAdapter extends BaseAdapter<Demo, DemoAdapter.DemoViewHolder> {

  public DemoAdapter(Context context, List<Demo> data) {
    super(context, data);
  }

  @Override public final DemoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

    return new DemoViewHolder(parent);
  }

  public class DemoViewHolder extends BaseViewHolder<Demo> {

    @BindView(R.id.textView) TextView tvName;
    @BindView(R.id.imageView) ImageView ivUrl;

    public DemoViewHolder(ViewGroup parent) {
      super(parent, R.layout.row_demo_layout);

      ivUrl.setOnClickListener(new View.OnClickListener() {
        @Override public void onClick(View v) {

        }
      });
    }

    @Override public void onBind(Demo item, int position) {
      tvName.setText(item.name);
      Glide.with(ivUrl.getContext()).load(item.url).into(ivUrl);
    }

    @Override public void onClick(View view, Demo item) {
      Toast.makeText(getContext(), item.name, Toast.LENGTH_SHORT).show();
    }

    @Override public boolean onLongClick(View view, Demo item) {
      return false;
    }
  }
}