package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AddExecise extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_execise);

    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),"MESSAGE DELETED!",Toast.LENGTH_LONG);
        toast.show();
    }

    public void showToast1(View view) {
        Toast t = Toast.makeText(getApplicationContext(),"EXERCISE ADDED!",Toast.LENGTH_LONG);
        t.show();
    }
    }
