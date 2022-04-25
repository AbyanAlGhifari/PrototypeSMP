package com.example.prototypesmp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class PrestasiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prestasi);
    }
    public void akademik(View view) {
        Intent intent = new Intent(PrestasiActivity.this, AkaActivity.class);
        startActivity(intent);
    }
    public void nonakademik(View view) {
        Intent intent = new Intent(PrestasiActivity.this, AkasActivity.class);
        startActivity(intent);
    }
    public void piala(View view) {
        Intent intent = new Intent(PrestasiActivity.this, PialaActivity.class);
        startActivity(intent);
    }
}

