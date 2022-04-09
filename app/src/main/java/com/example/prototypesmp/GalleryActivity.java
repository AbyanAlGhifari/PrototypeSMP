package com.example.prototypesmp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class GalleryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery);
    }
    public void pramuka(View view) {
        Intent intent = new Intent(GalleryActivity.this, PramukaActivity.class);
        startActivity(intent);
    }
    public void upacara(View view) {
        Intent intent = new Intent(GalleryActivity.this, UpacaraActivity.class);
        startActivity(intent);
    }
}
