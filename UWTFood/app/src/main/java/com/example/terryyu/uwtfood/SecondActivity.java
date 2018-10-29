package com.example.terryyu.uwtfood;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        ImageButton ThaiImageButton = (ImageButton) findViewById(R.id.ThaiImageButton);
        ThaiImageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent (getApplicationContext(), ThirdActivity.class);
                startActivity(startIntent);
            }
        });

        ImageButton chineseImageButton = (ImageButton) findViewById(R.id.chineseImageButton);
        chineseImageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent (getApplicationContext(), ThirdActivity.class);
                startActivity(startIntent);
            }
        });

        ImageButton VietImageButton = (ImageButton) findViewById(R.id.VietImageButton);
        VietImageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent (getApplicationContext(), ThirdActivity.class);
                startActivity(startIntent);
            }
        });
    }
}
