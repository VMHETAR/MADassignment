package com.example.assignment6py;


import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.appcompat.app.AppCompatActivity;

public class Toggle extends AppCompatActivity {

    private ToggleButton toggleBtn;
    private TextView statusTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleBtn = findViewById(R.id.idBtnToggle);
        statusTV = findViewById(R.id.idTVStatus);

        if (toggleBtn.isChecked()) {
            statusTV.setText("Toggle Button is On");
        } else {
            statusTV.setText("Toggle Button is Off");
        }

        toggleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toggleBtn.isChecked()) {
                    statusTV.setText("Toggle Button is On");
                } else {
                    statusTV.setText("Toggle Button is Off");
                }
            }
        });

    }
}