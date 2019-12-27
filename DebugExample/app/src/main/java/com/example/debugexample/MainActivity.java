package com.example.debugexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String an = "android@@";

        Log.e("MainActivity : ",an);
        Log.d("MainActivity : ",an);

        // android Number, It has not meanning;
        int a = 10;

        Log.e("MainActivity", String.valueOf(a));
        Log.d("MainActivity", String.valueOf(a));

    }
}
