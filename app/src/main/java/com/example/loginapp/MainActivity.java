package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    EditText etName;
    Button btnName;
    EditText etBirth;
    EditText date;
    DatePickerDialog datePickerDialog;


    public final static String Message_key = "com.example.loginapp.message_key";
    public final static String Birth_key = "com.example.loginapp.Birth_key";
    public final static String Date_key = "com.example.loginapp.Date_key";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        date = (EditText) findViewById(R.id.etBirth);
        // perform click event on edit text
        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // calender class's instance and get current date , month and year from calender
                final Calendar c = Calendar.getInstance();
                int mYear = c.get(Calendar.YEAR); // current year
                int mMonth = c.get(Calendar.MONTH); // current month
                int mDay = c.get(Calendar.DAY_OF_MONTH); // current day
                // date picker dialog
                datePickerDialog = new DatePickerDialog(MainActivity.this,
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {
                                // set day of month , month and year value in the edit text
                                date.setText(dayOfMonth + "/"
                                        + (monthOfYear + 1) + "/" + year);

                            }
                        }, mYear, mMonth, mDay);
                datePickerDialog.show();
            }
        });
    }
    public void send_data(View view)
    {
        etName = findViewById(R.id.etName);
        btnName = findViewById(R.id.btnName);
        etBirth = findViewById(R.id.etBirth);
        //date = findViewById( R.id.date);


        String message = etName.getText().toString();
        String birthtxt = etBirth.getText().toString();
        String dateTxt = date.getText().toString();


        Intent intent  = new Intent(MainActivity.this,secondactivity.class);
        intent.putExtra(Message_key,message);
        intent.putExtra(Birth_key,birthtxt);
        intent.putExtra(Date_key,dateTxt);
        startActivity(intent);




    }


}