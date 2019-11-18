package com.example.shan.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);

        String ssid = getIntent().getStringExtra("ssid");
        TextView textView = findViewById(R.id.textViewSSID);
        textView.setText(ssid);
    }

    public void returnPassword(View view){

        EditText editText = findViewById(R.id.editTextPassword);

        Intent intent = new Intent();
        intent.putExtra("wifiPassword",
                editText.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }

}
