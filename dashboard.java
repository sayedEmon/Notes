package com.example.hp.note;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class dashboard extends AppCompatActivity {
 private ImageView cse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        cse = findViewById(R.id.cseViewId);
        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.equals(cse))
                {
                    Intent intent =new Intent(dashboard.this,CseDashboard.class);
                    startActivity(intent);

                }
            }
        });
    }
}
