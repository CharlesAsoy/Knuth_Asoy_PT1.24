package com.example.myapplicationtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView myTitle;
    TextView myName;
    EditText myInput;
    TextView myDisplay;
    Button myClick;
    Button myClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        myTitle = findViewById(R.id.txtTitle);
        myInput = findViewById(R.id.txtInputName);
        myName = findViewById(R.id.txtName);
        myDisplay = findViewById(R.id.txtDisplay);
        myClick = findViewById(R.id.btnClick);
        myClear = findViewById(R.id.btnClear);

        myDisplay.setText("Hello World!");

        myClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = myInput.getText().toString();
                myDisplay.setText("Hello "+name+"!");
            }
        });
        myClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDisplay.setText("Hello World!");

            }
        });
    }
}