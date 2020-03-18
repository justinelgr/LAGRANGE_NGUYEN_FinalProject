package fr.esilv.lagrange_nguyen_finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void whatIsGG(View view){
        Intent intent = new Intent(this, WhatIsGG.class);
        startActivity(intent);
    }

    public void mainCharacters(View view){
        Intent intent = new Intent(this, WhichCharacter.class);
        startActivity(intent);
    }

    public void seasonsTrailers(View view){
        Intent intent = new Intent(this, SeasonsTrailers.class);
        startActivity(intent);
    }
}
