package com.example.animals_game;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Myapplication myApp;//声明一个对象
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myApp = (Myapplication) getApplication();
        myApp.setvalue(0);
        int orientation = getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.layout_land);
        } else if (orientation == Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.activity_main);
        }

        final TextView titleView= findViewById(R.id.title);
        Typeface textFont1 = Typeface.createFromAsset(getAssets(), "Fonts/Elgethy Est Square.ttf");
        titleView.setTypeface(textFont1);
        Typeface buttonFont = Typeface.createFromAsset(getAssets(), "Fonts/04B_03.ttf");
        Button p_button=findViewById(R.id.play_button);
        Button s_button=findViewById(R.id.settings_button);
        p_button.setTypeface(buttonFont);
        s_button.setTypeface(buttonFont);

        p_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PlayActivity.class);
                startActivity(intent);
            }
        });

    }
}
