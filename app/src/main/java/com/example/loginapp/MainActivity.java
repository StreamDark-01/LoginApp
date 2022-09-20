package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etName;
    Button btnName;
    public final static String Message_key = "com.example.loginapp.message_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void send_data(View view)
    {
        etName = findViewById(R.id.etName);
        btnName = findViewById(R.id.btnName);
        String message = etName.getText().toString();
        Intent intent  = new Intent(MainActivity.this,secondactivity.class);

        intent.putExtra(Message_key,message);
        startActivity(intent);



    }


}