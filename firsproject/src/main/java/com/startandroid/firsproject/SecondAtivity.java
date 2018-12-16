package com.startandroid.firsproject;


import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class SecondAtivity extends AppCompatActivity{
    public static String [] names;
    public static String [] model;
    public static String [] power;
    public static String [] torque;
    public static String [] volume;
    public static int chosen;
    Button buttonSettings;
    Button buttonUpdate;
    public String data;
    public static int numOfBrands;
    //   public static int numOfBrands;
    public static TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_ativity);
        textview = (TextView) findViewById(R.id.textView);

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonSettings:
                finish();
                break;
            case R.id.buttonUpdate:
                FetchData process = new FetchData();
                process.execute();
                //  textview.setText(names[1]);
                break;
        }
        // dbHelper.close();
    }
    public boolean onCreateOptionsMenu(Menu menu) {

        // TODO Auto-generated method stub
        for(int i = 0; i < numOfBrands; i++) {
            menu.add(i,i,i,names[i]);
        }
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // TODO Auto-generated method stub


        chosen = item.getItemId();
       // textview.setText(Integer.toString(chosen));
        //setContentView(R.layout.activity_template_cars);
       // TemplateCars tmp = new TemplateCars(chosen, names, model, power, torque, volume);
        Intent intent = new Intent(this, TemplateCars.class);
        startActivity(intent);

        return super.onOptionsItemSelected(item);
    }
    public void updateButton (){

    }

    public void setSettingsTab(View v) {
        finish();
    }
    public void setUpdateBut(){
        FetchData process = new FetchData();
        process.execute();

    }
}