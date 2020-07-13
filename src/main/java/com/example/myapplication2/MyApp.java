package com.example.myapplication2;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

public class MyApp extends Application {

        @Override
        public void onCreate() {
            super.onCreate();

            Fresco.initialize(this);
        }
}
