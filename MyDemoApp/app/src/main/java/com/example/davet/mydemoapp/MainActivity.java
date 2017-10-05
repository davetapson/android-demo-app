package com.example.davet.mydemoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void logIn(View view){
        EditText txtUserName = (EditText) findViewById(R.id.txtUserName);
        EditText txtPassword = (EditText) findViewById(R.id.txtPassword);

        Log.i("Info", txtUserName.getText().toString());
        Log.i("Info", txtPassword.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
