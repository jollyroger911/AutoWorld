package com.startandroid.firsproject;

import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonDM;
    Button buttonLM;
    Button buttonEscSet;
    private ConstraintLayout mConstraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mConstraintLayout = (ConstraintLayout) findViewById(R.id.constraintLayout);
        buttonDM = (Button) findViewById(R.id.buttonDarkMode);
        buttonDM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mConstraintLayout.setBackgroundColor(ContextCompat
                        .getColor(MainActivity.this, R.color.darkMode));
            }
        });
    }
        public void onDarkMode (View v){

            mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.darkMode));
        }

        public void onLightMode (View v){

            mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.lightMode));
        }
        public void onMainMenu(View v){
            setContentView(R.layout.activity_menu_tab);
        }

        /*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // private ConstraintLayout mConstraintLayout;
        buttonDM = (Button) findViewById(R.id.buttonDarkMode);
        buttonLM = (Button) findViewById(R.id.buttonLightMode);

        View.OnClickListener oclBtn = new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                // по id определеяем кнопку, вызвавшую этот обработчик
                switch (v.getId()) {
                    case R.id.buttonDarkMode:
                        // кнопка dark mode
                        mConstraintLayout.setBackgroundColor(ContextCompat
                                .getColor(MainActivity.this, R.color.darkMode));
                        break;
                    case R.id.buttonLightMode:
                        // кнопка light mode
                        mConstraintLayout.setBackgroundColor(ContextCompat
                                .getColor(MainActivity.this, R.color.lightMode));
                        break;
                    }

                }
            public void onDarkMode(View view) {

                mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.darkMode));
            }

            public void onGreenButtonClick(View view) {
                mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.lightMode));
            }
            };
    }*/
}
