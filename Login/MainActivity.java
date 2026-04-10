package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText Username, Password;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Username = findViewById(R.id.username);
        Password = findViewById(R.id.password);
        btnSubmit = findViewById(R.id.button);

        btnSubmit.setOnClickListener(v -> {
            String username = Username.getText().toString().trim();
            String password = Password.getText().toString().trim();

            Intent launchIntent = getPackageManager()
                    .getLaunchIntentForPackage("com.example.profile");

            if (launchIntent != null) {
                launchIntent.putExtra("USERNAME", username);
                launchIntent.putExtra("PASSWORD", password);

                startActivity(launchIntent);
            } else {
                Toast.makeText(MainActivity.this,
                        "Target app not installed!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
