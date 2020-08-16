package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class UpdateMeal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_meal);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),"UPDATED",Toast.LENGTH_LONG);
        toast.show();
    }
}