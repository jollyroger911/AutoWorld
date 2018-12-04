package com.startandroid.firsproject;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;


public class SecondAtivity extends AppCompatActivity{

    Button buttonSettings;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_ativity);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // TODO Auto-generated method stub

        menu.add("Audi");
        menu.add("BMW");
        menu.add("Mercedes");

        return super.onCreateOptionsMenu(menu);
    }

    public void setSettingsTab(View v) {
       // Intent intent = new Intent(".MainActivity");
       // stopActivity();
      //  SecondAtivity.onStop();
        finish();
    }
}
