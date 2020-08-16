package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class AddMeal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_meal);
    }

    public void showToast1(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),"STEP DELETED!",Toast.LENGTH_LONG);
        toast.show();
    }

    public void showToast(View view) {
        Toast t = Toast.makeText(getApplicationContext(),"STEP ADDED!",Toast.LENGTH_LONG);
        t.show();
    }
    }
