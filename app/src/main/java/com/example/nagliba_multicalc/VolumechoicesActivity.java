package com.example.nagliba_multicalc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.nagliba_multicalc.R;

public class Volume_choices extends AppCompatActivity {

    Button btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.volumechoices);
        btn1 = (Button) findViewById(R.id.btn_square);
        btn2 = (Button) findViewById(R.id.btn_rectangular);
        btn3 = (Button) findViewById(R.id.btn_cube);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Volume_choices.this, Cone.class));
            }

        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Volume_choices.this, Rectangularprism.class));
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Volume_choices.this, Cube.class));
            }
        });}}}