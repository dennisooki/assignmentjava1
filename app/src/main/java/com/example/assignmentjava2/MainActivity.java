package com.example.assignmentjava2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    EditText editTextEmail, editTextPassword;
    Button buttonLogin;
    TextView textViewCreateAccount, textViewChangePassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);

        imageView = findViewById(R.id.imageView);
        editTextEmail = findViewById(R.id.editTextTextEmailAddress);
        editTextPassword = findViewById(R.id.editTextTextPassword);
        buttonLogin = findViewById(R.id.button);
        textViewCreateAccount = findViewById(R.id.textView);
        textViewChangePassword = findViewById(R.id.textView2);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle login logic here
                Intent intent = new Intent(getApplicationContext(), WelcomeActivity.class);

                // Start the new activity
                startActivity(intent);
            }
        });

        textViewCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle create account logic here
                Intent intent = new Intent(getApplicationContext(), CreateAccount.class);

                startActivity(intent);
            }
        });

        textViewChangePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle change password logic here
                Intent intent = new Intent(getApplicationContext(), ChangePwdActivity.class);

                startActivity(intent);
            }
        });
    }
}
