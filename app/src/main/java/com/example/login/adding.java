package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class adding extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adding);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),"NEW EXERCISE ADDED",Toast.LENGTH_LONG);
        toast.show();
    }
}