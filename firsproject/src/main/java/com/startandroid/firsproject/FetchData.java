package com.startandroid.firsproject;

import android.os.AsyncTask;

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

public class FetchData extends AsyncTask<Void,Void,Void> {
    String data = "";
    @Override
    protected Void doInBackground(Void... voids) {
        try{
            URL url = new URL("https://api.myjson.com/bins/190ry6");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream is = httpURLConnection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line = "";
            while (line != null){
                line = br.readLine();
                data = data + line;
            }
            JSONArray ja = new JSONArray(data);
            SecondAtivity.numOfBrands = ja.length();
            SecondAtivity.names  = new String [SecondAtivity.numOfBrands];
            SecondAtivity.power = new String[SecondAtivity.numOfBrands];
            SecondAtivity.torque  = new String [SecondAtivity.numOfBrands];
            SecondAtivity.model = new String[SecondAtivity.numOfBrands];
            SecondAtivity.volume  = new String [SecondAtivity.numOfBrands];

            for (int i = 0; i < ja.length(); i++){
                JSONObject jo = (JSONObject) ja.get(i);
                SecondAtivity.names[i] = (String) jo.get("brand");
                SecondAtivity.model[i] = (String) jo.get("modelName");
                SecondAtivity.power[i] = (String) jo.get("power");
                SecondAtivity.torque[i] = (String) jo.get("torque");
                SecondAtivity.volume[i] = (String) jo.get("volume");
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

}