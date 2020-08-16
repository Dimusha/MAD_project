package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class loginUpdate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_update);
    }

    public void showToast(View view) {
        Toast msg = Toast.makeText(getApplicationContext(),"UPDATE DETAILS",Toast.LENGTH_LONG);
        msg.show();
    }
}