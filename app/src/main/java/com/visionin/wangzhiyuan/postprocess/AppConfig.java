package com.visionin.wangzhiyuan.postprocess;

/**
 * Created by wangzhiyuan on 2017/5/26.
 */

public class AppConfig {

    private AppConfig(){

    }

    static private AppConfig appConfig;

    static public AppConfig getInstance(){
        if(appConfig == null){
            appConfig = new AppConfig();
        }
        return appConfig;
    }
}
