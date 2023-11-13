package com.example.dialog_and_intent_aquino_froilan;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
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
        EditText firstTextfield = (EditText) findViewById(R.id.firstNumberTextField);
        EditText secondTextfield = (EditText) findViewById(R.id.secondNumberTextField);
        EditText thirdTextfield = (EditText) findViewById(R.id.thirdNumberTextField);
        Button getNearest = (Button) findViewById(R.id.getNearest);

        getNearest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstNumber = Integer.parseInt(firstTextfield.getText().toString());
                int secondNumber = Integer.parseInt(secondTextfield.getText().toString());
                int thirdNumber = Integer.parseInt(thirdTextfield.getText().toString());

                AlertDialog.Builder prompt = new AlertDialog.Builder(NearestValueTo20Input.this);
                prompt.setTitle("Nearest to 20");
                prompt.setMessage("Do you want to discard?");
                prompt.setCancelable(false);
                prompt.show();
                prompt.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast note = new Toast(NearestValueTo20Input.this);
                        note.setText(R.string.process_done);
                        note.show();
                    }
                });
            }
        });
    }
}