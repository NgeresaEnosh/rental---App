package com.example.rentals;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize buttons
        LinearLayout profileButton = findViewById(R.id.profile_button);
        LinearLayout helpButton = findViewById(R.id.help_button);
        LinearLayout hostelButton = findViewById(R.id.hostel_button); // Ensure this ID exists in XML

        // Check if buttons are not null before setting click listeners
        if (profileButton != null) {
            profileButton.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ProfileActivity.class)));
        } else {
            Toast.makeText(this, "Profile button not found!", Toast.LENGTH_SHORT).show();
        }

        if (helpButton != null) {
            helpButton.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, HelpActivity.class)));
        } else {
            Toast.makeText(this, "Help button not found!", Toast.LENGTH_SHORT).show();
        }

        if (hostelButton != null) {
            hostelButton.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, HostelsActivity.class)));
        } else {
            Toast.makeText(this, "Hostel button not found!", Toast.LENGTH_SHORT).show();
        }
    }
}
