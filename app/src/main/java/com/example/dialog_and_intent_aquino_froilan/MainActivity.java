package com.example.dialog_and_intent_aquino_froilan;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button chineseZodiacButton = findViewById(R.id.zodiacButton);
        Button nearValueButton = findViewById(R.id.nearestValueButton);
        Intent chineseZodiacIntent = new Intent(MainActivity.this, ChineseZodiacAnimalInput.class);
        Intent nearValueIntent = new Intent(MainActivity.this, NearestValueTo20Input.class);

        // shorter and cleaner way of starting an activity using lambda
        chineseZodiacButton.setOnClickListener(v -> startActivity(chineseZodiacIntent));
        nearValueButton.setOnClickListener(v -> startActivity(nearValueIntent));

    }
}