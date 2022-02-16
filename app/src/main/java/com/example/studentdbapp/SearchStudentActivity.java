package com.example.studentdbapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SearchStudentActivity extends AppCompatActivity {
EditText ed1,ed2,ed3,ed4;
AppCompatButton b1,b2;
String getAdm,getNam,getRollNo,getColl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_student);
        ed1=(EditText) findViewById(R.id.admn);
        ed2=(EditText) findViewById(R.id.nam);
        ed3=(EditText) findViewById(R.id.roll);
        ed4=(EditText) findViewById(R.id.coll);
        b1=(AppCompatButton) findViewById(R.id.search);
        b2=(AppCompatButton) findViewById(R.id.backtogo);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getAdm=ed1.getText().toString();
                Toast.makeText(getApplicationContext(),getAdm, Toast.LENGTH_LONG).show();
            }
        });
    }
}