package com.startandroid.firsproject;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class DBHelper extends SQLiteOpenHelper {

    public DBHelper(Context context) {
        super(context, "myDB", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
     //   Log.d(LOG_TAG, "--- onCreate database ---");
        // создаем таблицу с полями
        db.execSQL("create table mytable ("
                + "id integer primary key autoincrement,"
                + "brand text,"
                + "models text" + ");");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public static class MainActivity extends AppCompatActivity {

        public static boolean mode = false;

        DBHelper dbhelper;

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
                mode = true;
            }

            public void onLightMode (View v){

                mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.lightMode));
                mode = false;
            }
            public void onMainMenu(View v){
                //setContentView(R.layout.activity_menu_tab);
                Intent intent = new Intent("com.startandroid.firsproject.SecondAtivity");
                startActivity(intent);
                onPause();
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
}

