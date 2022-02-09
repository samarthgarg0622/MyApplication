package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {

    String tag="MainActivity.tag";
    EditText name,job;
    EditText age;
    Button sb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.Name);
        age = findViewById(R.id.age);
        job = findViewById(R.id.CompanyName);
        sb = findViewById(R.id.SubmitButton);
        sb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("Name", name.getText().toString());
                startActivity(intent);
            }
        });

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