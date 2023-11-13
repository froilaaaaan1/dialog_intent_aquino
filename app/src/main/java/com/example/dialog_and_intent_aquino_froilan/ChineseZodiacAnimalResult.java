package com.example.dialog_and_intent_aquino_froilan;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ChineseZodiacAnimalResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinese_zodiac_animal_result);
        Intent intentObject = getIntent();
        final String NAME = intentObject.getStringExtra("name");
        final int AGE = intentObject.getIntExtra("age", 0);
        final String BIRTHPLACE = intentObject.getStringExtra("birthplace");
        final String GENDER = intentObject.getStringExtra("gender");
        final int BIRTH_YEAR = intentObject.getIntExtra("birth_year", 0);
        final String SIGN = intentObject.getStringExtra("sign");
        TextView nameTextView = findViewById(R.id.nameField);
        TextView ageTextView = findViewById(R.id.ageField);
        TextView birthplaceTextView = findViewById(R.id.birthplaceField);
        TextView genderTextView = findViewById(R.id.genderField);
        TextView birthYearTextView = findViewById(R.id.birthYearField);
        TextView zodiacAnimal = findViewById(R.id.zodiacAnimalField);

        nameTextView.setText(NAME);
        ageTextView.setText(String.valueOf(AGE));
        birthplaceTextView.setText(BIRTHPLACE);
        genderTextView.setText(GENDER);
        birthYearTextView.setText(String.valueOf(BIRTH_YEAR));
        zodiacAnimal.setText(SIGN);
    }
}