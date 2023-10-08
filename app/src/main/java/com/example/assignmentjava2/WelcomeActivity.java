package com.example.assignmentjava2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content view to your custom layout
        setContentView(R.layout.welcome_page);

        // You can also initialize your views here if needed
        // For example, if you have a button in your layout:
        // Button myButton = findViewById(R.id.my_button);
    }
}
