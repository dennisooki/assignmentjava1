package com.example.assignmentjava2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CreateAccount extends AppCompatActivity {

    ImageView imageView;
    EditText editTextEmail, editTextPassword;
    Button buttonRegister;
    TextView editTextRetypePassword, textViewLogIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_account_page);

        imageView = findViewById(R.id.imageView);
        editTextEmail = findViewById(R.id.editTextTextEmailAddress);
        editTextPassword = findViewById(R.id.editTextTextPassword);
        editTextRetypePassword = findViewById(R.id.editTextTextPassword1);
        buttonRegister = findViewById(R.id.button);
        textViewLogIn = findViewById(R.id.textView);

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the text from the password field
                String password = editTextPassword.getText().toString();
                String passwordRetype = editTextRetypePassword.getText().toString();

                // Check if the password field is empty
                if(passwordRetype.isEmpty() || password.isEmpty()) {
                    // Show an error message
                    Toast.makeText(getApplicationContext(), "One or both of the password fields is empty", Toast.LENGTH_SHORT).show();
                } else if (!password.equals(passwordRetype)) {
                    Toast.makeText(getApplicationContext(), "Bro those passwords dont match", Toast.LENGTH_SHORT).show();

                } else {
                    // Handle login logic here
                    Intent intent = new Intent(getApplicationContext(), WelcomeActivity.class);

                    // Start the new activity
                    startActivity(intent);
                }
            }
        });


        editTextRetypePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle create account logic here

            }
        });

        textViewLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // new intent
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                //start intent
                startActivity(intent);
            }
        });

    }
}
