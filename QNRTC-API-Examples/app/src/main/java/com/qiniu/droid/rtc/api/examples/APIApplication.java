package com.qiniu.droid.rtc.api.examples;

import android.app.Application;

import com.uuzuche.lib_zxing.activity.ZXingLibrary;

public class APIApplication extends Application {

    // indicate rtc init, shared by application
    public static boolean mRTCInit = false;

    @Override
    public void onCreate() {
        super.onCreate();
        ZXingLibrary.initDisplayOpinion(this);
    }
}
