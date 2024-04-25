package com.example.login;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RestActivity2 extends AppCompatActivity {

    private Button btnElectricity;
    private Button btnWater;
    private Button btnHouseRenovation;
    private CardView descriptionCardView;
    private Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rest2);
        initializeViews();
        setButtonListeners();
        EdgeToEdge.enable(this);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void initializeViews() {
        btnElectricity = findViewById(R.id.btnElectricity);
        btnWater = findViewById(R.id.btnWater);
        btnHouseRenovation = findViewById(R.id.btnHouseRenovation);
        descriptionCardView = findViewById(R.id.descriptionCardView);
        btnSave = findViewById(R.id.btnSave);
    }

    private void setButtonListeners() {
        btnElectricity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeButtonColor(btnElectricity);
            }
        });

        btnWater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeButtonColor(btnWater);
            }
        });

        btnHouseRenovation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeButtonColor(btnHouseRenovation);
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform save operation here
                // Once saved, reset button colors
                resetButtonColors();
            }
        });
    }

    private void changeButtonColor(Button button) {
        // Change the background color of the clicked button to red
        button.setBackgroundColor(Color.RED);
    }

    private void resetButtonColors() {
        // Reset the background color of all buttons to default
        btnElectricity.setBackgroundColor(Color.TRANSPARENT);
        btnWater.setBackgroundColor(Color.TRANSPARENT);
        btnHouseRenovation.setBackgroundColor(Color.TRANSPARENT);
    }
}
