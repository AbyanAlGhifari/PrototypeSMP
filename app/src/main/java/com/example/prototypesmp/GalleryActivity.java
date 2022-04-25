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
    public void outingclass(View view) {
        Intent intent = new Intent(GalleryActivity.this, OutingActivity.class);
        startActivity(intent);
    }
    public void studytour(View view) {
        Intent intent = new Intent(GalleryActivity.this, StudyActivity.class);
        startActivity(intent);
    }
    public void kerjabakti(View view) {
        Intent intent = new Intent(GalleryActivity.this, KerjaActivity.class);
        startActivity(intent);
    }
}
