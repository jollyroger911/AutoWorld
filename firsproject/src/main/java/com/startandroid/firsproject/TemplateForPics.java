package com.startandroid.firsproject;

import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;

import java.util.ArrayList;

public class TemplateForPics extends AppCompatActivity {
    Switch switchPicTc2;
    Boolean switchState;
    ImageView frot;
    ImageView back;
    ImageView interior;
    ImageView eng;


     int car = SecondAtivity.chosen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template_for_pics);
        frot = (ImageView) findViewById(R.id.front);
        back =(ImageView) findViewById(R.id.back);
        interior = (ImageView) findViewById(R.id.interior);
        eng = (ImageView) findViewById(R.id.engine);

    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.switchPTC2:
                switchState = switchPicTc2.isChecked();
                if(switchState == false){
                    Intent intent = new Intent(this,TemplateCars.class);
                    startActivity(intent);
                    finish();
                }

                break;
            case R.id.backButt2:
                finish();

                //  textview.setText(names[1]);
                break;
        }
        // dbHelper.close();
    }
    public void setPics(){
        if(car == 0 ) {
            frot.setImageResource(R.drawable.rs6_front);
            back.setImageResource(R.drawable.rs6_bback);
            eng.setImageResource(R.drawable.rs6_engine);
            interior.setImageResource(R.drawable.rs6_inter);
        }
        else if(car == 1){
            frot.setImageResource(R.drawable.m5e60front);
            back.setImageResource(R.drawable.m5_side);
            eng.setImageResource(R.drawable.bmw_m5_motor);
            interior.setImageResource(R.drawable.m5_inside);
        }
        else {
            frot.setImageResource(R.drawable.merc_front);
            back.setImageResource(R.drawable.merc_back);
            eng.setImageResource(R.drawable.engine);
            interior.setImageResource(R.drawable.merc_inside);
        }
    }
}
