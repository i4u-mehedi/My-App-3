package com.example.myfristapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView nameTextView;
    private TextView agetextview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameTextView =(TextView) findViewById(R.id.nameTextViewId);
        agetextview = (TextView) findViewById(R.id.ageTextViewId);
        nameTextView.setText ("Mehedi Hasan");
        agetextview.setText  ("19 years old");

    }
}
