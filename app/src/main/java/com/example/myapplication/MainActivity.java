package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    String tag="MainActivity.tag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag,"onStart working");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag, "onResume: onResume working");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag, "onPause: onpause working");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag, "onStop: onStop working");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag, "onDestroy: onDestroy working");
    }
}