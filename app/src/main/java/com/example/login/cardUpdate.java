package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class cardUpdate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_update);
    }

    public void showToast(View view) {
        Toast io = Toast.makeText(getApplicationContext(),"UPDATE CARD DETAILS",Toast.LENGTH_LONG);
        io.show();
    }
}