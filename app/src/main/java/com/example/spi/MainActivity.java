package com.example.spi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.Iterator;
import java.util.ServiceLoader;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initSPI();
        initAutoSpi();
    }

    /**
     * AutoService创建SPI
     */
    private void initAutoSpi() {
        Log.d(TAG, "initAutoSpi: ");
        ServiceLoader<PyzAutoSpi> serviceLoader = ServiceLoader.load(PyzAutoSpi.class);
        for (PyzAutoSpi pyzSpi : serviceLoader) {
            pyzSpi.onCreate();
        }
    }

    /**
     * 手动创建SPI
     */
    private void initSPI() {
        Log.d(TAG, "initSPI: ");
        ServiceLoader<PyzSpi> serviceLoader = ServiceLoader.load(PyzSpi.class);
        for (PyzSpi pyzSpi : serviceLoader) {
            pyzSpi.onCreate();
        }
    }
}