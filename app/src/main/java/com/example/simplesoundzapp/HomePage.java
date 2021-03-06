package com.example.simplesoundzapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.simplesoundzapp.R;

public class HomePage extends AppCompatActivity {
    ImageView homepic;
    private Button simplesoundzimg;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        homepic = (ImageView) findViewById(R.id.homepic);
        simplesoundzimg = (Button) findViewById(R.id.simplesoundzimg);
        simplesoundzimg.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openSoundDrawer();
            }
        });
    }

    public void openSoundDrawer(){
        Intent intent = new Intent(this, SimpleSoundz.class);
        startActivity(intent);
    }
}
