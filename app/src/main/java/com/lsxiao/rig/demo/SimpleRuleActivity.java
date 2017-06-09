package com.lsxiao.rig.demo;

import android.os.Bundle;

public class SimpleRuleActivity extends BaseActivity {

    @Override
    int getLayoutId() {
        return R.layout.activity_simple_rule;
    }

    @Override
    void afterCreate(Bundle savedInstanceState) {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("简单");
    }
}