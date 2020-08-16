package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class update extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
    }
    public void toasting(View view) {
        Toast t = Toast.makeText(getApplicationContext(),"EXERCISE UPDATED",Toast.LENGTH_LONG);
        t.show();
    }
}