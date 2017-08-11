package com.androiddev.zf.uselibrarydemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.androiddev.zf.fakesdk.ConfuseUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConfuseUtil confuseUtil = new ConfuseUtil();
        confuseUtil.publicConfuse();
    }
}
