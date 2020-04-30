package com.example.surajit.stopwatch_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class splash extends AppCompatActivity{
    ImageView screenimg;
    ImageView logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        screenimg=(ImageView)findViewById(R.id.imageView);
        logo=(ImageView)findViewById(R.id.imageView2);
        setContentView(R.layout.splash);
        Thread timer=new Thread(){
        public void run(){
            try {
                sleep(4000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            finally {
                Intent openMainActivity=new Intent(splash.this,MainActivity.class);
                startActivity(openMainActivity);
            }
        }
        };
        timer.start();
    }
}
