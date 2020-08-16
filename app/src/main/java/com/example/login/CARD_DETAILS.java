package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class CARD_DETAILS extends AppCompatActivity {


   ImageButton buttod,btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_a_r_d__d_e_t_a_i_l_s);


        buttod = findViewById(R.id.ib3);
        buttod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),SpecialPlan.class);
                startActivity(i);
            }
        });

        btn = findViewById(R.id.ib4);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),cardUpdate.class);
                startActivity(i);
            }
        });
    }
}