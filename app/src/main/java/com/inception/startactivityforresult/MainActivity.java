package com.inception.startactivityforresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void select_year(View view) {

        Intent i = new Intent(MainActivity.this , SelectYear.class);

        startActivityForResult(i , 9);
    }

    public void select_department(View v)
    {
        Intent i = new Intent(MainActivity.this , SelectDepartment.class);

        startActivityForResult(i , 4);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if(requestCode == 9) {
            String session = data.getStringExtra("data");

            TextView session_t = findViewById(R.id.session_txt);

            session_t.setText(session);

        }

        if(requestCode == 4)
        {
            String department = data.getStringExtra("data");

            TextView department_t = findViewById(R.id.department_txt);

            department_t.setText(department);

        }

    }


}
