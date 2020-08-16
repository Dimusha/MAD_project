package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class withchest extends AppCompatActivity {

    Button byi,rew,nmb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_withchest);

        byi = findViewById(R.id.dum);


        byi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),dumblebench.class);
                startActivity(i);
            }
        });
        rew = findViewById(R.id.opio);


        rew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),adding.class);
                startActivity(i);
            }
        });
        nmb = findViewById(R.id.upne);


        nmb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),updating.class);
                startActivity(i);
            }
        });
    }
}