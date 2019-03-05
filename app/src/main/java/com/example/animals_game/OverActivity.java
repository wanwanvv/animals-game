package com.example.animals_game;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class OverActivity extends AppCompatActivity {
    int sco=0;
    String sh_score="0";
    Myapplication myappl;//声明一个对象

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_over);
        final TextView overView= findViewById(R.id.game_over);
        Typeface textFont3 = Typeface.createFromAsset(getAssets(), "Fonts/Elgethy Est Square.ttf");
        overView.setTypeface(textFont3);
        myappl = (Myapplication) getApplication();
        sco=myappl.getvalue();
        sh_score=String.valueOf(sco);
        TextView scoView=findViewById(R.id.over_score);
        scoView.setText(sh_score);
    }
    public void btnClick_sh(View view) {
        Intent intent = new Intent(OverActivity.this, LikeActivity.class);
        startActivity(intent);
    }
    public void btnClick_re(View view) {
        Intent intent = new Intent(OverActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
