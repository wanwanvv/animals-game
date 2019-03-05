package com.example.animals_game;

import android.content.Intent;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayActivity extends AppCompatActivity implements View.OnClickListener{
    Myapplication myapplication;//声明一个对象
    int pic=0;
    int pscore=0;
    static String show_core="0";
    int index=0;
    String animals[]={"Fish","Bird","Pig","Cat"};
    // ImageView组件
    ImageView pic1;
    ImageView pic2;
    ImageView pic3;
    ImageView pic4;
    TextView chooseView;
    TextView scoreView;
    //定义一个保存全部图片ID的数组
    int[] imageIds = new int[]{R.drawable.bird_clicked, R.drawable.cat_clicked,R.drawable.fish_clicked,R.drawable.pig_clicked};
    int[] animalIds = new int[]{R.drawable.fish_clicked, R.drawable.bird_clicked,R.drawable.pig_clicked,R.drawable.cat_clicked};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_play);
        //获取所选图片单词的TextView
        chooseView= findViewById(R.id.choose_picture);
        chooseView.setText(animals[index]);
        //获取score的TextView
        scoreView= findViewById(R.id.s_score);
        Typeface textFont4 = Typeface.createFromAsset(getAssets(), "Fonts/04B_03.ttf");
        chooseView.setTypeface(textFont4);

        myapplication = (Myapplication) getApplication();
        pscore=myapplication.getvalue();
        show_core=String.valueOf(pscore);
        scoreView.setText(show_core);

        //获取ImageView组件

        //为杯子添加单击事件监听
        pic1 = findViewById(R.id.picture1);
        pic2 = findViewById(R.id.picture2);
        pic3 = findViewById(R.id.picture3);
        pic4 = findViewById(R.id.picture4);
        pic1.setOnClickListener(this);
        pic2.setOnClickListener(this);
        pic3.setOnClickListener(this);
        pic4.setOnClickListener(this);

        //Intent intent = new Intent(PlayActivity.this, GreatActivity.class);
        //startActivity(intent);


        /**
        while(index<=3)
        {
            chooseView.setText(animals[index]);

            pic1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    pic1.setImageDrawable(getResources().getDrawable(R.drawable.bird_clicked));
                    if(animalIds[index]==imageIds[0])
                    {
                        score++;
                        index++;
                        show_core=String.valueOf(score);
                        scoreView.setText(show_core);
                    }
                    else
                    {
                        Intent intent = new Intent(PlayActivity.this, OverActivity.class);
                        startActivity(intent);
                    }
                }
            });

            pic2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    pic2.setImageDrawable(getResources().getDrawable(R.drawable.cat_clicked));
                    if(animalIds[index]==imageIds[1])
                    {
                        score++;
                        index++;
                        show_core=String.valueOf(score);
                        scoreView.setText(show_core);
                    }
                    else
                    {
                        Intent intent = new Intent(PlayActivity.this, OverActivity.class);
                        startActivity(intent);
                    }
                }
            });

            pic3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    pic3.setImageDrawable(getResources().getDrawable(R.drawable.fish_clicked));
                    if(animalIds[index]==imageIds[2])
                    {
                        score++;
                        index++;
                        show_core=String.valueOf(score);
                        scoreView.setText(show_core);
                    }
                    else
                    {
                        Intent intent = new Intent(PlayActivity.this, OverActivity.class);
                        startActivity(intent);
                    }
                }
            });

            pic4.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    pic4.setImageDrawable(getResources().getDrawable(R.drawable.pig_clicked));
                    if(animalIds[index]==imageIds[3])
                    {
                        score++;
                        index++;
                        show_core=String.valueOf(score);
                        scoreView.setText(show_core);
                    }
                    else
                    {
                        Intent intent = new Intent(PlayActivity.this, OverActivity.class);
                        startActivity(intent);
                    }
                }
            });
        }
        Intent intent = new Intent(PlayActivity.this, GreatActivity.class);
        startActivity(intent);
        **/

    }
    @Override
    public void onClick(View view) {
        //获得对象
        //myapplication = (Myapplication) getApplication();
        switch (view.getId())
        {
            case R.id.picture1:
                pic1.setImageDrawable(getResources().getDrawable(R.drawable.bird_clicked));
                pic=0;
                new game().execute();
                break;
            case R.id.picture2:
                pic2.setImageDrawable(getResources().getDrawable(R.drawable.cat_clicked));
                pic=1;
                new game().execute();
                break;
            case R.id.picture3:
                pic3.setImageDrawable(getResources().getDrawable(R.drawable.fish_clicked));
                pic=2;
                new game().execute();
                break;
            case R.id.picture4:
                pic4.setImageDrawable(getResources().getDrawable(R.drawable.pig_clicked));
                pic=3;
                new game().execute();
                break;

        }


    }
    private class game extends AsyncTask<String,Void,String>{
        @Override
        protected String doInBackground(String...params) {
            if(animalIds[index]==imageIds[pic])
            {
                myapplication = (Myapplication) getApplication();
                pscore=myapplication.getvalue();
                pscore++;
                myapplication.setvalue(pscore);
                index++;
                show_core=String.valueOf(pscore);
                //scoreView.setText(show_core);
                return show_core;
            }
            else
            {
                Intent intent = new Intent(PlayActivity.this, OverActivity.class);
                startActivity(intent);
            }
            return null;
        }
        @Override
        protected void onPostExecute(String s_score) {
            if(pscore<=3) {
                scoreView.setText(s_score);
                chooseView.setText(animals[index]);
            }

            else
            {
                Intent intent = new Intent(PlayActivity.this, GreatActivity.class);
                startActivity(intent);
            }


        }


    }


        }
