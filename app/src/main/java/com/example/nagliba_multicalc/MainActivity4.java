package com.example.nagliba_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.nagliba_multicalc.Area_choices;
import com.example.nagliba_multicalc.R;
import com.example.nagliba_multicalc.Volume_choices;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose);
        btn1 = (Button) findViewById(R.id.btn_volume);
        btn2 = (Button) findViewById(R.id.btn_area);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Volume_choices.class));
            }

        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Area_choices.class));
            }
        });}}