package com.example.animals_game;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
public class LikeActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_like);

    }
    public void btnClick_t(View view) {
        Intent intent = new Intent(LikeActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
