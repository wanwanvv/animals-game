package com.example.animals_game;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class GreatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_great);
        final TextView greatView = findViewById(R.id.great);
        Typeface textFont2 = Typeface.createFromAsset(getAssets(), "Fonts/Elgethy Est Square.ttf");
        greatView.setTypeface(textFont2);

    }
    public void btnClick_share(View view) {
        Intent intent = new Intent(GreatActivity.this, LikeActivity.class);
        startActivity(intent);
    }

    public void btnClick_return(View view)
    {
        Intent intent = new Intent(GreatActivity.this, MainActivity.class);
        startActivity(intent);
    }
}