package com.example.viplove.music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView hindi = (TextView) findViewById(R.id.hindi);
        hindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hindii = new Intent(MainActivity.this, HindiActivity.class);
                startActivity(hindii);
            }
        });
        TextView english = (TextView) findViewById(R.id.english);
        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent englishi = new Intent(MainActivity.this, EnglishActivity.class);
                startActivity(englishi);
            }
        });
    }
}
