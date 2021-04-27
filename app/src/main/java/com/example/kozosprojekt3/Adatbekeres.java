package com.example.kozosprojekt3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Adatbekeres extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nev=findViewById(R.id.neve);
        EditText szuldat=findViewById(R.id.szuldat);
        EditText szigszam=findViewById(R.id.szigszan);

        Button kuldes=findViewById(R.id.send);

        kuldes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Adatbekeres.this,  harmadikprojekt.class );
                i.putExtra("nev", nev.getText().toString());
                i.putExtra("szuldat", szuldat.getText().toString());
                i.putExtra("szigszam", szigszam.getText().toString());
                startActivity(i);
            }
        });
    }
}