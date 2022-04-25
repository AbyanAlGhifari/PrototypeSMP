package com.example.prototypesmp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
    }
    public void profiles(View view) {
        Intent intent = new Intent(ProfileActivity.this, ProfilePActivity.class);
        startActivity(intent);
    }
    public void info(View view) {
        Intent intent = new Intent(ProfileActivity.this, ProfileIActivity.class);
        startActivity(intent);
    }
    public void visimisi(View view) {
        Intent intent = new Intent(ProfileActivity.this, ProfileVMActivity.class);
        startActivity(intent);
    }
}

