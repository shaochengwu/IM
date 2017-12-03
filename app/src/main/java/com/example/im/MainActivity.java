package com.example.im;

import android.widget.TextView;

import com.example.im.common.app.Activity;

import butterknife.BindView;

public class MainActivity extends Activity{
    @BindView(R.id.test)
    TextView mTextView;

    @Override
    protected int getContentLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initWidget() {
        super.initWidget();
        mTextView.setText("Hello");
    }
}
