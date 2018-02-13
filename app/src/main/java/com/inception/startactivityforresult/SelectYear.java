package com.inception.startactivityforresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SelectYear extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_year);
    }

    public void session13(View view) {

        Intent i = new Intent();

        i.putExtra("data" , "2013-2018");

        setResult(200 , i);

        finish();


    }
}
