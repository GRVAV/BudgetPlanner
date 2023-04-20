package com.example.budgetplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sharedPreferences= getSharedPreferences("userDetails",MODE_PRIVATE);
        boolean FirstTime = sharedPreferences.getBoolean("FirstTime",true);

        /*if(FirstTime){
            Intent intent = new Intent(MainActivity.this,user_welcome.class);
            startActivity(intent);

        }
        else{



            Intent intent = new Intent(MainActivity.this,user_welcome.class);
            startActivity(intent);
        }*/
    }
    public void button_click(View view){
        Intent intent = new Intent(MainActivity.this,user_welcome.class);
        startActivity(intent);
    }
}