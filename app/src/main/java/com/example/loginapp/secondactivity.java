package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class secondactivity extends AppCompatActivity {

    public final static String Message_key = "com.example.loginapp.message_key";
    public final static String Birth_key = "com.example.loginapp.Birth_key";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        String message = intent.getStringExtra(Message_key);
        String birthtxt = intent.getStringExtra(Birth_key);

        ImageView imageView = new ImageView(this);

        TextView textView = new TextView(this);
        textView.setTextSize(20);
        textView.setText("Name : " +message+ "\nBirthday : "+birthtxt);

        setContentView(imagetextView);
    }
}