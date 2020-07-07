package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvSplalsh , tvsubSplalsh;
    Button btnget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvSplalsh = findViewById(R.id.tvSplalsh);
        tvsubSplalsh = findViewById(R.id.tvsubSplalsh);
        btnget = findViewById(R.id.btnget);

    }
}