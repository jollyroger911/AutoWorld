package com.startandroid.firsproject;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class SecondAtivity extends AppCompatActivity {

    Button buttonSettings;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_ativity);
    }


    public void setSettingsTab(View v) {
        Intent intent = new Intent(".MainActivity");
        startActivity(intent);
    }
}
