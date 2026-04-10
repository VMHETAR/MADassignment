package com.example.assignment6py;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RadioButtonActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    Button btnCheck;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        btnCheck = findViewById(R.id.btnCheck);
        textView = findViewById(R.id.textView);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int selectedId = radioGroup.getCheckedRadioButtonId();

                if (selectedId == -1) {
                    textView.setText("No option selected");
                } else {
                    RadioButton radioButton = findViewById(selectedId);
                    String selectedText = radioButton.getText().toString();
                    textView.setText("Selected: " + selectedText);
                }
            }
        });
    }
}