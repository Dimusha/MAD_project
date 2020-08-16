package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chestactivities extends AppCompatActivity {

    Button push,py,pi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chestactivities);
        push = findViewById(R.id.adex);


        push.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),addnew.class);
                startActivity(i);
            }
        });

        py = findViewById(R.id.upiu);


        py.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),update.class);
                startActivity(i);
            }
        });

        pi = findViewById(R.id.wide);


        pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),steps.class);
                startActivity(i);
            }
        });
    }
}