package com.example.simulacionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void btnGmail(View view){
        Intent intent = new Intent(MainActivity.this, Gmail.class);
        startActivity(intent);
    }
    public void btnWinzar(View view){
        Intent intent = new Intent(MainActivity.this, Winzip.class);
        startActivity(intent);
    }
    public void btnDrive(View view){
        Intent intent = new Intent(MainActivity.this, Drive.class);
        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        return true;
    }
}