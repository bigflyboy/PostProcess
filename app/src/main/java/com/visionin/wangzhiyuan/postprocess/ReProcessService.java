package com.visionin.wangzhiyuan.postprocess;

import android.app.Service;
import android.content.Intent;
import android.os.Environment;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReProcessService extends Service {

    private static final String configFilePath = Environment.getExternalStorageDirectory() + "/Visionin/HouseKeeper/Config.txt";

    private static final String TAG = "ReProcessService";

    @Override
    public void onCreate() {
        super.onCreate();

        File file = new File(configFilePath);

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String readline = "";
            while((readline = br.readLine()) != null){
                Log.i(TAG, "readline:" + readline);
            }
            br.close();
            Log.i(TAG, "读取结束");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
        Toast.makeText(getApplicationContext(), "后处理服务开启！", Toast.LENGTH_SHORT).show();

    }

    public ReProcessService() {

    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }


}
