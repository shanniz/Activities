package com.example.shan.activities;

import android.app.ActivityManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getPassword(View view){
        Intent intent = new Intent(MainActivity.this,
                PasswordActivity.class);
        intent.putExtra("ssid", "Smart University");
        startActivity(intent);
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.d("MainActivityEvent", "main activity paused");
    }
}
