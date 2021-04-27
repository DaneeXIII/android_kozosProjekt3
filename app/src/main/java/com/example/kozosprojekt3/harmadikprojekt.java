package com.example.kozosprojekt3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class harmadikprojekt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harmadikprojekt);
        TextView adat=findViewById(R.id.adat);
        Bundle adats = getIntent().getExtras();

        adat.setText((adats.getString("nev")) + (adats.getString("szuldat")) + (adats.getString("szigszam")));


    }
}