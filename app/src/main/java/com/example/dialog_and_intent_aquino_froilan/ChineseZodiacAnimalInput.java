package com.example.dialog_and_intent_aquino_froilan;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

import java.time.Year;

public class ChineseZodiacAnimalInput extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinese_zodiac_animal_input);

        final int[] SNAKE = {1941, 1953, 1965, 1977, 1989, 2001, 2013};
        final int[] HORSE = {1942, 1954, 1966, 1978, 1990, 2002, 2014};
        final int[] GOAT = {1943, 1955, 1967, 1979, 1991, 2003, 2015};
        final int[] MONKEY = {1944, 1956, 1968, 1980, 1992, 2004, 2016};
        final int[] ROOSTER = {1945, 1957, 1969, 1981, 1993, 2005, 2017};
        final int[] DOG = {1946, 1958, 1970, 1982, 1994, 2006, 2018};
        final int[] PIG = {1947, 1959, 1971, 1983, 1995, 2007, 2019};
        final int[] RAT = {1948, 1960, 1972, 1984, 1996, 2008, 2020};
        final int[] OX = {1949, 1961, 1973, 1985, 1997, 2009, 2021};
        final int[] TIGER = {1950, 1962, 1974, 1986, 1998, 2010, 2022};
        final int[] RABBIT = {1951, 1963, 1975, 1987, 1999, 2011, 2023};
        final int[] DRAGON = {1952, 1964, 1976, 1988, 2000, 2012, 2024};
        Button result = findViewById(R.id.resultButton);
        EditText nameTextfield = findViewById(R.id.nameTextField);
        EditText birthplaceTextField = findViewById(R.id.birthplaceTextField);
        EditText birthYearTextField = findViewById(R.id.birthYearTextField);
        RadioButton maleRadioButton = findViewById(R.id.maleRadioButton);
        RadioButton femaleRadioButton = findViewById(R.id.femaleRadioButton);
        RadioButton nonBinaryRadioButton = findViewById(R.id.nonBinaryRadioButton);

        result.setOnClickListener(v -> {
            Intent intentObject = new Intent(ChineseZodiacAnimalInput.this, ChineseZodiacAnimalResult.class);
            String gender;
            String sign;
            String name = nameTextfield.getText().toString();
            String birthplace = birthplaceTextField.getText().toString();
            int birthYear = Integer.parseInt(birthYearTextField.getText().toString());
            int age = Math.abs(Integer.parseInt(birthYearTextField.getText().toString()) - Integer.parseInt(String.valueOf(Year.now())));
            if (maleRadioButton.isChecked())
                gender = "Male";
            else if (femaleRadioButton.isChecked())
                gender = "Female";
            else if (nonBinaryRadioButton.isChecked())
                gender = "Non-Binary";
            else
                gender = "Not Specified";

            findZodiacSign:
            while (true) {
                for (int year : SNAKE) {
                    if (birthYear == year) {
                        sign = "SNAKE";
                        break findZodiacSign;
                    }
                }

                for (int year : HORSE) {
                    if (birthYear == year) {
                        sign = "HORSE";
                        break findZodiacSign;
                    }
                }

                for (int year : GOAT) {
                    if (birthYear == year) {
                        sign = "GOAT";
                        break findZodiacSign;
                    }
                }

                for (int year : MONKEY) {
                    if (birthYear == year) {
                        sign = "MONKEY";
                        break findZodiacSign;
                    }
                }

                for (int year : ROOSTER) {
                    if (birthYear == year) {
                        sign = "ROOSTER";
                        break findZodiacSign;
                    }
                }

                for (int year : DOG) {
                    if (birthYear == year) {
                        sign = "DOG";
                        break findZodiacSign;
                    }
                }

                for (int year : PIG) {
                    if (birthYear == year) {
                        sign = "ROOSTER";
                        break findZodiacSign;
                    }
                }

                for (int year : RAT) {
                    if (birthYear == year) {
                        sign = "RAT";
                        break findZodiacSign;
                    }
                }

                for (int year : TIGER) {
                    if (birthYear == year) {
                        sign = "TIGER";
                        break findZodiacSign;
                    }
                }

                for (int year : RABBIT) {
                    if (birthYear == year) {
                        sign = "RABBIT";
                        break findZodiacSign;
                    }
                }

                for (int year : DRAGON) {
                    if (birthYear == year) {
                        sign = "DRAGON";
                        break findZodiacSign;
                    }
                }

                for (int year : OX) {
                    if (birthYear == year) {
                        sign = "OX";
                        break findZodiacSign;
                    }
                }

            }

            intentObject.putExtra("name", name);
            intentObject.putExtra("age", age);
            intentObject.putExtra("birthplace", birthplace);
            intentObject.putExtra("gender", gender);
            intentObject.putExtra("birth_year", birthYear);
            intentObject.putExtra("sign", sign);
            startActivity(intentObject);

        });
    }
}