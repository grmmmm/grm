package com.example.jxxy.grm.activity;

import android.widget.TextView;

import com.example.jxxy.grm.R;
import com.example.jxxy.grm.common.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class MyCollectActivity extends BaseActivity {
    @BindView(R.id.tv_title)
    TextView tvTitle;
    public int getContentViewId(){
        return R.layout.activity_my_collect;
    }
    protected void initView(){
        super.initView();
        tvTitle.setText("我的收藏");
    }
    @OnClick(R.id.iv_back)
    void close(){
        finish();
    }
}
