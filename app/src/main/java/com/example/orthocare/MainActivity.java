package com.example.orthocare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView toothdecay, oralhygiene, gumdisease;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toothdecay = (ImageView) findViewById(R.id.toothdecay);
        oralhygiene = (ImageView) findViewById(R.id.oralhygiene);
        gumdisease = (ImageView) findViewById(R.id.gumdisease);
    }

    public void onClickToothDecay(View view) {
        Intent intent = new Intent(MainActivity.this, ToothDecay.class);
        startActivity(intent);
    }

    public void onClickOralHygiene(View view) {
        Intent intent = new Intent(MainActivity.this, OralHygiene.class);
        startActivity(intent);
    }

    public void onClickGumDisease(View view) {
        Intent intent = new Intent(MainActivity.this, GumDisease.class);
        startActivity(intent);
    }

    public void onClickToothWear(View view) {
        Intent intent = new Intent(MainActivity.this, ToothWear.class);
        startActivity(intent);
    }

    public void onClickDietTeeth(View view) {
        Intent intent = new Intent(MainActivity.this, DietTeeth.class);
        startActivity(intent);
    }

    public void onClickChildrensTeeth(View view) {
        Intent intent = new Intent(MainActivity.this, ChildrensTeeth.class);
        startActivity(intent);
    }
}