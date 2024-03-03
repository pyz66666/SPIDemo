package com.example.spi.autoimpl;

import android.util.Log;

import com.example.spi.PyzAutoSpi;
import com.google.auto.service.AutoService;

@AutoService(PyzAutoSpi.class)
public class AutoSpiTest2 implements PyzAutoSpi {
    private final String TAG = getClass().getSimpleName();
    @Override
    public void onCreate() {
        Log.d(TAG, "onCreate: ");
    }
}
