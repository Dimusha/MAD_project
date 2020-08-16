package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class yogaex extends AppCompatActivity {

    Button rt,rs,kl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yogaex);

        rt = findViewById(R.id.bigtoe);


        rt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),bigtoepose.class);
                startActivity(i);
            }
        });

        rs = findViewById(R.id.yogaadd);


        rs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),addyogi.class);
                startActivity(i);
            }
        });

        kl = findViewById(R.id.yogaup);


        kl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),updateyogi.class);
                startActivity(i);
            }
        });
    }
}