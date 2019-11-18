package com.example.shan.activities;

import android.app.ActivityManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getPassword(View view){

        EditText editText = findViewById(R.id.editTextSSID);
        String ssid = editText.getText().toString();

        Intent intent = new Intent(MainActivity.this,
                PasswordActivity.class);
        intent.putExtra("ssid", ssid);
        //startActivity(intent);
        startActivityForResult(intent, 2);
    }


    @Override
    public void onActivityResult(int reqCode, int resCode,
                                 Intent result){
        if(reqCode== 2 && resCode == RESULT_OK){
            Toast.makeText(MainActivity.this,
                    result.getStringExtra("wifiPassword"),
                    Toast.LENGTH_LONG).show();
        }
    }



    @Override
    public void onPause(){
        super.onPause();
        Log.d("MainActivityEvent", "main activity paused");
    }
}
