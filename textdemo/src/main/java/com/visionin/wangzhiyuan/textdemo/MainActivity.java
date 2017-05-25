package com.visionin.wangzhiyuan.textdemo;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button mBtnSendBroadcast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnSendBroadcast = (Button) findViewById(R.id.send_broadcast);

        mBtnSendBroadcast.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent("com.visionin.POSTPROCESS");

        startService(intent);
    }

}
