package com.example.terryyu.uwtfood;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class doneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_done);

        Customer c = new Customer("Arjun");

        Button goBackbtn = (Button) findViewById(R.id.goBackbtn);
        goBackbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent (getApplicationContext(), SecondActivity.class);
                startActivity(startIntent);
            }
        });
    }
}
