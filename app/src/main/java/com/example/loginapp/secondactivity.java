package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class secondactivity extends AppCompatActivity {

    TextView tvName,tvBirthday,tvNumPhone,tvAddress;

    public final static String Message_key = "com.example.loginapp.message_key";
    public final static String Birth_key = "com.example.loginapp.Birth_key";
    public final static String Addre_key = "com.example.loginapp.Addre_key";
    public final static String NoTel_key = "com.example.loginapp.NoTel_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);

        Intent intent = getIntent();
        //String message = intent.getStringExtra(Message_key);
        //String txt1 = intent.getStringExtra(Birth_key);

        String str = intent.getStringExtra(Message_key);
        tvName = (TextView) findViewById(R.id.name);
        tvName.setText(str);

        String Birth = intent.getStringExtra(Birth_key);
        tvBirthday = (TextView) findViewById(R.id.tvBirthday);
        tvBirthday.setText(Birth);

        String address = intent.getStringExtra(NoTel_key);
        tvAddress = (TextView)findViewById(R.id.tvPhoneNo);
        tvAddress.setText(address);

        String numPhone = intent.getStringExtra(Addre_key);
        tvNumPhone= (TextView)findViewById(R.id.tvAddress);
        tvNumPhone.setText(numPhone);



    }
    }