package com.github.alexhagen.cpv.example;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.github.alexhagen.cpv.CircularProgressView;
import com.github.alexhagen.cpv.CircularProgressViewAdapter;


public class MainActivity extends Activity {

    CircularProgressView progressView;
    Thread updateThread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

}
