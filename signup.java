package com.example.hp.note;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class signup extends AppCompatActivity {


    private Button  submitButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        submitButton=findViewById(R.id.submitViewId);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.equals(submitButton))
                {
                    Toast.makeText(signup.this,"Thank you for Your information",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
