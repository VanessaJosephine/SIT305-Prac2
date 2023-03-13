package com.example.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button clickButton;
    EditText nameText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clickButton = findViewById(R.id.button);
        nameText = findViewById(R.id.editTextTextPersonName);
        textView = findViewById(R.id.textView);

        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Get the value of nameText and put it in a variable
                String name = nameText.getText().toString();
                //Change the value of textView
                if (!name.isEmpty())
                {
                    //Create a Toast to display name
                    Toast.makeText(MainActivity.this, "Hi again, " + name, Toast.LENGTH_LONG).show();
                    textView.setText("Welcome to SIT305, " + name);
                }
                else
                {
                    textView.setText("Please enter your name!");
                }
            }
        });
    }
}