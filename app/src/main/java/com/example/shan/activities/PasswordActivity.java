package com.example.shan.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class PasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);

        String ssid = getIntent().getStringExtra("ssid");
        Toast.makeText(PasswordActivity.this, ssid,
                Toast.LENGTH_LONG).show();
    }

}
