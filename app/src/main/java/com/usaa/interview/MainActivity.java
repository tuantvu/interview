package com.usaa.interview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View challenge1 = findViewById(R.id.link_challenge_1);
        View challenge2 = findViewById(R.id.link_challenge_2);
        challenge1.setOnClickListener(this);
        challenge2.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.link_challenge_1) {
            Intent i = new Intent(this, Challenge1Activity.class);
            startActivity(i);
        }
        else if (v.getId() == R.id.link_challenge_2) {
            Intent i = new Intent(this, Challenge2Activity.class);
            startActivity(i);
        }
    }
}
