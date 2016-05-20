package com.usaa.interview;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.usaa.interview.adapter.PersonAdapter;

public class Challenge1Activity extends AppCompatActivity {

    TextView title;
    RecyclerView listView;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge1);
        title = (TextView)findViewById(R.id.title);
        listView = (RecyclerView)findViewById(R.id.list_view);
        title.setText("Challenge 1");
        listView.setAdapter(new PersonAdapter());
        listView.setLayoutManager(new LinearLayoutManager(this));
        fab = (FloatingActionButton)findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Hello World", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
