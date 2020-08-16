package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class loginact extends AppCompatActivity {

    Button btn,buti,bulti,yogi,pr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginact);
        btn = findViewById(R.id.without);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),without.class);
                startActivity(i);
            }
        });

        buti = findViewById(R.id.about);


        buti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),aboutus.class);
                startActivity(i);
            }
        });

        bulti = findViewById(R.id.with);


        bulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),with.class);
                startActivity(i);
            }
        });

        yogi = findViewById(R.id.yogas);


        yogi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),yoga.class);
                startActivity(i);
            }
        });

        pr = findViewById(R.id.prem);


        pr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),premiumact.class);
                startActivity(i);
            }
        });




    }
}