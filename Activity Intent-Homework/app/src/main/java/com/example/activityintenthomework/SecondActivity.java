package com.example.activityintenthomework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textView,heading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = findViewById(R.id.article_article);
        heading=findViewById(R.id.article_subheading);

        Intent intent = getIntent();
        String msg = intent.getStringExtra("MSG");

        if(msg.equals("one")){
            textView.setText(R.string.article_article);
            heading.setText(R.string.article_subtitle_one);
        }
        if(msg.equals("two")){
            textView.setText(R.string.article_two);
            heading.setText(R.string.article_subtitle_two);
        }
        if(msg.equals("three")){
            textView.setText(R.string.article_three);
            heading.setText(R.string.article_subtitle_three);
        }



    }
}