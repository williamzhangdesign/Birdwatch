package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button submit, gotosearch;
    EditText birdname, zipcode, personname;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gotosearch = findViewById(R.id.gotosearch);
        submit = findViewById(R.id.submit);
        birdname = findViewById(R.id.birdname);
        zipcode = findViewById(R.id.zipcode);
        personname = findViewById(R.id.personname);
    }

    @Override
    public void onClick(View v) {
        if (gotosearch == v) {

        }
    }
}
