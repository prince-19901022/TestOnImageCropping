package com.example.neutrino.testonimagecropping;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mWindowTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWindowTextView = (TextView) findViewById(R.id.tv_window);
    }

    private void getPixelFrom(int dp){

        //dp = (width in pixels * 160) / screen density from material design
        float density = getResources().getDisplayMetrics().density;
        

    }

    private void getXYcoordinate(){


    }

    private void createSourceBitmap(){

    }

    private void extractOutputBitmap(){

    }
}
