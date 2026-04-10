package com.example.ise;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.content.Intent;
public class MainActivity extends AppCompatActivity {
    Button submitBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        submitBtn = findViewById(R.id.submitBtn);
        submitBtn.setOnClickListener(v ->{
            Intent intent = new Intent(MainActivity.this,Labs.class);
            startActivity(intent);
        });
    }
}
