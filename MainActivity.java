package com.example.hp.note;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button loginButton ,SignUpButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        loginButton =findViewById(R.id.loginViewId);
        SignUpButton= findViewById(R.id.signupViewId);

        SignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(v.equals(SignUpButton))
                {
                    Intent intent =new Intent(MainActivity.this,signup.class);
                    startActivity(intent);
                }


            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.equals(loginButton))
                {
                    Intent intent =new Intent(MainActivity.this,dashboard.class);
                    startActivity(intent);

                }
            }
        });
    }
}
