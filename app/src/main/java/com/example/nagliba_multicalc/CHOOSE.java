package com.example.nagliba_multicalc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.nagliba_multicalc.Rectangle;
import com.example.nagliba_multicalc.Square;
import com.example.nagliba_multicalc.R;

public class Choose extends AppCompatActivity {

    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.areachoices);
        btn1 = (Button) findViewById(R.id.btn_volume);
        btn2 = (Button) findViewById(R.id.btn_area);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Choose.this, Square.class));
            }

        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Choose.this, Rectangle.class));
            }
        });}}