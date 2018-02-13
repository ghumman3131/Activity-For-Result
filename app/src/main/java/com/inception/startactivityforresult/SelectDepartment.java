package com.inception.startactivityforresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SelectDepartment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_department);
    }

    public void cse (View view) {

        //
        Intent i = new Intent();

        i.putExtra("data" , "CSC");

        setResult(5 , i);


        finish();
    }




}
