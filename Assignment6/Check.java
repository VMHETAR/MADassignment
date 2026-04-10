package com.example.assignment6py;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class Check extends AppCompatActivity {
    CheckBox checkBox;
    TextView statusTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_check);

        checkBox = findViewById(R.id.idCheckBox);
        statusTV = findViewById(R.id.idTVStatus);

        if(checkBox.isChecked()){
            statusTV.setText("Checkbox is checked.");
        }
        else{
            statusTV.setText("Checkbox is unchecked.");
        }
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(@NonNull CompoundButton buttonView, boolean isChecked) {
                if(checkBox.isChecked()){
                    statusTV.setText("Checkbox is checked.");
                }
                else{
                    statusTV.setText("Checkbox is unchecked.");
                }
            }
        });
    }
}