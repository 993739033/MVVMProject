package com.scode.mvvmproject;

import android.util.Log;

import androidx.lifecycle.LifecycleService;

public class MyLocationService extends LifecycleService {

    public MyLocationService() {
        Log.d("log1", "MyLocationService: ");
        MyLocationObserver observer = new MyLocationObserver(this);
        getLifecycle().addObserver(observer);
    }
}
