package com.startandroid.firsproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class TemplateCars extends AppCompatActivity implements View.OnClickListener{

    Switch switchPicTc;
    Boolean switchState;
    TextView editModel;
    TextView editPower;
    TextView editTorque;
    TextView editVolume;

    TextView editText9;
    TextView editText8;
    TextView editText10;
    TextView editText11;

    Button butt;


    int car = SecondAtivity.chosen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template_cars);
        switchPicTc = (Switch)findViewById(R.id.switchPTC);
        editModel = findViewById(R.id.editModel);
        editPower = findViewById(R.id.editPower);
        editTorque = findViewById(R.id.editTorque);
        editVolume =  findViewById(R.id.editVolume);
        editText9 = findViewById(R.id.editText9);
        editText8 = findViewById(R.id.editText8);
        editText10 = findViewById(R.id.editText10);
        editText11 = findViewById(R.id.editText11);


        editModel.setInputType(InputType.TYPE_NULL);
        editPower.setInputType(InputType.TYPE_NULL);
        editTorque.setInputType(InputType.TYPE_NULL);
        editVolume.setInputType(InputType.TYPE_NULL);
        editText9.setInputType(InputType.TYPE_NULL);
        editText8.setInputType(InputType.TYPE_NULL);
        editText10.setInputType(InputType.TYPE_NULL);
        editText11.setInputType(InputType.TYPE_NULL);

        editModel.setText(SecondAtivity.names[car] + " " + SecondAtivity.model[car]);
        editPower.setText(SecondAtivity.power[car]);
        editTorque.setText(SecondAtivity.torque[car]);
        editVolume.setText(SecondAtivity.volume[car]);
        butt = (Button)findViewById(R.id.backButt);
        butt.setOnClickListener((View.OnClickListener) this);
      //  switchPicTc.setEnabled(false);
        switchPicTc.setOnClickListener((View.OnClickListener) this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.switchPTC:
                switchState = switchPicTc.isChecked();
                if(switchState == false){
                    Intent intent = new Intent(this, TemplateForPics.class);
                    startActivity(intent);
                    finish();
                }

                break;
            case R.id.backButt:
                finish();
                break;
        }
        // dbHelper.close();

    }

    public void onButtClick(View view) {
        Intent intent = new Intent("com.startandroid.firsproject.SecondAtivity");
        startActivity(intent);
        onStop();
    }

}
