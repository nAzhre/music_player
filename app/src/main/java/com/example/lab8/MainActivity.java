package com.example.lab8;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;

import android.content.Intent;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    private Intent serviceIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        serviceIntent = new Intent(this, MyService.class);
    }

    public void startService(View view)
    {
            this.startForegroundService(serviceIntent);
//        ContextCompat.startForegroundService(this, serviceIntent);
    }

    public void nextActivity(View view)
    {
        startActivity(new Intent(this, MainActivity2.class));
    }

    public void stopService(View view)
    {
        stopService(serviceIntent);
    }
}