package com.example.animals_game;
import android.app.Application;

public class Myapplication extends Application{
    public int score;
    @Override
    public void onCreate() {
        // TODO Auto-generated method stub
        super.onCreate();
        setvalue(0);
    }

    //实现setname()方法，设置变量的值
    public void setvalue(int svalue) {
        this.score = svalue;
    }

    //实现getname()方法，获取变量的值
    public int getvalue() {
        return score;
    }
}
