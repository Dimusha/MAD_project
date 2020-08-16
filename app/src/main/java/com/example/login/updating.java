package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class updating extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_updating);
    }

    public void showToast(View view) {
        Toast tos = Toast.makeText(getApplicationContext(),"EXERCISE UPDATED",Toast.LENGTH_LONG);
        tos.show();
    }
}