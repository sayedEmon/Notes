package com.example.hp.note;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class SpalshScreen extends AppCompatActivity {
 private ProgressBar progressBar;
 private int progress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalsh_screen);

        progressBar =findViewById(R.id.ProgressViewId);

        Thread thread =new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
                startApp();
            }
        });
        thread.start();
    }


    public void doWork()
    {
        for(progress=20;progress<=100;progress=progress+20)
        {
            try {
                Thread.sleep(1000);
                progressBar.setProgress(progress);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void startApp(){

        Intent intent =new Intent(SpalshScreen.this,MainActivity.class);
        startActivity(intent);
        finish();

    }
}
