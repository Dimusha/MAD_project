package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class updateyogi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_updateyogi);
    }

    public void showToast(View view) {
        Toast toio = Toast.makeText(getApplicationContext(),"EXERCISE UPDATED",Toast.LENGTH_LONG);
        toio.show();
    }
}