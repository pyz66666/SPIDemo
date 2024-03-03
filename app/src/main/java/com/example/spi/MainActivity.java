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