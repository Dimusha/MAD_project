package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class addyogi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addyogi);
    }

    public void showToast(View view) {
        Toast tore = Toast.makeText(getApplicationContext(),"NEW EXERCISE ADDED",Toast.LENGTH_LONG);
        tore.show();
    }
}