package com.example.homepharmacy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ReportHandling extends AppCompatActivity {

    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_handling);

        button1 = findViewById(R.id.button4);
        button1.setOnClickListener( v -> startActivity(new Intent(ReportHandling.this,ReportCard.class)));
    }
}