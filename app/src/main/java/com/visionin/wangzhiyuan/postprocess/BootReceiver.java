package com.visionin.wangzhiyuan.postprocess;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BootReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

//        Toast.makeText(Context, "后处理模块", Toast.LENGTH_SHORT).show();
        Intent intent1 = new Intent(context, ReProcessService.class);
        context.startService(intent1);
    }
}
