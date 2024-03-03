package com.example.spi.impl;

import android.util.Log;

import com.example.spi.PyzSpi;

public class SpiTest1 implements PyzSpi {
    private final String TAG = getClass().getSimpleName();
    @Override
    public void onCreate() {
        Log.d(TAG, "onCreate: ");
    }
}
