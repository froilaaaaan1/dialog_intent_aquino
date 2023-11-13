package com.example.dialog_and_intent_aquino_froilan;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class NearestValueTo20Input extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nearest_value_to20_input);
        Toast toastObject = new Toast(NearestValueTo20Input.this);
        EditText firstTextfield = findViewById(R.id.firstNumberTextField);
        EditText secondTextfield = findViewById(R.id.secondNumberTextField);
        EditText thirdTextfield = findViewById(R.id.thirdNumberTextField);
        Button getNearest = findViewById(R.id.getNearest);

        getNearest.setOnClickListener(v -> {
            int firstNumber = Integer.parseInt(firstTextfield.getText().toString());
            int secondNumber = Integer.parseInt(secondTextfield.getText().toString());
            int thirdNumber = Integer.parseInt(thirdTextfield.getText().toString());
            int[] numbers = {firstNumber, secondNumber, thirdNumber};
            int nearest = 2147483647;
            for (int number : numbers) {
                if (Math.abs(number - 20) < nearest) {
                    nearest = number;
                }
            }

            AlertDialog.Builder prompt = new AlertDialog.Builder(NearestValueTo20Input.this);
            prompt.setTitle("Nearest to 20");
            prompt.setCancelable(false);
            prompt.setMessage(String.valueOf(nearest));
            prompt.setPositiveButton("DONE", (dialog, which) -> {
                firstTextfield.setText("");
                secondTextfield.setText("");
                thirdTextfield.setText("");
                toastObject.setText(R.string.process_done);
                toastObject.show();
            });
            prompt.setNegativeButton("RETYPE", (dialog, which) -> {
                toastObject.setText(R.string.modify_your_input);
                toastObject.show();
            });

            prompt.show();

        });
    }
}