package com.example.budgetplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class user_welcome extends AppCompatActivity {

    TextView txtheader , txtSubhead ,  txtContent;
    String header , subHead, content;
    Button btnClose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_welcome);

        getSupportActionBar().hide();

        //Declaring Attributes
        txtheader= (TextView) findViewById(R.id.txtHead);
        txtContent= (TextView) findViewById(R.id.txtContent);
        txtSubhead= (TextView) findViewById(R.id.txtSubHead);
        btnClose = (Button) findViewById(R.id.btnClose);


        header="Welcome To Budget Manager";
        txtheader.setText(header);

        subHead="How To Use the Application ";
        txtSubhead.setText(subHead);

        content="\n1.Add the Salary, By clicking the Plus Icon in Salary Section " +
                "\n2.Add the Expenses, By clicking the Plus Icon in Expenses Section  ";
        txtContent.setText(content);


        //Setting Shared Pref's
        SharedPreferences sharedPreferences= getSharedPreferences("userDetails",MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("FirstTime",false);
        editor.apply();

        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(user_welcome.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }
}