package com.example.login;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    private TextView username;
    private TextView password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find views by their IDs
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        MaterialButton loginBtn = findViewById(R.id.Loginbtn);

        // Set OnClickListener for the login button
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check if username and password are "admin"
                if (username.getText().toString().equals("admin") &&
                        password.getText().toString().equals("admin")) {
                    // If correct, show success message
                    Toast.makeText(MainActivity.this, "Login successful", Toast.LENGTH_SHORT).show();
                } else {
                    // If incorrect, show failure message
                    Toast.makeText(MainActivity.this, "Login failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
