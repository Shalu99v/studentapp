package com.example.studentdbapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
AppCompatButton b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(AppCompatButton) findViewById(R.id.addstud);
        b2=(AppCompatButton) findViewById(R.id.searchstudent);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}