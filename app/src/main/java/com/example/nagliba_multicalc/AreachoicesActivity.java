package com.example.nagliba_multicalc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.nagliba_multicalc.R;

public class Area_choices extends AppCompatActivity {

    Button btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.areachoices);
        btn1 = (Button) findViewById(R.id.btn_square);
        btn2 = (Button) findViewById(R.id.btn_rectangle);
        btn3 = (Button) findViewById(R.id.btn_circle);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Area_choices.this, Square.class));
            }

        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Area_choices.this, Rectangle.class));
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Area_choices.this, Circle.class));
            }
        });}}